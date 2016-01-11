package EV3j;

import java.io.*;


public abstract class EV3Device {

    public String name;
    public String address;
    protected Boolean connected;
    protected short msgCounter; // message getNextMsgNumber should increment with every message sent to brick

    public EV3Device(String name) {
        this.name = name;
        //this.address = address;
        connected = false;
        msgCounter = 0;
    }

    public void connect(String URL) throws EV3DeviceException {connected = true;}
    public void disconnect() throws EV3DeviceException {connected = false;}
    public Boolean isConnected() { return connected;}

    public abstract void sendCmd(byte[] msg) throws EV3DeviceException;

    public void sendCmd(EV3CmdDir msg) throws EV3DeviceException {
        sendCmd(msg.toByteArray());
    };

    public void sendCmd(EV3CmdSys msg) throws EV3DeviceException {
        sendCmd(msg.toByteArray());
    };

    public abstract byte[] readReply() throws EV3DeviceException;

    public void validateReply(byte[] reply) throws EV3DeviceException {
        short msgNo = 0;

        //TODO: check message number coming from brick
        // not checking for now - not sure how message numbering works...
        if (false) {
            // check if reply message no# is the expected one - it should be equal to msgCounter
            msgNo = (short) (reply[2] | (reply[3] << 8));

            if (msgNo != msgCounter) // this condition is just an example TODO:
                throw new EV3DeviceException(
                        EV3DeviceException.ERR_MSG_OUT_OF_SYNC,
                        "Received message having wrong msg number. Expected " + msgCounter + " Received " + msgNo);

        }
    }

    // Increment message counter so the next packet sent to brick has higher message number
    public short getNextMsgNumber() {
        return msgCounter++;
    }

    // Read from brick
    // Method has timeout and minimum byte count to be read implemented
    protected byte[] readFrom(InputStream fromDevice, int minRead, long timeout) throws EV3DeviceException {
        int maxsize = 10000;
        int r = 0;
        int blocksize = 0;
        byte[] buffer = new byte[maxsize];
        ByteArrayOutputStream data = new ByteArrayOutputStream();
        long timer = System.currentTimeMillis();

        try {

            // brick requires some time to process data in order to send reply, so let's wait
            while ((fromDevice.available() < minRead) && (System.currentTimeMillis() < (timer+timeout) )){
                Thread.sleep(100);               // wait some time before further attempt
            }
            if (fromDevice.available() < minRead)
                throw new EV3DeviceException(
                        EV3DeviceException.ERR_READ,
                        "Expected more data to read. Expected at least "+minRead+" bytes. Available "+fromDevice.available()+" bytes.");

            blocksize = fromDevice.available(); // check how many is available
            while (blocksize > 0) {
                // do not read more than maxsize
                if (blocksize > maxsize)
                    blocksize = maxsize;

                r = fromDevice.read(buffer, 0, blocksize);
                data.write(buffer,0,r);
                blocksize = fromDevice.available();
            }
        } catch (IOException e) {
            throw new EV3DeviceException(
                    EV3DeviceException.ERR_READ,
                    "Error reading data from ["+ name + "@" + address + "]", e);
        } catch(InterruptedException ex) {
            Thread.currentThread().interrupt();

        }

        return data.toByteArray();

    }

    protected byte[] readFrom(InputStream fromDevice) throws EV3DeviceException {
        return readFrom(fromDevice, 1, 3000); // expect at least 1 byte within 3000 ms by default
    }

    // run file/program already stored at brick's filesystem
    public void runFile(String remoteFileName) throws EV3DeviceException {
        EV3CmdDir cmd = new EV3CmdDir(BC.CMD_TYPE_DIRECT_COMMAND_REPLY);
        byte[] reply;
        try {
            cmd.write(SC.opFile_Start(remoteFileName));
            cmd.setMsgNumber(this.getNextMsgNumber());
            sendCmd(cmd);

            reply = readReply();

            if (reply[4] == BC.CMD_TYPE_DIRECT_REPLY_ERROR)
                throw new EV3CmdException(
                        EV3CmdException.ERR_RUN_FAILED,
                        "Brick returned error. ("+BC.CMD_TYPE_DIRECT_REPLY_ERROR+")");

        } catch (IOException| EV3CmdException e) {
            throw new EV3DeviceException(
                    EV3DeviceException.ERR_CMD_FAILED,
                    "Failed to run file '"+remoteFileName+"' on ["+ name + "@" + address + "]", e);
        }
    }

    // send file to brick
    // localFileName - file to be sent to brick
    // remoteFileName - destination file
    public void downloadToBrick(String localFileName, String remoteFileName) throws EV3DeviceException {
        EV3CmdSys cmd = new EV3CmdSys(BC.CMD_TYPE_SYSTEM_COMMAND_REPLY);
        byte[] reply;
        byte handle;
        int bufRead = 10000;
        byte[] buffer = new byte[bufRead];
        File f;
        FileInputStream fs;

        // check if brick is connected
        if (!this.isConnected())
            throw new EV3DeviceException((
                    EV3DeviceException.ERR_DEV_NOT_CONNECTED),
                    "Brick not connected. Please, connect before issuing any command.");

        try {
            // get input file size
            f = new File(localFileName);
            fs = new FileInputStream(f);

            cmd.write(SC.opFileDownloadBegin(remoteFileName,(int)f.length()));

            // send command initiating file download to brick
            this.sendCmd(cmd);

            while (true) {

                // get file handle from brick reply
                reply = readReply();
                if (reply[4] == BC.CMD_TYPE_SYSTEM_REPLY_ERROR){
                    throw new EV3CmdException(EV3CmdException.ERR_DOWNLOAD_FAILED,
                            "Brick replied download cmd:"+reply[5]+", reply code: "+reply[6]);
                }

                handle = reply[7];  // handle

                // send max 10k chunks of data to brick until whole file is downloaded
                if (fs.available() > 0) {
                    cmd.reset();

                    bufRead = fs.read(buffer); // read max 10k chunk
                    cmd.write(SC.opFileDownloadContinue(handle, buffer, bufRead));

                    this.sendCmd(cmd);
                } else
                    break;  // if nothing more to send then exit loop

            }

            fs.close();

        } catch (IOException e) {
            throw new EV3DeviceException(EV3DeviceException.ERR_IO, "Brick communication error.", e);

        } catch (EV3CmdException e) {
            throw new EV3DeviceException(EV3DeviceException.ERR_CMD_FAILED, "Brick command failed.", e);

        }


    }




 }
