package EV3j;

/**
 * Created by Jozef on 09.01.2016.
 */
public class Common {

    public static byte[] short2LEshort(short n) {
        byte[] buff = new byte[2];
        buff[0] = (byte) (n & 0xFF);
        buff[1] = (byte) ((n >> 8) & 0xFF);
        return buff;
    }

    public static short LEshort2short(byte[] buff){
        short n = 0;
        n = buff[1];
        n = (short) (n << 8);
        n = (short) (n | buff[0]);

        return n;
    }

    public static byte[] int2LEint(int n) {
        byte[] buff = new byte[4];
        buff[0] = (byte) (n & 0xFF);
        buff[1] = (byte) ((n >> 8) & 0xFF);
        buff[2] = (byte) ((n >> 16) & 0xFF);
        buff[3] = (byte) ((n >> 24) & 0xFF);
        return buff;
    }

    public static int LEint2int(byte[] buff){
        int n = 0;
        n = buff[3];
        n = (n << 8);
        n = (n | buff[2]);
        n = (n << 8);
        n = (n | buff[1]);
        n = (n << 8);
        n = (n | buff[0]);

        return n;
    }


}
