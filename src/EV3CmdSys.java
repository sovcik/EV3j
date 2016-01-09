package EV3j;

/**
 * Created by Jozef on 05.01.2016.
 */
public class EV3CmdSys extends EV3Cmd {

    protected byte lastCmd = 0;         // last command sent to brick

    public EV3CmdSys(){
        super();
    }

    public EV3CmdSys(byte t) {
        super(t);
    }




}
