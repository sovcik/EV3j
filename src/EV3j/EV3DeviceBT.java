package EV3j;

import javax.microedition.io.Connector;
import javax.microedition.io.StreamConnection;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * Created by Jozef on 04.01.2016.
 */
public class EV3DeviceBT extends EV3Device {

    protected StreamConnection streamConnection;
    protected OutputStream outStream;
    protected InputStream inStream;


    public EV3DeviceBT (String n) {
        super(n);
    }

    public void connect(String URL) throws EV3DeviceException {
        this.connect(URL, false);
    }

    public void connect(String URL, Boolean timeout) throws EV3DeviceException {

        try {
            // "true" enables timeout detection based on Java system property bluecove.connect.timeout
            // default timeout is 2 minutes (WIDCOMM and OSX)
            streamConnection = (StreamConnection) Connector.open(URL, Connector.READ_WRITE, timeout);
            outStream = streamConnection.openOutputStream();
            inStream = streamConnection.openInputStream();
        } catch (IOException e) {
            throw new EV3DeviceException(
                    EV3DeviceException.ERR_CANT_CONNECT,
                    "Error opening connection to [" + name + "@"+ address + "]\nvia: " + URL, e );
        }

        connected = true;
    }


    public void disconnect() throws EV3DeviceException {
        try {
            outStream.close();
            inStream.close();
            super.disconnect();
        } catch (IOException e){
            throw new EV3DeviceException(
                    EV3DeviceException.ERR_CANT_DISCONNECT,
                    "Error closing connection to [" + name + "@"+ address + "]", e );
        }
    }

    public void sendCmd(byte[] msg) throws EV3DeviceException {
        try {
            outStream.write(msg);
            outStream.flush();
        } catch (IOException e) {
            throw new EV3DeviceException(
                    EV3DeviceException.ERR_WRITE,
                    "Error sending data to [" + name + "@"+ address + "]", e );
        }
    }

    public byte[] readReply() throws EV3DeviceException {
        byte[] reply;

        // read reply
        reply = readFrom(inStream);

        super.validateReply(reply);

        return reply;

    }





}
