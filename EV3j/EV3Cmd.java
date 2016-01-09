package EV3j;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

abstract class EV3Cmd extends ByteArrayOutputStream {

    protected ByteArrayOutputStream msg;
    public final int maxMsgSize = 0xFFFF; // brick requires messages to be max this long

    public EV3Cmd(){
        super();
        byte[] header = new byte[5]; // 2 bytes size + 2 bytes counter + 1 byte command type
        try {
            write(header);
        } catch (IOException e) {
            // quietly ignore - shouldn't happen :-)
        }
    }

    public EV3Cmd(byte cmdType){
        super();
        byte[] header = new byte[5]; // 2 bytes size + 2 bytes counter + 1 byte command type
        try {
            write(header);
        } catch (IOException e) {
            // quietly ignore - shouldn't happen :-)
        }

        setCmdType(cmdType);
    }



    // update message length in message header
    // (first two bytes formatted in Little Endian)
    private void updateMsgLength(){
        byte[] b2 = Common.short2LEshort((short)(count-2)); // message size excludes th first 2 bytes in which message size is provided
        System.arraycopy(b2,0,buf,0,2);
    }

    // update message number in message header
    // (byte 3 & 4 formatted in Little Endian)
    public void setMsgNumber(short n) {
        byte[] b2 = Common.short2LEshort(n);
        System.arraycopy(b2,0,buf,2,2);
    }

    public void setCmdType(byte c) {
        buf[4] = c; //5th byte is specifying command type
    }


    public void write(byte b) throws EV3CmdException {
        super.write(b);
        updateMsgLength();
        if (count > maxMsgSize)
            throw new EV3CmdException(EV3CmdException.ERR_CMD_TOO_LONG,
                    "Message too long. Maximum allowed message size is "+maxMsgSize);
    }

    public void write(byte[] b, int off, int len )  {
        super.write(b, off, len);
        updateMsgLength();
    }

    public void reset() {
        byte command_type = buf[4];
        super.reset();  //reset buffer
        try {
            write(new byte[5]);   // but keep command header
        } catch (IOException e) {
            // quietly ignore - shouldn't happen :-)
        }
        setCmdType(command_type); // and keep command type
    }



    //public void write(ByteArrayOutputStream b) throws IOException{
    //    b.writeTo(this);
    // }

}
