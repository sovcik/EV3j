package EV3j;

/**
 * Created by Jozef on 09.01.2016.
 */
public class EV3CmdException extends Exception {

    public static final int ERR_NONE                = 0;
    public static final int ERR_CMD_TOO_LONG        = 1;

    public static final int ERR_RUN_FAILED          = 3;

    public static final int ERR_DOWNLOAD_FAILED     = 4;


    protected int code = ERR_NONE;

    public EV3CmdException(int code, String msg, Throwable cause) {
        super(msg, cause);
        this.code = code;
    }

    public EV3CmdException(int code, String msg) {
        super(msg);
        this.code = code;
    }


    public int getErrorCode() {
        return this.code;
    }

}
