package EV3j;

import java.io.IOException;

/**
 * Created by Jozef on 05.01.2016.
 */
public class EV3CmdDir extends EV3Cmd {

    public EV3CmdDir(){
        super();
        addVarsToHeader();
    }

    public EV3CmdDir(byte t) {
        super(t);
        addVarsToHeader();
    }

    public void reset() {
        super.reset();
        addVarsToHeader();
    }

    private void addVarsToHeader(){
        byte[] variables = new byte[2];
        try {
            write(variables);
        } catch (IOException e) {
            // quietly ignore - shouldn't happen :-)
        }

    }

    public void setLocalVariables(byte v){

    }

    public void setGlobalVariables(int v) {

    }

}
