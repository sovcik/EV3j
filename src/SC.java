package EV3j;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

/**
 * Created by Jozef on 05.01.2016.
 */
public class SC {

    public static byte[] opSound_Tone(int volume, int freq, int duration) {
        // example play 1000Hz TONE on volume 2 for 1000ms
        // opSOUND,LC0(TONE),LC1(2),LC2(1000),LC2(1000)
        // 94 01 81 02 82 E8 03 82 E8 03

        ByteArrayOutputStream oc = new ByteArrayOutputStream();

        try {
            oc.write(BC.opSOUND);
            oc.write(BC.LC0(BC.SOUND_SUB_TONE));
            oc.write(BC.LC1(volume));
            oc.write(BC.LC2(freq));
            oc.write(BC.LC2(duration));
        } catch (java.io.IOException e) {
            // quietly do nothing
        }

        return oc.toByteArray();
    }

    public static byte[] opSound_Ready (){
        ByteArrayOutputStream oc = new ByteArrayOutputStream();

        oc.write(BC.opSOUND_READY);

        return oc.toByteArray();
    }

    public static byte[] opSound_Break (){
        ByteArrayOutputStream oc = new ByteArrayOutputStream();

        oc.write(BC.opSOUND);
        oc.write(BC.LC0(BC.SOUND_SUB_BREAK));

        return oc.toByteArray();
    }

    public static byte[] opSound_Play (int volume, String filename){
        ByteArrayOutputStream oc = new ByteArrayOutputStream();

        try {
            oc.write(BC.opSOUND);
            oc.write(BC.LC0(BC.SOUND_SUB_PLAY));
            oc.write(BC.LCS(filename));
        } catch (java.io.IOException e) {
            // quietly do nothing - it should not happen
        }
        return oc.toByteArray();
    }

    public static byte[] opSound_Repeat (int volume, String filename){
        ByteArrayOutputStream oc = new ByteArrayOutputStream();

        try {
            oc.write(BC.opSOUND);
            oc.write(BC.LC0(BC.SOUND_SUB_REPEAT));
            oc.write(BC.LCS(filename));
        } catch (java.io.IOException e) {
            // quietly do nothing - it should not happen
        }
        return oc.toByteArray();
    }

    public static byte[] opFile_Start(String filename){
        /*
        opFILE                  // Opcode file related
        LC0(LOAD_IMAGE)         // Command encoded as single byte constant
        LC2(USER_SLOT)          // User slot (1 = program slot) encoded as single constant byte
        LCS                     // Encoding: String to follow (zero terminated)
        “../prjs/BrkProg_SAVE/Demo.rpf” File path and name. // “..” is the “moving 1 folder up from current”
        0x00                    // Zero termination of string above
        GV0(0)                  // Return Image Size at Global Var offset 0. Offset encoded as single byte.
        GV0(4)                  // Return Address of image at Global Var offset 4. Offset encoded as single byte.
        opPROGRAM_START         // Opcode
        LC0(USER_SLOT)          // User slot (1 = program slot) encoded as single byte constant
        GV0(0)                  // Size of image at Global Var offset 0.
        GV0(4)                  // Address of image at Global Var offset 4.
        LC0(0)                  // Debug mode (0 = normal) encoded as single byte constant
        */

        // 30 00 00 00 80 08 00 C0 08 82 01 00 84 2E 2E 2F 70 72 6A 73 2F 42 72 6B 50 72 6F 67 5F 53 41 56 45 2F 44 65 6D 6F 2E 72 70 66 00 60 64 03 01 60 64 00
        // TODO:          ^^ ^^ - how did they got 0800? I'm getting 0000 - it is working, but how 0800?
        ByteArrayOutputStream oc = new ByteArrayOutputStream();

        try {
            oc.write(BC.opFILE);
            oc.write(BC.LC0(BC.FILE_SUB_LOAD_IMAGE));
            oc.write(BC.LC2(BC.USER_SLOT));
            oc.write(BC.LCS(filename));
            oc.write(BC.GV0(0));
            oc.write(BC.GV0(4));
            oc.write(BC.opPROGRAM_START);
            oc.write(BC.LC0(BC.USER_SLOT));
            oc.write(BC.GV0(0));
            oc.write(BC.GV0(4));
            oc.write(BC.LC0(0));

        } catch (java.io.IOException e) {
            // quietly do nothing - it should not happen
        }
        return oc.toByteArray();
    }


    public static byte[] opFileDownloadBegin(String remoteFileName, int fileLength) {
        ByteArrayOutputStream oc = new ByteArrayOutputStream();

        try {

            oc.write(BC.SYSCMD_BEGIN_DOWNLOAD);
            oc.write(Common.int2LEint(fileLength));
            oc.write(remoteFileName.getBytes());
            oc.write(0); //zero termination of filename
        } catch (IOException e) {
            // quietly do nothing - it should not happen
        }
        return oc.toByteArray();
    }


    public static byte[] opFileDownloadContinue(byte fileHandle, byte[] payload, int payloadBytes) {
        ByteArrayOutputStream oc = new ByteArrayOutputStream();

        oc.write(BC.SYSCMD_CONTINUE_DOWNLOAD);
        oc.write(fileHandle);
        oc.write(payload,0,payloadBytes);

        return oc.toByteArray();
    }

    public static byte[] opFileDownloadContinue(byte fileHandle, byte[] payload) {
        return opFileDownloadContinue(fileHandle, payload, payload.length);
    }


    }
