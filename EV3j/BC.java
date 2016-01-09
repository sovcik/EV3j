package EV3j;

/**
 * Definition of EV3 byte codes using bytecodes.c and bytecodes.h
 */
public class BC {


    //  \endverbatim \ref VM \verbatim
    //                                                                          0000....
    public static final byte  opERROR                       = (byte)(0x00); //      0000
    public static final byte  opNOP                         = (byte)(0x01); //      0001
    public static final byte  opPROGRAM_STOP                = (byte)(0x02); //      0010
    public static final byte  opPROGRAM_START               = (byte)(0x03); //      0011
    public static final byte  opOBJECT_STOP                 = (byte)(0x04); //      0100
    public static final byte  opOBJECT_START                = (byte)(0x05); //      0101
    public static final byte  opOBJECT_TRIG                 = (byte)(0x06); //      0110
    public static final byte  opOBJECT_WAIT                 = (byte)(0x07); //      0111
    public static final byte  opRETURN                      = (byte)(0x08); //      1000
    public static final byte  opCALL                        = (byte)(0x09); //      1001
    public static final byte  opOBJECT_END                  = (byte)(0x0A); //      1010
    public static final byte  opSLEEP                       = (byte)(0x0B); //      1011
    public static final byte  opPROGRAM_INFO                = (byte)(0x0C); //      1100
    public static final byte  opLABEL                       = (byte)(0x0D); //      1101
    public static final byte  opPROBE                       = (byte)(0x0E); //      1110
    public static final byte  opDO                          = (byte)(0x0F); //      1111

    //  \endverbatim \ref cMath "MATH" \verbatim
    //                                                                          0001....
    //                    ADD                                                       00..
    public static final byte  opADD8                        = (byte)(0x10); //        00
    public static final byte  opADD16                       = (byte)(0x11); //        01
    public static final byte  opADD32                       = (byte)(0x12); //        10
    public static final byte  opADDF                        = (byte)(0x13); //        11
    //                    SUB                     01..
    public static final byte  opSUB8                        = (byte)(0x14); //        00
    public static final byte  opSUB16                       = (byte)(0x15); //        01
    public static final byte  opSUB32                       = (byte)(0x16); //        10
    public static final byte  opSUBF                        = (byte)(0x17); //        11
    //                    MUL                     10..
    public static final byte  opMUL8                        = (byte)(0x18); //        00
    public static final byte  opMUL16                       = (byte)(0x19); //        01
    public static final byte  opMUL32                       = (byte)(0x1A); //        10
    public static final byte  opMULF                        = (byte)(0x1B); //        11
    //                    DIV                     11..
    public static final byte  opDIV8                        = (byte)(0x1C); //        00
    public static final byte  opDIV16                       = (byte)(0x1D); //        01
    public static final byte  opDIV32                       = (byte)(0x1E); //        10
    public static final byte  opDIVF                        = (byte)(0x1F); //        11

    //  \endverbatim \ref Logic "LOGIC" \verbatim
    //        LOGIC                                                             0010....
    //                    OR                                                        00..
    public static final byte  opOR8                         = (byte)(0x20); //        00
    public static final byte  opOR16                        = (byte)(0x21); //        01
    public static final byte  opOR32                        = (byte)(0x22); //        10

    //                    AND                     01..
    public static final byte  opAND8                        = (byte)(0x24); //        00
    public static final byte  opAND16                       = (byte)(0x25); //        01
    public static final byte  opAND32                       = (byte)(0x26); //        10

    //                    XOR                     10..
    public static final byte  opXOR8                        = (byte)(0x28); //        00
    public static final byte  opXOR16                       = (byte)(0x29); //        01
    public static final byte  opXOR32                       = (byte)(0x2A); //        10

    //                    RL                      11..
    public static final byte  opRL8                         = (byte)(0x2C); //        00
    public static final byte  opRL16                        = (byte)(0x2D); //        01
    public static final byte  opRL32                        = (byte)(0x2E); //        10

    //  \endverbatim \ref cMove "MOVE" \verbatim
    public static final byte  opINIT_BYTES                  = (byte)(0x2F); //      1111
    //        MOVE                                                              0011....
    //                    MOVE8_                                                    00..
    public static final byte  opMOVE8_8                     = (byte)(0x30); //        00
    public static final byte  opMOVE8_16                    = (byte)(0x31); //        01
    public static final byte  opMOVE8_32                    = (byte)(0x32); //        10
    public static final byte  opMOVE8_F                     = (byte)(0x33); //        11
    //                    MOVE16_                 01..
    public static final byte  opMOVE16_8                    = (byte)(0x34); //        00
    public static final byte  opMOVE16_16                   = (byte)(0x35); //        01
    public static final byte  opMOVE16_32                   = (byte)(0x36); //        10
    public static final byte  opMOVE16_F                    = (byte)(0x37); //        11
    //                    MOVE32_                 10..
    public static final byte  opMOVE32_8                    = (byte)(0x38); //        00
    public static final byte  opMOVE32_16                   = (byte)(0x39); //        01
    public static final byte  opMOVE32_32                   = (byte)(0x3A); //        10
    public static final byte  opMOVE32_F                    = (byte)(0x3B); //        11
    //                    MOVEF_                  11..
    public static final byte  opMOVEF_8                     = (byte)(0x3C); //        00
    public static final byte  opMOVEF_16                    = (byte)(0x3D); //        01
    public static final byte  opMOVEF_32                    = (byte)(0x3E); //        10
    public static final byte  opMOVEF_F                     = (byte)(0x3F); //        11

    //  \endverbatim \ref cBranch "BRANCH" \verbatim
    //        BRANCH                                                            010000..
    public static final byte  opJR                          = (byte)(0x40); //        00
    public static final byte  opJR_FALSE                    = (byte)(0x41); //        01
    public static final byte  opJR_TRUE                     = (byte)(0x42); //        10
    public static final byte  opJR_NAN                      = (byte)(0x43); //        11

    //  \endverbatim \ref cCompare "COMPARE" \verbatim
    //        COMPARE                                                           010.....
    //                    CP_LT                                                    001..
    public static final byte  opCP_LT8                      = (byte)(0x44); //        00
    public static final byte  opCP_LT16                     = (byte)(0x45); //        01
    public static final byte  opCP_LT32                     = (byte)(0x46); //        10
    public static final byte  opCP_LTF                      = (byte)(0x47); //        11
    //                    CP_GT                                                    010..
    public static final byte  opCP_GT8                      = (byte)(0x48); //        00
    public static final byte  opCP_GT16                     = (byte)(0x49); //        01
    public static final byte  opCP_GT32                     = (byte)(0x4A); //        10
    public static final byte  opCP_GTF                      = (byte)(0x4B); //        11
    //                    CP_EQ                                                    011..
    public static final byte  opCP_EQ8                      = (byte)(0x4C); //        00
    public static final byte  opCP_EQ16                     = (byte)(0x4D); //        01
    public static final byte  opCP_EQ32                     = (byte)(0x4E); //        10
    public static final byte  opCP_EQF                      = (byte)(0x4F); //        11
    //                    CP_NEQ                                                   100..
    public static final byte  opCP_NEQ8                     = (byte)(0x50); //        00
    public static final byte  opCP_NEQ16                    = (byte)(0x51); //        01
    public static final byte  opCP_NEQ32                    = (byte)(0x52); //        10
    public static final byte  opCP_NEQF                     = (byte)(0x53); //        11
    //                    CP_LTEQ                                                  101..
    public static final byte  opCP_LTEQ8                    = (byte)(0x54); //        00
    public static final byte  opCP_LTEQ16                   = (byte)(0x55); //        01
    public static final byte  opCP_LTEQ32                   = (byte)(0x56); //        10
    public static final byte  opCP_LTEQF                    = (byte)(0x57); //        11
    //                    CP_GTEQ                                                  110..
    public static final byte  opCP_GTEQ8                    = (byte)(0x58); //        00
    public static final byte  opCP_GTEQ16                   = (byte)(0x59); //        01
    public static final byte  opCP_GTEQ32                   = (byte)(0x5A); //        10
    public static final byte  opCP_GTEQF                    = (byte)(0x5B); //        11

    //  \endverbatim \ref Select "SELECT" \verbatim
    //        SELECT                                                            010111..
    public static final byte  opSELECT8                     = (byte)(0x5C); //        00
    public static final byte  opSELECT16                    = (byte)(0x5D); //        01
    public static final byte  opSELECT32                    = (byte)(0x5E); //        10
    public static final byte  opSELECTF                     = (byte)(0x5F); //        11


    //  \endverbatim \ref VM \verbatim
    public static final byte  opSYSTEM                      = (byte)(0x60);
    public static final byte  opPORT_CNV_OUTPUT             = (byte)(0x61);
    public static final byte  opPORT_CNV_INPUT              = (byte)(0x62);
    public static final byte  opNOTE_TO_FREQ                = (byte)(0x63);

    //  \endverbatim \ref cBranch "BRANCH" \verbatim
    //        BRANCH                          011000..
    //?       00
    //?       01
    //?       10
    //?       11
    //                    JR_LT                                                    001..
    public static final byte  opJR_LT8                      = (byte)(0x64); //        00
    public static final byte  opJR_LT16                     = (byte)(0x65); //        01
    public static final byte  opJR_LT32                     = (byte)(0x66); //        10
    public static final byte  opJR_LTF                      = (byte)(0x67); //        11
    //                    JR_GT                                                    010..
    public static final byte  opJR_GT8                      = (byte)(0x68); //        00
    public static final byte  opJR_GT16                     = (byte)(0x69); //        01
    public static final byte  opJR_GT32                     = (byte)(0x6A); //        10
    public static final byte  opJR_GTF                      = (byte)(0x6B); //        11
    //                    JR_EQ                                                    011..
    public static final byte  opJR_EQ8                      = (byte)(0x6C); //        00
    public static final byte  opJR_EQ16                     = (byte)(0x6D); //        01
    public static final byte  opJR_EQ32                     = (byte)(0x6E); //        10
    public static final byte  opJR_EQF                      = (byte)(0x6F); //        11
    //                    JR_NEQ                                                   100..
    public static final byte  opJR_NEQ8                     = (byte)(0x70); //        00
    public static final byte  opJR_NEQ16                    = (byte)(0x71); //        01
    public static final byte  opJR_NEQ32                    = (byte)(0x72); //        10
    public static final byte  opJR_NEQF                     = (byte)(0x73); //        11
    //                    JR_LTEQ                                                  101..
    public static final byte  opJR_LTEQ8                    = (byte)(0x74); //        00
    public static final byte  opJR_LTEQ16                   = (byte)(0x75); //        01
    public static final byte  opJR_LTEQ32                   = (byte)(0x76); //        10
    public static final byte  opJR_LTEQF                    = (byte)(0x77); //        11
    //                    JR_GTEQ                                                  110..
    public static final byte  opJR_GTEQ8                    = (byte)(0x78); //        00
    public static final byte  opJR_GTEQ16                   = (byte)(0x79); //        01
    public static final byte  opJR_GTEQ32                   = (byte)(0x7A); //        10
    public static final byte  opJR_GTEQF                    = (byte)(0x7B); //        11

    //  \endverbatim \ref VM \verbatim
    public static final byte  opINFO                        = (byte)(0x7C); //  01111100
    public static final byte  opSTRINGS                     = (byte)(0x7D); //  01111101
    public static final byte  opMEMORY_WRITE                = (byte)(0x7E); //  01111110
    public static final byte  opMEMORY_READ                 = (byte)(0x7F); //  01111111

    //        SYSTEM                                                            1.......

    //  \endverbatim \ref cUi "UI" \verbatim
    //        UI                                                                100000..
    public static final byte  opUI_FLUSH                    = (byte)(0x80); //        00
    public static final byte  opUI_READ                     = (byte)(0x81); //        01
    public static final byte  opUI_WRITE                    = (byte)(0x82); //        10
    public static final byte  opUI_BUTTON                   = (byte)(0x83); //        11
    public static final byte  opUI_DRAW                     = (byte)(0x84); //  10000100

    //  \endverbatim \ref cTimer "TIMER" \verbatim
    public static final byte  opTIMER_WAIT                  = (byte)(0x85); //  10000101
    public static final byte  opTIMER_READY                 = (byte)(0x86); //  10000110
    public static final byte  opTIMER_READ                  = (byte)(0x87); //  10000111

    //  \endverbatim \ref VM \verbatim
    //        BREAKPOINT                                                        10001...
    public static final byte  opBP0                         = (byte)(0x88); //       000
    public static final byte  opBP1                         = (byte)(0x89); //       001
    public static final byte  opBP2                         = (byte)(0x8A); //       010
    public static final byte  opBP3                         = (byte)(0x8B); //       011
    public static final byte  opBP_SET                      = (byte)(0x8C); //  10001100
    public static final byte  opMATH                        = (byte)(0x8D); //  10001101
    public static final byte  opRANDOM                      = (byte)(0x8E); //  10001110

    //  \endverbatim \ref cTimer "TIMER" \verbatim
    public static final byte  opTIMER_READ_US               = (byte)(0x8F); //  10001111

    //  \endverbatim \ref cUi "UI" \verbatim
    public static final byte  opKEEP_ALIVE                  = (byte)(0x90); //  10010000

    //  \endverbatim \ref cCom "COM" \verbatim
    //                                                                          100100
    public static final byte  opCOM_READ                    = (byte)(0x91); //        01
    public static final byte  opCOM_WRITE                   = (byte)(0x92); //        10

    //  \endverbatim \ref cSound "SOUND" \verbatim
    //                                                                          100101
    public static final byte  opSOUND                       = (byte)(0x94); //        00
    public static final byte  opSOUND_TEST                  = (byte)(0x95); //        01
    public static final byte  opSOUND_READY                 = (byte)(0x96); //        10

    //  \endverbatim \ref cInput "INPUT" \verbatim
    //
    public static final byte  opINPUT_SAMPLE                = (byte)(0x97); //  10010111

    //                                                                          10011...
    public static final byte  opINPUT_DEVICE_LIST           = (byte)(0x98); //       000
    public static final byte  opINPUT_DEVICE                = (byte)(0x99); //       001
    public static final byte  opINPUT_READ                  = (byte)(0x9A); //       010
    public static final byte  opINPUT_TEST                  = (byte)(0x9B); //       011
    public static final byte  opINPUT_READY                 = (byte)(0x9C); //       100
    public static final byte  opINPUT_READSI                = (byte)(0x9D); //       101
    public static final byte  opINPUT_READEXT               = (byte)(0x9E); //       110
    public static final byte  opINPUT_WRITE                 = (byte)(0x9F); //       111
    //  \endverbatim \ref cOutput "OUTPUT" \verbatim
    //                                                                          101.....
    public static final byte  opOUTPUT_GET_TYPE             = (byte)(0xA0); //     00000
    public static final byte  opOUTPUT_SET_TYPE             = (byte)(0xA1); //     00001
    public static final byte  opOUTPUT_RESET                = (byte)(0xA2); //     00010
    public static final byte  opOUTPUT_STOP                 = (byte)(0xA3); //     00011
    public static final byte  opOUTPUT_POWER                = (byte)(0xA4); //     00100
    public static final byte  opOUTPUT_SPEED                = (byte)(0xA5); //     00101
    public static final byte  opOUTPUT_START                = (byte)(0xA6); //     00110
    public static final byte  opOUTPUT_POLARITY             = (byte)(0xA7); //     00111
    public static final byte  opOUTPUT_READ                 = (byte)(0xA8); //     01000
    public static final byte  opOUTPUT_TEST                 = (byte)(0xA9); //     01001
    public static final byte  opOUTPUT_READY                = (byte)(0xAA); //     01010
    public static final byte  opOUTPUT_POSITION             = (byte)(0xAB); //     01011
    public static final byte  opOUTPUT_STEP_POWER           = (byte)(0xAC); //     01100
    public static final byte  opOUTPUT_TIME_POWER           = (byte)(0xAD); //     01101
    public static final byte  opOUTPUT_STEP_SPEED           = (byte)(0xAE); //     01110
    public static final byte  opOUTPUT_TIME_SPEED           = (byte)(0xAF); //     01111

    public static final byte  opOUTPUT_STEP_SYNC            = (byte)(0xB0); //     10000
    public static final byte  opOUTPUT_TIME_SYNC            = (byte)(0xB1); //     10001
    public static final byte  opOUTPUT_CLR_COUNT            = (byte)(0xB2); //     10010
    public static final byte  opOUTPUT_GET_COUNT            = (byte)(0xB3); //     10011

    public static final byte  opOUTPUT_PRG_STOP             = (byte)(0xB4); //     10100

    //  \endverbatim \ref cMemory "MEMORY" \verbatim
    //                                                                          11000...
    public static final byte  opFILE                        = (byte)(0xC0); //       000
    public static final byte  opARRAY                       = (byte)(0xC1); //       001
    public static final byte  opARRAY_WRITE                 = (byte)(0xC2); //       010
    public static final byte  opARRAY_READ                  = (byte)(0xC3); //       011
    public static final byte  opARRAY_APPEND                = (byte)(0xC4); //       100
    public static final byte  opMEMORY_USAGE                = (byte)(0xC5); //       101
    public static final byte  opFILENAME                    = (byte)(0xC6); //       110

    //  \endverbatim \ref cMove "READ" \verbatim
    //                                                                          110010..
    public static final byte  opREAD8                       = (byte)(0xC8); //        00
    public static final byte  opREAD16                      = (byte)(0xC9); //        01
    public static final byte  opREAD32                      = (byte)(0xCA); //        10
    public static final byte  opREADF                       = (byte)(0xCB); //        11

    //  \endverbatim \ref cMove "WRITE" \verbatim
    //                                                                          110011..
    public static final byte  opWRITE8                      = (byte)(0xCC); //        00
    public static final byte  opWRITE16                     = (byte)(0xCD); //        01
    public static final byte  opWRITE32                     = (byte)(0xCE); //        10
    public static final byte  opWRITEF                      = (byte)(0xCF); //        11

    //  \endverbatim \ref cCom "COM" \verbatim
    //                                                                          11010...
    public static final byte  opCOM_READY                   = (byte)(0xD0); //       000
    public static final byte  opCOM_READDATA                = (byte)(0xD1); //       001
    public static final byte  opCOM_WRITEDATA               = (byte)(0xD2); //       010
    public static final byte  opCOM_GET                     = (byte)(0xD3); //       011
    public static final byte  opCOM_SET                     = (byte)(0xD4); //       100
    public static final byte  opCOM_TEST                    = (byte)(0xD5); //       101
    public static final byte  opCOM_REMOVE                  = (byte)(0xD6); //       110
    public static final byte  opCOM_WRITEFILE               = (byte)(0xD7); //       111

    //                                                                          11011...
    public static final byte  opMAILBOX_OPEN                = (byte)(0xD8); //       000
    public static final byte  opMAILBOX_WRITE               = (byte)(0xD9); //       001
    public static final byte  opMAILBOX_READ                = (byte)(0xDA); //       010
    public static final byte  opMAILBOX_TEST                = (byte)(0xDB); //       011
    public static final byte  opMAILBOX_READY               = (byte)(0xDC); //       100
    public static final byte  opMAILBOX_CLOSE               = (byte)(0xDD); //       101

    //        SPARE                                                             111.....

    //  \endverbatim \ref TST \verbatim
    public static final byte  opTST                         = (byte)(0xFF); //  11111111

    // ************** SUBCODES ***************

    public static final byte  UI_READ_SUB_GET_VBATT     =  1;
    public static final byte  UI_READ_SUB_GET_IBATT     =  2;
    public static final byte  UI_READ_SUB_GET_OS_VERS   =  3;
    public static final byte  UI_READ_SUB_GET_EVENT     =  4;
    public static final byte  UI_READ_SUB_GET_TBATT     =  5;
    public static final byte  UI_READ_SUB_GET_IINT      =  6;
    public static final byte  UI_READ_SUB_GET_IMOTOR    =  7;
    public static final byte  UI_READ_SUB_GET_STRING    =  8;
    public static final byte  UI_READ_SUB_GET_HW_VERS   =  9;
    public static final byte  UI_READ_SUB_GET_FW_VERS   = 10;
    public static final byte  UI_READ_SUB_GET_FW_BUILD  = 11;
    public static final byte  UI_READ_SUB_GET_OS_BUILD  = 12;
    public static final byte  UI_READ_SUB_GET_ADDRESS   = 13;
    public static final byte  UI_READ_SUB_GET_CODE      = 14;
    public static final byte  UI_READ_SUB_KEY           = 15;
    public static final byte  UI_READ_SUB_GET_SHUTDOWN  = 16;
    public static final byte  UI_READ_SUB_GET_WARNING   = 17;
    public static final byte  UI_READ_SUB_GET_LBATT     = 18;
    public static final byte  UI_READ_SUB_TEXTBOX_READ  = 21;
    public static final byte  UI_READ_SUB_GET_VERSION   = 26;
    public static final byte  UI_READ_SUB_GET_IP        = 27;
    public static final byte  UI_READ_SUB_GET_POWER     = 29;
    public static final byte  UI_READ_SUB_GET_SDCARD    = 30;
    public static final byte  UI_READ_SUB_GET_USBSTICK  = 31;

    //! \endverbatim


    //! \page uiwritesubcode Specific command parameter
    //!
    //!
    //! \verbatim
    //!

    public static final byte  UI_WRITE_SUB_WRITE_FLUSH    =  1;
    public static final byte  UI_WRITE_SUB_FLOATVALUE     =  2;
    public static final byte  UI_WRITE_SUB_STAMP          =  3;
    public static final byte  UI_WRITE_SUB_PUT_STRING     =  8;
    public static final byte  UI_WRITE_SUB_VALUE8         =  9;
    public static final byte  UI_WRITE_SUB_VALUE16        = 10;
    public static final byte  UI_WRITE_SUB_VALUE32        = 11;
    public static final byte  UI_WRITE_SUB_VALUEF         = 12;
    public static final byte  UI_WRITE_SUB_ADDRESS        = 13;
    public static final byte  UI_WRITE_SUB_CODE           = 14;
    public static final byte  UI_WRITE_SUB_DOWNLOAD_END   = 15;
    public static final byte  UI_WRITE_SUB_SCREEN_BLOCK   = 16;
    public static final byte  UI_WRITE_SUB_TEXTBOX_APPEND = 21;
    public static final byte  UI_WRITE_SUB_SET_BUSY       = 22;
    public static final byte  UI_WRITE_SUB_SET_TESTPIN    = 24;
    public static final byte  UI_WRITE_SUB_INIT_RUN       = 25;
    public static final byte  UI_WRITE_SUB_UPDATE_RUN     = 26;
    public static final byte  UI_WRITE_SUB_LED            = 27;
    public static final byte  UI_WRITE_SUB_POWER          = 29;
    public static final byte  UI_WRITE_SUB_GRAPH_SAMPLE   = 30;
    public static final byte  UI_WRITE_SUB_TERMINAL       = 31;

    //! \endverbatim


    //! \page uibuttonsubcode Specific command parameter
    //!
    //!
    //! \verbatim
    //!

    public static final byte  UI_BUTTON_SUB_SHORTPRESS      =  1;
    public static final byte  UI_BUTTON_SUB_LONGPRESS       =  2;
    public static final byte  UI_BUTTON_SUB_WAIT_FOR_PRESS  =  3;
    public static final byte  UI_BUTTON_SUB_FLUSH           =  4;
    public static final byte  UI_BUTTON_SUB_PRESS           =  5;
    public static final byte  UI_BUTTON_SUB_RELEASE         =  6;
    public static final byte  UI_BUTTON_SUB_GET_HORZ        =  7;
    public static final byte  UI_BUTTON_SUB_GET_VERT        =  8;
    public static final byte  UI_BUTTON_SUB_PRESSED         =  9;
    public static final byte  UI_BUTTON_SUB_SET_BACK_BLOCK  = 10;
    public static final byte  UI_BUTTON_SUB_GET_BACK_BLOCK  = 11;
    public static final byte  UI_BUTTON_SUB_TESTSHORTPRESS  = 12;
    public static final byte  UI_BUTTON_SUB_TESTLONGPRESS   = 13;
    public static final byte  UI_BUTTON_SUB_GET_BUMBED      = 14;
    public static final byte  UI_BUTTON_SUB_GET_CLICK       = 15;

    //! \endverbatim


    //! \page comreadsubcode Specific command parameter
    //!
    //!
    //! \verbatim
    //!

    public static final byte  COM_READ_SUB_COMMAND       = 14;

    //! \endverbatim


    //! \page comwritesubcode Specific command parameter
    //!
    //!
    //! \verbatim
    //!

    public static final byte  COM_WRITE_SUB_REPLY         = 14;

    //! \endverbatim


    //! \page comgetsubcode Specific command parameter
    //!
    //! \verbatim
    //!

    public static final byte  COM_GET_SUB_GET_ON_OFF    =  1;                    //!< Set, Get
    public static final byte  COM_GET_SUB_GET_VISIBLE   =  2;                    //!< Set, Get
    public static final byte  COM_GET_SUB_GET_RESULT    =  4;                    //!<      Get
    public static final byte  COM_GET_SUB_GET_PIN       =  5;                    //!< Set, Get
    public static final byte  COM_GET_SUB_SEARCH_ITEMS  =  8;                    //!<      Get
    public static final byte  COM_GET_SUB_SEARCH_ITEM   =  9;                    //!<      Get
    public static final byte  COM_GET_SUB_FAVOUR_ITEMS  = 10;                    //!<      Get
    public static final byte  COM_GET_SUB_FAVOUR_ITEM   = 11;                    //!<      Get
    public static final byte  COM_GET_SUB_GET_ID        = 12;
    public static final byte  COM_GET_SUB_GET_BRICKNAME = 13;
    public static final byte  COM_GET_SUB_GET_NETWORK   = 14;
    public static final byte  COM_GET_SUB_GET_PRESENT   = 15;
    public static final byte  COM_GET_SUB_GET_ENCRYPT   = 16;
    public static final byte  COM_GET_SUB_CONNEC_ITEMS  = 17;
    public static final byte  COM_GET_SUB_CONNEC_ITEM   = 18;
    public static final byte  COM_GET_SUB_GET_INCOMING  = 19;
    public static final byte  COM_GET_SUB_GET_MODE2     = 20;

    //! \endverbatim


    //! \page comsetsubcode Specific command parameter
    //!
    //! \verbatim
    //!

    public static final byte  SET_ON_OFF     =  1;                    //!< Set, Get
    public static final byte  SET_VISIBLE    =  2;                    //!< Set, Get
    public static final byte  SET_SEARCH     =  3;                    //!< Set
    public static final byte  SET_PIN        =  5;                    //!< Set, Get
    public static final byte  SET_PASSKEY    =  6;                    //!< Set
    public static final byte  SET_CONNECTION =  7;                    //!< Set
    public static final byte  SET_BRICKNAME  =  8;
    public static final byte  SET_MOVEUP     =  9;
    public static final byte  SET_MOVEDOWN   = 10;
    public static final byte  SET_ENCRYPT    = 11;
    public static final byte  SET_SSID       = 12;
    public static final byte  SET_MODE2      = 13;

    //! \endverbatim


    //! \page inputdevicesubcode Specific command parameter
    //!
    //!
    //! \verbatim
    //!

    public static final byte  INPUT_DEV_GET_FORMAT      =  2;
    public static final byte  INPUT_DEV_CAL_MINMAX      =  3;
    public static final byte  INPUT_DEV_CAL_DEFAULT     =  4;
    public static final byte  INPUT_DEV_GET_TYPEMODE    =  5;
    public static final byte  INPUT_DEV_GET_SYMBOL      =  6;
    public static final byte  INPUT_DEV_CAL_MIN         =  7;
    public static final byte  INPUT_DEV_CAL_MAX         =  8;
    public static final byte  INPUT_DEV_SETUP           =  9;
    public static final byte  INPUT_DEV_CLR_ALL         = 10;
    public static final byte  INPUT_DEV_GET_RAW         = 11;
    public static final byte  INPUT_DEV_GET_CONNECTION  = 12;
    public static final byte  INPUT_DEV_STOP_ALL        = 13;
    public static final byte  INPUT_DEV_GET_NAME        = 21;
    public static final byte  INPUT_DEV_GET_MODENAME    = 22;
    public static final byte  INPUT_DEV_SET_RAW         = 23;
    public static final byte  INPUT_DEV_GET_FIGURES     = 24;
    public static final byte  INPUT_DEV_GET_CHANGES     = 25;
    public static final byte  INPUT_DEV_CLR_CHANGES     = 26;
    public static final byte  INPUT_DEV_READY_PCT       = 27;
    public static final byte  INPUT_DEV_READY_RAW       = 28;
    public static final byte  INPUT_DEV_READY_SI        = 29;
    public static final byte  INPUT_DEV_GET_MINMAX      = 30;
    public static final byte  INPUT_DEV_GET_BUMPS       = 31;

    //! \endverbatim


    //! \page programinfosubcode Specific command parameter
    //!
    //!
    //! \verbatim
    //!

    public static final byte  PROG_INF_OBJ_STOP      =  0;   // VM
    public static final byte  PROG_INF_OBJ_START     =  4;   // VM
    public static final byte  PROG_INF_GET_STATUS    = 22;   // VM
    public static final byte  PROG_INF_GET_SPEED     = 23;   // VM
    public static final byte  PROG_INF_GET_PRGRESULT = 24;   // VM
    public static final byte  PROG_INF_SET_INSTR     = 25;   // VM

    //! \endverbatim


    //! \page uidrawsubcode Specific command parameter
    //!
    //!
    //! \verbatim
    //!

    public static final byte  UI_DRAW_SUB_UPDATE        =  0;
    public static final byte  UI_DRAW_SUB_CLEAN         =  1;
    public static final byte  UI_DRAW_SUB_PIXEL         =  2;
    public static final byte  UI_DRAW_SUB_LINE          =  3;
    public static final byte  UI_DRAW_SUB_CIRCLE        =  4;
    public static final byte  UI_DRAW_SUB_TEXT          =  5;
    public static final byte  UI_DRAW_SUB_ICON          =  6;
    public static final byte  UI_DRAW_SUB_PICTURE       =  7;
    public static final byte  UI_DRAW_SUB_VALUE         =  8;
    public static final byte  UI_DRAW_SUB_FILLRECT      =  9;
    public static final byte  UI_DRAW_SUB_RECT          = 10;
    public static final byte  UI_DRAW_SUB_NOTIFICATION  = 11;
    public static final byte  UI_DRAW_SUB_QUESTION      = 12;
    public static final byte  UI_DRAW_SUB_KEYBOARD      = 13;
    public static final byte  UI_DRAW_SUB_BROWSE        = 14;
    public static final byte  UI_DRAW_SUB_VERTBAR       = 15;
    public static final byte  UI_DRAW_SUB_INVERSERECT   = 16;
    public static final byte  UI_DRAW_SUB_SELECT_FONT   = 17;
    public static final byte  UI_DRAW_SUB_TOPLINE       = 18;
    public static final byte  UI_DRAW_SUB_FILLWINDOW    = 19;
    public static final byte  UI_DRAW_SUB_SCROLL        = 20;
    public static final byte  UI_DRAW_SUB_DOTLINE       = 21;
    public static final byte  UI_DRAW_SUB_VIEW_VALUE    = 22;
    public static final byte  UI_DRAW_SUB_VIEW_UNIT     = 23;
    public static final byte  UI_DRAW_SUB_FILLCIRCLE    = 24;
    public static final byte  UI_DRAW_SUB_STORE         = 25;
    public static final byte  UI_DRAW_SUB_RESTORE       = 26;
    public static final byte  UI_DRAW_SUB_ICON_QUESTION = 27;
    public static final byte  UI_DRAW_SUB_BMPFILE       = 28;
    public static final byte  UI_DRAW_SUB_POPUP         = 29;
    public static final byte  UI_DRAW_SUB_GRAPH_SETUP   = 30;
    public static final byte  UI_DRAW_SUB_GRAPH_DRAW    = 31;
    public static final byte  UI_DRAW_SUB_TEXTBOX       = 32;

    //! \endverbatim


    //! \page memoryfilesubcode Specific command parameter
    //!
    //!
    //! \verbatim
    //!

    public static final byte  FILE_SUB_OPEN_APPEND         =  0;
    public static final byte  FILE_SUB_OPEN_READ           =  1;
    public static final byte  FILE_SUB_OPEN_WRITE          =  2;
    public static final byte  FILE_SUB_READ_VALUE          =  3;
    public static final byte  FILE_SUB_WRITE_VALUE         =  4;
    public static final byte  FILE_SUB_READ_TEXT           =  5;
    public static final byte  FILE_SUB_WRITE_TEXT          =  6;
    public static final byte  FILE_SUB_CLOSE               =  7;
    public static final byte  FILE_SUB_LOAD_IMAGE          =  8;
    public static final byte  FILE_SUB_GET_HANDLE          =  9;
    public static final byte  FILE_SUB_MAKE_FOLDER         = 10;
    public static final byte  FILE_SUB_GET_POOL            = 11;
    public static final byte  FILE_SUB_SET_LOG_SYNC_TIME   = 12;
    public static final byte  FILE_SUB_GET_FOLDERS         = 13;
    public static final byte  FILE_SUB_GET_LOG_SYNC_TIME   = 14;
    public static final byte  FILE_SUB_GET_SUBFOLDER_NAME  = 15;
    public static final byte  FILE_SUB_WRITE_LOG           = 16;
    public static final byte  FILE_SUB_CLOSE_LOG           = 17;
    public static final byte  FILE_SUB_GET_IMAGE           = 18;
    public static final byte  FILE_SUB_GET_ITEM            = 19;
    public static final byte  FILE_SUB_GET_CACHE_FILES     = 20;
    public static final byte  FILE_SUB_PUT_CACHE_FILE      = 21;
    public static final byte  FILE_SUB_GET_CACHE_FILE      = 22;
    public static final byte  FILE_SUB_DEL_CACHE_FILE      = 23;
    public static final byte  FILE_SUB_DEL_SUBFOLDER       = 24;
    public static final byte  FILE_SUB_GET_LOG_NAME        = 25;

    public static final byte  FILE_SUB_OPEN_LOG            = 27;
    public static final byte  FILE_SUB_READ_BYTES          = 28;
    public static final byte  FILE_SUB_WRITE_BYTES         = 29;
    public static final byte  FILE_SUB_REMOVE              = 30;
    public static final byte  FILE_SUB_MOVE                = 31;

    //! \endverbatim


    //! \page memoryarraysubcode Specific command parameter
    //!
    //!
    //! \verbatim
    //!

    public static final byte  ARRAY_SUB_DELETE              =  0;
    public static final byte  ARRAY_SUB_CREATE8             =  1;
    public static final byte  ARRAY_SUB_CREATE16            =  2;
    public static final byte  ARRAY_SUB_CREATE32            =  3;
    public static final byte  ARRAY_SUB_CREATEF             =  4;
    public static final byte  ARRAY_SUB_RESIZE              =  5;
    public static final byte  ARRAY_SUB_FILL                =  6;
    public static final byte  ARRAY_SUB_COPY                =  7;
    public static final byte  ARRAY_SUB_INIT8               =  8;
    public static final byte  ARRAY_SUB_INIT16              =  9;
    public static final byte  ARRAY_SUB_INIT32              = 10;
    public static final byte  ARRAY_SUB_INITF               = 11;
    public static final byte  ARRAY_SUB_SIZE                = 12;
    public static final byte  ARRAY_SUB_READ_CONTENT        = 13;
    public static final byte  ARRAY_SUB_WRITE_CONTENT       = 14;
    public static final byte  ARRAY_SUB_READ_SIZE           = 15;

    //! \endverbatim


    //! \page memoryfilenamesubcode Specific command parameter
    //!
    //! \verbatim
    //!

    public static final byte  FILENAME_SUB_EXIST               = 16;     //!< MUST BE GREATER OR EQUAL TO "ARRAY_SUBCODES"
    public static final byte  FILENAME_SUB_TOTALSIZE           = 17;
    public static final byte  FILENAME_SUB_SPLIT               = 18;
    public static final byte  FILENAME_SUB_MERGE               = 19;
    public static final byte  FILENAME_SUB_CHECK               = 20;
    public static final byte  FILENAME_SUB_PACK                = 21;
    public static final byte  FILENAME_SUB_UNPACK              = 22;
    public static final byte  FILENAME_SUB_GET_FOLDERNAME      = 23;

    //! \endverbatim


    //! \page infosubcode Specific command parameter
    //!
    //!
    //! \verbatim
    //!

    public static final byte  INFO_SUB_SET_ERROR           = 1;
    public static final byte  INFO_SUB_GET_ERROR           = 2;
    public static final byte  INFO_SUB_ERRORTEXT           = 3;

    public static final byte  INFO_SUB_GET_VOLUME          = 4;
    public static final byte  INFO_SUB_SET_VOLUME          = 5;
    public static final byte  INFO_SUB_GET_MINUTES         = 6;
    public static final byte  INFO_SUB_SET_MINUTES         = 7;

    //! \endverbatim


    //! \page soundsubcode Specific command parameter
    //!
    //!
    //! \verbatim
    //!

    public static final byte  SOUND_SUB_BREAK               = 0;
    public static final byte  SOUND_SUB_TONE                = 1;
    public static final byte  SOUND_SUB_PLAY                = 2;
    public static final byte  SOUND_SUB_REPEAT              = 3;
    public static final byte  SOUND_SUB_SERVICE             = 4;

    //! \endverbatim


    //! \page stringsubcode Specific command parameter
    //!
    //!
    //! \verbatim
    //!

    public static final byte  STRING_SUB_GET_SIZE            =  1;    // VM       get string size
    public static final byte  STRING_SUB_ADD                 =  2;    // VM       add two strings
    public static final byte  STRING_SUB_COMPARE             =  3;    // VM       compare two strings
    public static final byte  STRING_SUB_DUPLICATE           =  5;    // VM       duplicate one string to another
    public static final byte  STRING_SUB_VALUE_TO_STRING     =  6;
    public static final byte  STRING_SUB_STRING_TO_VALUE     =  7;
    public static final byte  STRING_SUB_STRIP               =  8;
    public static final byte  STRING_SUB_NUMBER_TO_STRING    =  9;
    public static final byte  STRING_SUB_SUB                 = 10;
    public static final byte  STRING_SUB_VALUE_FORMATTED     = 11;
    public static final byte  STRING_SUB_NUMBER_FORMATTED    = 12;

    //! \endverbatim


    /*! \page programid Program ID's (Slots)

        \anchor prgid

        \verbatim */

    public static final byte GUI_SLOT                      = 0;    //!< Program slot reserved for executing the user interface
    public static final byte USER_SLOT                     = 1;    //!< Program slot used to execute user projects, apps and tools
    public static final byte CMD_SLOT                      = 2;    //!< Program slot used for direct commands coming from c_com
    public static final byte TERM_SLOT                     = 3;    //!< Program slot used for direct commands coming from c_ui
    public static final byte DEBUG_SLOT                    = 4;    //!< Program slot used to run the debug ui

    // ONLY VALID IN opPROGRAM_STOP
    public static final byte CURRENT_SLOT                  = -1;

    /*  \endverbatim */


    /*! \page buttons Button

        \verbatim */

    public static final byte BUTTON_TYPE_NO_BUTTON                     = 0;
    public static final byte BUTTON_TYPE_UP_BUTTON                     = 1;
    public static final byte BUTTON_TYPE_ENTER_BUTTON                  = 2;
    public static final byte BUTTON_TYPE_DOWN_BUTTON                   = 3;
    public static final byte BUTTON_TYPE_RIGHT_BUTTON                  = 4;
    public static final byte BUTTON_TYPE_LEFT_BUTTON                   = 5;
    public static final byte BUTTON_TYPE_BACK_BUTTON                   = 6;
    public static final byte BUTTON_TYPE_ANY_BUTTON                    = 7;

    //        MACROS FOR PRIMITIVES AND SYSTEM CALLS

    public static final byte PRIMPAR_SHORT                 = 0x00;
    public static final byte PRIMPAR_LONG                  = (byte) 0x80;

    public static final byte PRIMPAR_CONST                 = 0x00;
    public static final byte PRIMPAR_VARIABEL              = 0x40;
    public static final byte PRIMPAR_LOCAL                 = 0x00;
    public static final byte PRIMPAR_GLOBAL                = 0x20;
    public static final byte PRIMPAR_HANDLE                = 0x10;
    public static final byte PRIMPAR_ADDR                  = 0x08;

    public static final byte PRIMPAR_INDEX                 = 0x1F;
    public static final byte PRIMPAR_CONST_SIGN            = 0x20;
    public static final byte PRIMPAR_VALUE                 = 0x3F;

    public static final byte PRIMPAR_BYTES                 = 0x07;

    public static final byte PRIMPAR_STRING_OLD            = 0   ;
    public static final byte PRIMPAR_1_BYTE                = 1   ;
    public static final byte PRIMPAR_2_BYTES               = 2   ;
    public static final byte PRIMPAR_4_BYTES               = 3   ;
    public static final byte PRIMPAR_STRING                = 4   ;

    public static final byte PRIMPAR_LABEL                 = 0x20;

    //TODO: #define   HND(x)                        PRIMPAR_HANDLE | x
    //TODO: #define   ADR(x)                        PRIMPAR_ADDR | x

    // #define   LCS                           (PRIMPAR_LONG | PRIMPAR_STRING)
    public static byte[] LCS(String s){
        // LCS = (PRIMPAR_LONG | PRIMPAR_STRING)

        byte[] b = new byte[s.length()+2];          // LCS code + string + zero byte for termination
        b[0] = (PRIMPAR_LONG  | PRIMPAR_STRING);    // LCS code
        System.arraycopy(s.getBytes(),0,b,1,s.length());  // copy string to byte array
        return b;
    }

    //TODO: #define   LAB1(v)                       (PRIMPAR_LONG | PRIMPAR_LABEL),(v & 0xFF)

    //#define   LC0(v)                        ((v & PRIMPAR_VALUE) | PRIMPAR_SHORT | PRIMPAR_CONST)
    public static byte LC0(int i){  // should be unsigned byte, but java does not support such
        return (byte) ((i & PRIMPAR_VALUE) | PRIMPAR_SHORT | PRIMPAR_CONST);
    }

    //#define   LC1(v)                        (PRIMPAR_LONG  | PRIMPAR_CONST | PRIMPAR_1_BYTE),(v & 0xFF)
    public static byte[] LC1(int i){  // should be unsigned byte, but java does not support such
        return new byte[] {
                (PRIMPAR_LONG  | PRIMPAR_CONST | PRIMPAR_1_BYTE),
                (byte) (i & 0xFF)
        };
    }

    //#define   LC2(v)                        (PRIMPAR_LONG  | PRIMPAR_CONST | PRIMPAR_2_BYTES),(v & 0xFF),((v >> 8) & 0xFF)
    public static byte[] LC2(int i){  // // should be unsigned short, but java does not support such
        return new byte[] {
                (PRIMPAR_LONG  | PRIMPAR_CONST | PRIMPAR_2_BYTES),
                (byte)(i & 0xFF),
                (byte)((i >> 8) & 0xFF)
        };
    }

    //#define   LC4(v)                        (PRIMPAR_LONG  | PRIMPAR_CONST | PRIMPAR_4_BYTES),((ULONG)v & 0xFF),(((ULONG)v >> (ULONG)8) & 0xFF),(((ULONG)v >> (ULONG)16) & 0xFF),(((ULONG)v >> (ULONG)24) & 0xFF)
    public static byte[] LC4(long i){ // should be unsigned int, but java does not support such
        return new byte[] {
                (PRIMPAR_LONG  | PRIMPAR_CONST | PRIMPAR_4_BYTES),
                (byte) (i & 0xFF),
                (byte) ((i >> 8) & 0xFF),
                (byte) ((i >> 16) & 0xFF),
                (byte) ((i >> 24) & 0xFF)
        };
    }

    //#define   LCA(h)                        (PRIMPAR_LONG  | PRIMPAR_CONST | PRIMPAR_1_BYTE | PRIMPAR_ARRAY),(i & 0xFF)
    /*
    public static byte[] LCA(int v){  // // should be unsigned short, but java does not support such
        return new byte[] {
                (PRIMPAR_LONG  | PRIMPAR_CONST | PRIMPAR_1_BYTE | PRIMPAR_ARRAY),
                (byte)(v & 0xFF)
        };
    }
    */

    //#define   LV0(i)                        ((i & PRIMPAR_INDEX) | PRIMPAR_SHORT | PRIMPAR_VARIABEL | PRIMPAR_LOCAL)
    public static byte LV0(int i){  // should be unsigned byte, but java does not support such
        return (byte) (((i & PRIMPAR_INDEX) | PRIMPAR_SHORT | PRIMPAR_VARIABEL | PRIMPAR_LOCAL));
    }

    //#define   LV1(i)                        (PRIMPAR_LONG  | PRIMPAR_VARIABEL | PRIMPAR_LOCAL | PRIMPAR_1_BYTE),(i & 0xFF)
    public static byte[] LV1(int i){  // should be unsigned byte, but java does not support such
        return new byte[] {
                (PRIMPAR_LONG  | PRIMPAR_VARIABEL | PRIMPAR_LOCAL | PRIMPAR_1_BYTE),
                (byte) (i & 0xFF)
        };
    }

    //#define   LV2(i)                        (PRIMPAR_LONG  | PRIMPAR_VARIABEL | PRIMPAR_LOCAL | PRIMPAR_2_BYTES),(i & 0xFF),((i >> 8) & 0xFF)
    public static byte[] LV2(int i){  // // should be unsigned short, but java does not support such
        return new byte[] {
                (PRIMPAR_LONG  | PRIMPAR_VARIABEL | PRIMPAR_LOCAL | PRIMPAR_2_BYTES),
                (byte)(i & 0xFF),
                (byte)((i >> 8) & 0xFF)
        };
    }

    //#define   LV4(i)                        (PRIMPAR_LONG  | PRIMPAR_VARIABEL | PRIMPAR_LOCAL | PRIMPAR_4_BYTES),(i & 0xFF),((i >> 8) & 0xFF),((i >> 16) & 0xFF),((i >> 24) & 0xFF)
    public static byte[] LV4(long i){ // should be unsigned int, but java does not support such
        return new byte[] {
                (PRIMPAR_LONG  | PRIMPAR_VARIABEL | PRIMPAR_LOCAL | PRIMPAR_4_BYTES),
                (byte) (i & 0xFF),
                (byte) ((i >> 8) & 0xFF),
                (byte) ((i >> 16) & 0xFF),
                (byte) ((i >> 24) & 0xFF)
        };
    }

    //TODO: #define   LVA(h)                        (PRIMPAR_LONG  | PRIMPAR_VARIABEL | PRIMPAR_LOCAL | PRIMPAR_1_BYTE | PRIMPAR_ARRAY),(i & 0xFF)
    /*
    public static byte[] LVA(int v){  // // should be unsigned short, but java does not support such
        return new byte[] {
                (PRIMPAR_LONG  | PRIMPAR_VARIABEL | PRIMPAR_LOCAL | PRIMPAR_1_BYTE | PRIMPAR_ARRAY),
                (byte)(v & 0xFF)
        };
    }
    */

    //#define   GV0(i)                        ((i & PRIMPAR_INDEX) | PRIMPAR_SHORT | PRIMPAR_VARIABEL | PRIMPAR_GLOBAL)
    public static byte GV0(int i){  // should be unsigned byte, but java does not support such
        return (byte) (((i & PRIMPAR_INDEX) | PRIMPAR_SHORT | PRIMPAR_VARIABEL | PRIMPAR_GLOBAL));
    }

    //#define   GV1(i)                        (PRIMPAR_LONG  | PRIMPAR_VARIABEL | PRIMPAR_GLOBAL | PRIMPAR_1_BYTE),(i & 0xFF)
    public static byte[] GV1(int i){  // should be unsigned byte, but java does not support such
        return new byte[] {
                (PRIMPAR_LONG  | PRIMPAR_VARIABEL | PRIMPAR_GLOBAL | PRIMPAR_1_BYTE),
                (byte) (i & 0xFF)
        };
    }

    //#define   GV2(i)                        (PRIMPAR_LONG  | PRIMPAR_VARIABEL | PRIMPAR_GLOBAL | PRIMPAR_2_BYTES),(i & 0xFF),((i >> 8) & 0xFF)
    public static byte[] GV2(int i){  // // should be unsigned short, but java does not support such
        return new byte[] {
                (PRIMPAR_LONG  | PRIMPAR_VARIABEL | PRIMPAR_GLOBAL | PRIMPAR_2_BYTES),
                (byte)(i & 0xFF),
                (byte)((i >> 8) & 0xFF)
        };
    }

    //#define   GV4(i)                        (PRIMPAR_LONG  | PRIMPAR_VARIABEL | PRIMPAR_GLOBAL | PRIMPAR_4_BYTES),(i & 0xFF),((i >> 8) & 0xFF),((i >> 16) & 0xFF),((i >> 24) & 0xFF)
    public static byte[] GV4(long i){ // should be unsigned int, but java does not support such
        return new byte[] {
                (PRIMPAR_LONG  | PRIMPAR_VARIABEL | PRIMPAR_GLOBAL | PRIMPAR_4_BYTES),
                (byte) (i & 0xFF),
                (byte) ((i >> 8) & 0xFF),
                (byte) ((i >> 16) & 0xFF),
                (byte) ((i >> 24) & 0xFF)
        };
    }

    //TODO: #define   GVA(h)                        (PRIMPAR_LONG  | PRIMPAR_VARIABEL | PRIMPAR_GLOBAL | PRIMPAR_1_BYTE | PRIMPAR_ARRAY),(i & 0xFF)
    /*
    public static byte[] GCA(int v){  // // should be unsigned short, but java does not support such
        return new byte[] {
                (PRIMPAR_LONG  | PRIMPAR_VARIABEL | PRIMPAR_GLOBAL | PRIMPAR_1_BYTE | PRIMPAR_ARRAY),
                (byte)(v & 0xFF)
        };
    }
    */

    //************* COMMAND TYPES *********************
    public static final byte  CMD_TYPE_DIRECT_COMMAND_REPLY        = (byte)(0x00); // Direct command, reply required
    public static final byte  CMD_TYPE_DIRECT_COMMAND_NO_REPLY     = (byte)(0x80); // Direct command, reply not require

    public static final byte  CMD_TYPE_DIRECT_REPLY                = (byte)(0x02); // Direct command reply OK
    public static final byte  CMD_TYPE_DIRECT_REPLY_ERROR          = (byte)(0x04); // Direct command reply ERROR

    public static final byte  CMD_TYPE_SYSTEM_COMMAND_REPLY        = (byte)(0x01); // System command, reply required
    public static final byte  CMD_TYPE_SYSTEM_COMMAND_NO_REPLY     = (byte)(0x81); // System command, reply not require

    public static final byte  CMD_TYPE_SYSTEM_REPLY                = (byte)(0x03); // System command reply OK
    public static final byte  CMD_TYPE_SYSTEM_REPLY_ERROR          = (byte)(0x05); // System command reply ERROR



    //************* SYSTEM COMMANDS *******************

    public static final byte  SYSCMD_BEGIN_DOWNLOAD          = (byte)(0x92); // Begin file download
    public static final byte  SYSCMD_CONTINUE_DOWNLOAD       = (byte)(0x93); // Continue file download
    public static final byte  SYSCMD_BEGIN_UPLOAD            = (byte)(0x94); // Begin file upload
    public static final byte  SYSCMD_CONTINUE_UPLOAD         = (byte)(0x95); // Continue file upload
    public static final byte  SYSCMD_BEGIN_GETFILE           = (byte)(0x96); // Begin get bytes from a file (while writing to the file)
    public static final byte  SYSCMD_CONTINUE_GETFILE        = (byte)(0x97); // Continue get byte from a file (while writing to the file)
    public static final byte  SYSCMD_CLOSE_FILEHANDLE        = (byte)(0x98); // Close file handle
    public static final byte  SYSCMD_LIST_FILES              = (byte)(0x99); // List files
    public static final byte  SYSCMD_CONTINUE_LIST_FILES     = (byte)(0x9A); // Continue list files
    public static final byte  SYSCMD_CREATE_DIR              = (byte)(0x9B); // Create directory
    public static final byte  SYSCMD_DELETE_FILE             = (byte)(0x9C); // Delete
    public static final byte  SYSCMD_LIST_OPEN_HANDLES       = (byte)(0x9D); // List handles
    public static final byte  SYSCMD_WRITEMAILBOX            = (byte)(0x9E); // Write to mailbox
    public static final byte  SYSCMD_BLUETOOTHPIN            = (byte)(0x9F); // Transfer trusted pin code to brick
    public static final byte  SYSCMD_ENTERFWUPDATE           = (byte)(0xA0); // Restart the brick in Firmware update mode

    //************ REPLY CODES TO SYSTEM COMMANDS **********

    public static final byte  SYSCMD_REPLY_SUCCESS                 = (0x00);
    public static final byte  SYSCMD_REPLY_UNKNOWN_HANDLE          = (0x01);
    public static final byte  SYSCMD_REPLY_HANDLE_NOT_READY        = (0x02);
    public static final byte  SYSCMD_REPLY_CORRUPT_FILE            = (0x03);
    public static final byte  SYSCMD_REPLY_NO_HANDLES_AVAILABLE    = (0x04);
    public static final byte  SYSCMD_REPLY_NO_PERMISSION           = (0x05);
    public static final byte  SYSCMD_REPLY_ILLEGAL_PATH            = (0x06);
    public static final byte  SYSCMD_REPLY_FILE_EXITS              = (0x07);
    public static final byte  SYSCMD_REPLY_END_OF_FILE             = (0x08);
    public static final byte  SYSCMD_REPLY_SIZE_ERROR              = (0x09);
    public static final byte  SYSCMD_REPLY_UNKNOWN_ERROR           = (0x0A);
    public static final byte  SYSCMD_REPLY_ILLEGAL_FILENAME        = (0x0B);
    public static final byte  SYSCMD_REPLY_ILLEGAL_CONNECTION      = (0x0C);

    // HARDWARE

    public static final byte   vmOUTPUTS                    = 4;                            //!< Number of output ports in the system
    public static final byte   vmINPUTS                     = 4;                            //!< Number of input  ports in the system
    public static final byte   vmBUTTONS                    = 6;                            //!< Number of buttons in the system
    public static final byte   vmLEDS                       = 4;                            //!< Number of LEDs in the system

    public static final byte   vmLCD_WIDTH                  = (byte)178;                    //!< LCD horizontal pixels
    public static final byte   vmLCD_HEIGHT                 = (byte)128;                    //!< LCD vertical pixels
    public static final byte   vmTOPLINE_HEIGHT             = 10;                           //!< Top line vertical pixels
    public static final byte   vmLCD_STORE_LEVELS           = 3;                            //!< Store levels

    public static final byte   vmDEFAULT_VOLUME             = 100;
    public static final byte   vmDEFAULT_SLEEPMINUTES       = 30;

    // SOFTWARE

    public static final byte   vmFG_COLOR                   = 1;                            //!<  Forground color
    public static final byte   vmBG_COLOR                   = 0;                            //!<  Background color

    public static final byte   vmCHAIN_DEPT                 = 4;                            //!< Number of bricks in the USB daisy chain (master + slaves)

    //static final byte   FILEPERMISSIONS               (S_IRUSR | S_IWUSR | S_IRGRP | S_IWGRP | S_IROTH | S_IWOTH)
    //static final byte   DIRPERMISSIONS                (S_IRWXU | S_IRWXG | S_IRWXO)
    //static final byte   SYSPERMISSIONS                (S_IRUSR | S_IWUSR | S_IRGRP | S_IROTH)

    public static final byte   vmPATHSIZE                   = 84;                           //!< Max path size excluding trailing forward slash including zero termination
    public static final byte   vmNAMESIZE                   = 32;                           //!< Max name size including zero termination (must be divideable by= 4)
    public static final byte   vmEXTSIZE                    = 5;                            //!< Max extension size including dot and zero termination
    public static final byte   vmFILENAMESIZE               = 120;                          //!< Max filename size including path, name, extension and termination (must be divideable by= 4)
    public static final byte   vmMACSIZE                    = 18;                           //!< Max WIFI MAC size including zero termination
    public static final byte   vmIPSIZE                     = 16;                           //!< Max WIFI IP size including zero termination
    public static final byte   vmBTADRSIZE                  = 13;                           //!< Max bluetooth address size including zero termination

    public static final byte   vmERR_STRING_SIZE            = 32;                           // Inclusive zero termination

    public static final byte   vmEVENT_BT_PIN               = 1;
    public static final byte   vmEVENT_BT_REQ_CONF          = 2;

    public static final byte   vmMAX_VALID_TYPE             = 101;                          //!< Highest valid device type

    // FOLDERS

    public static final String   vmMEMORY_FOLDER              = "/mnt/ramdisk";               //!< Folder for non volatile user programs/data
    public static final String   vmPROGRAM_FOLDER             = "../prjs/BrkProg_SAVE";       //!< Folder for On Brick Programming programs
    public static final String   vmDATALOG_FOLDER             = "../prjs/BrkDL_SAVE";         //!< Folder for On Brick Data log files
    public static final String   vmSDCARD_FOLDER              = "../prjs/SD_Card";            //!< Folder for SD card mount
    public static final String   vmUSBSTICK_FOLDER            = "../prjs/USB_Stick";          //!< Folder for USB stick mount

    public static final String   vmPRJS_DIR                   = "../prjs";                    //!< Project folder
    public static final String   vmAPPS_DIR                   = "../apps";                    //!< Apps folder
    public static final String   vmTOOLS_DIR                  = "../tools";                   //!< Tools folder
    public static final String   vmTMP_DIR                    = "../tmp";                     //!< Temporary folder

    public static final String   vmSETTINGS_DIR               = "../sys/settings";            //!< Folder for non volatile settings

    public static final byte     vmDIR_DEEPT                  = 127;                          //!< Max directory items allocated including "." and ".."

    // FILES USED IN APPLICATION

    public static final String   vmLASTRUN_FILE_NAME          = "lastrun";                    //!< Last run filename
    public static final String   vmCALDATA_FILE_NAME          = "caldata";                    //!< Calibration data filename

    // FILES USED IN APPS

    public static final String   vmSLEEP_FILE_NAME            = "Sleep";                      //!< File used in "Sleep" app to save status
    public static final String   vmVOLUME_FILE_NAME           = "Volume";                     //!< File used in "Volume" app to save status
    public static final String   vmWIFI_FILE_NAME             = "WiFi";                       //!< File used in "WiFi" app to save status
    public static final String   vmBLUETOOTH_FILE_NAME        = "Bluetooth";                  //!< File used in "Bluetooth" app to save status

    // EXTENSIONS

    public static final String   vmEXT_SOUND                  = ".rsf";                       //!< Robot Sound File
    public static final String   vmEXT_GRAPHICS               = ".rgf";                       //!< Robot Graphics File
    public static final String   vmEXT_BYTECODE               = ".rbf";                       //!< Robot static final byte code File
    public static final String   vmEXT_TEXT                   = ".rtf";                       //!< Robot Text File
    public static final String   vmEXT_DATALOG                = ".rdf";                       //!< Robot Datalog File
    public static final String   vmEXT_PROGRAM                = ".rpf";                       //!< Robot Program File
    public static final String   vmEXT_CONFIG                 = ".rcf";                       //!< Robot Configuration File
    public static final String   vmEXT_ARCHIVE                = ".raf";                       //!< Robot Archive File

    // NAME LENGTHs

    public static final byte   vmBRICKNAMESIZE              = 120;                          //!< Brick name maximal size (including zero termination)
    public static final byte   vmBTPASSKEYSIZE              = 7;                            //!< Bluetooth pass key size (including zero termination)
    public static final byte   vmWIFIPASSKEYSIZE            = 33;                           //!< WiFi pass key size (including zero termination)

    // VALID CHARACTERS

    public static final byte   vmCHARSET_NAME               = 0x01;                         //!< Character set allowed in brick name and raw filenames
    public static final byte   vmCHARSET_FILENAME           = 0x02;                         //!< Character set allowed in file names
    public static final byte   vmCHARSET_BTPASSKEY          = 0x04;                         //!< Character set allowed in bluetooth pass key
    public static final byte   vmCHARSET_WIFIPASSKEY        = 0x08;                         //!< Character set allowed in WiFi pass key
    public static final byte   vmCHARSET_WIFISSID           = 0x10;                         //!< Character set allowed in WiFi ssid

}