package EV3j;

/**
 * Created by Jozef on 04.01.2016.
 */
public class EV3DeviceException extends Exception {

    public static final int ERR_NONE                = 0;
    public static final int ERR_CANT_CONNECT        = 1;
    public static final int ERR_CANT_DISCONNECT     = 2;
    public static final int ERR_DEV_NOT_CONNECTED   = 3;
    public static final int ERR_READ                = 4;
    public static final int ERR_WRITE               = 5;
    public static final int ERR_CMD_FAILED          = 6;
    public static final int ERR_MSG_OUT_OF_SYNC     = 7;
    public static final int ERR_IO                  = 8;


    protected int code = ERR_NONE;

    public EV3DeviceException(int code, String msg, Throwable cause) {
        super(msg, cause);
        this.code = code;
    }

    public EV3DeviceException(int code, String msg) {
        super(msg);
        this.code = code;
    }


    public int getErrorCode() {
        return this.code;
    }

}
