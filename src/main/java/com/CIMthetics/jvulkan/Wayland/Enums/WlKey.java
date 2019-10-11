package com.CIMthetics.jvulkan.Wayland.Enums;

public enum WlKey
{
    /*
     * These values were obtained from linux/input-event-codes.h
     */
    KEY_RESERVED    (0),
    KEY_ESC         (1),
    KEY_1           (2),
    KEY_2           (3),
    KEY_3           (4),
    KEY_4           (5),
    KEY_5           (6),
    KEY_6           (7),
    KEY_7           (8),
    KEY_8           (9),
    KEY_9           (10),
    KEY_0           (11),
    KEY_MINUS       (12),
    KEY_EQUAL       (13),
    KEY_BACKSPACE   (14),
    KEY_TAB         (15),
    KEY_Q           (16),
    KEY_W           (17),
    KEY_E           (18),
    KEY_R           (19),
    KEY_T           (20),
    KEY_Y           (21),
    KEY_U           (22),
    KEY_I           (23),
    KEY_O           (24),
    KEY_P           (25),
    KEY_LEFTBRACE       (26),
    KEY_RIGHTBRACE      (27),
    KEY_ENTER       (28),
    KEY_LEFTCTRL        (29),
    KEY_A           (30),
    KEY_S           (31),
    KEY_D           (32),
    KEY_F           (33),
    KEY_G           (34),
    KEY_H           (35),
    KEY_J           (36),
    KEY_K           (37),
    KEY_L           (38),
    KEY_SEMICOLON       (39),
    KEY_APOSTROPHE      (40),
    KEY_GRAVE       (41),
    KEY_LEFTSHIFT       (42),
    KEY_BACKSLASH       (43),
    KEY_Z           (44),
    KEY_X           (45),
    KEY_C           (46),
    KEY_V           (47),
    KEY_B           (48),
    KEY_N           (49),
    KEY_M           (50),
    KEY_COMMA       (51),
    KEY_DOT         (52),
    KEY_SLASH       (53),
    KEY_RIGHTSHIFT  (54),
    KEY_KPASTERISK  (55),
    KEY_LEFTALT     (56),
    KEY_SPACE       (57),
    KEY_CAPSLOCK    (58),
    KEY_F1          (59),
    KEY_F2          (60),
    KEY_F3          (61),
    KEY_F4          (62),
    KEY_F5          (63),
    KEY_F6          (64),
    KEY_F7          (65),
    KEY_F8          (66),
    KEY_F9          (67),
    KEY_F10         (68),
    KEY_NUMLOCK     (69),
    KEY_SCROLLLOCK  (70),
    KEY_KP7         (71),
    KEY_KP8         (72),
    KEY_KP9         (73),
    KEY_KPMINUS     (74),
    KEY_KP4         (75),
    KEY_KP5         (76),
    KEY_KP6         (77),
    KEY_KPPLUS      (78),
    KEY_KP1         (79),
    KEY_KP2         (80),
    KEY_KP3         (81),
    KEY_KP0         (82),
    KEY_KPDOT       (83),

    KEY_ZENKAKUHANKAKU  (85),
    KEY_102ND       (86),
    KEY_F11         (87),
    KEY_F12         (88),
    KEY_RO          (89),
    KEY_KATAKANA    (90),
    KEY_HIRAGANA    (91),
    KEY_HENKAN      (92),
    KEY_KATAKANAHIRAGANA    (93),
    KEY_MUHENKAN    (94),
    KEY_KPJPCOMMA   (95),
    KEY_KPENTER     (96),
    KEY_RIGHTCTRL   (97),
    KEY_KPSLASH     (98),
    KEY_SYSRQ       (99),
    KEY_RIGHTALT    (100),
    KEY_LINEFEED    (101),
    KEY_HOME        (102),
    KEY_UP          (103),
    KEY_PAGEUP      (104),
    KEY_LEFT        (105),
    KEY_RIGHT       (106),
    KEY_END         (107),
    KEY_DOWN        (108),
    KEY_PAGEDOWN    (109),
    KEY_INSERT      (110),
    KEY_DELETE      (111),
    KEY_MACRO       (112),
    KEY_MUTE        (113),
    KEY_VOLUMEDOWN  (114),
    KEY_VOLUMEUP    (115),
    KEY_POWER       (116), /* SC System Power Down */
    KEY_KPEQUAL     (117),
    KEY_KPPLUSMINUS (118),
    KEY_PAUSE       (119),
    KEY_SCALE       (120), /* AL Compiz Scale (Expose) */

    KEY_KPCOMMA     (121),
    KEY_HANGEUL     (122),
    KEY_HANGUEL     (KEY_HANGEUL.valueOf()),
    KEY_HANJA       (123),
    KEY_YEN         (124),
    KEY_LEFTMETA    (125),
    KEY_RIGHTMETA   (126),
    KEY_COMPOSE     (127),

    KEY_STOP        (128), /* AC Stop */
    KEY_AGAIN       (129),
    KEY_PROPS       (130), /* AC Properties */
    KEY_UNDO        (131), /* AC Undo */
    KEY_FRONT       (132),
    KEY_COPY        (133), /* AC Copy */
    KEY_OPEN        (134), /* AC Open */
    KEY_PASTE       (135), /* AC Paste */
    KEY_FIND        (136), /* AC Search */
    KEY_CUT         (137), /* AC Cut */
    KEY_HELP        (138), /* AL Integrated Help Center */
    KEY_MENU        (139), /* Menu (show menu) */
    KEY_CALC        (140), /* AL Calculator */
    KEY_SETUP       (141),
    KEY_SLEEP       (142), /* SC System Sleep */
    KEY_WAKEUP      (143), /* System Wake Up */
    KEY_FILE        (144), /* AL Local Machine Browser */
    KEY_SENDFILE    (145),
    KEY_DELETEFILE  (146),
    KEY_XFER        (147),
    KEY_PROG1       (148),
    KEY_PROG2       (149),
    KEY_WWW         (150), /* AL Internet Browser */
    KEY_MSDOS       (151),
    KEY_COFFEE      (152), /* AL Terminal Lock/Screensaver */
    KEY_SCREENLOCK  (KEY_COFFEE.valueOf()),
    KEY_ROTATE_DISPLAY  (153), /* Display orientation for e.g. tablets */
    KEY_DIRECTION    (KEY_ROTATE_DISPLAY.valueOf()),
    KEY_CYCLEWINDOWS (154),
    KEY_MAIL        (155),
    KEY_BOOKMARKS   (156), /* AC Bookmarks */
    KEY_COMPUTER    (157),
    KEY_BACK        (158), /* AC Back */
    KEY_FORWARD     (159), /* AC Forward */
    KEY_CLOSECD     (160),
    KEY_EJECTCD     (161),
    KEY_EJECTCLOSECD (162),
    KEY_NEXTSONG    (163),
    KEY_PLAYPAUSE   (164),
    KEY_PREVIOUSSONG (165),
    KEY_STOPCD      (166),
    KEY_RECORD      (167),
    KEY_REWIND      (168),
    KEY_PHONE       (169), /* Media Select Telephone */
    KEY_ISO         (170),
    KEY_CONFIG      (171), /* AL Consumer Control Configuration */
    KEY_HOMEPAGE    (172), /* AC Home */
    KEY_REFRESH     (173), /* AC Refresh */
    KEY_EXIT        (174), /* AC Exit */
    KEY_MOVE        (175),
    KEY_EDIT        (176),
    KEY_SCROLLUP    (177),
    KEY_SCROLLDOWN  (178),
    KEY_KPLEFTPAREN (179),
    KEY_KPRIGHTPAREN (180),
    KEY_NEW         (181), /* AC New */
    KEY_REDO        (182), /* AC Redo/Repeat */

    KEY_F13         (183),
    KEY_F14         (184),
    KEY_F15         (185),
    KEY_F16         (186),
    KEY_F17         (187),
    KEY_F18         (188),
    KEY_F19         (189),
    KEY_F20         (190),
    KEY_F21         (191),
    KEY_F22         (192),
    KEY_F23         (193),
    KEY_F24         (194),

    KEY_PLAYCD      (200),
    KEY_PAUSECD     (201),
    KEY_PROG3       (202),
    KEY_PROG4       (203),
    KEY_DASHBOARD   (204), /* AL Dashboard */
    KEY_SUSPEND     (205),
    KEY_CLOSE       (206), /* AC Close */
    KEY_PLAY        (207),
    KEY_FASTFORWARD (208),
    KEY_BASSBOOST   (209),
    KEY_PRINT       (210), /* AC Print */
    KEY_HP          (211),
    KEY_CAMERA      (212),
    KEY_SOUND       (213),
    KEY_QUESTION    (214),
    KEY_EMAIL       (215),
    KEY_CHAT        (216),
    KEY_SEARCH      (217),
    KEY_CONNECT     (218),
    KEY_FINANCE     (219), /* AL Checkbook/Finance */
    KEY_SPORT       (220),
    KEY_SHOP        (221),
    KEY_ALTERASE    (222),
    KEY_CANCEL      (223), /* AC Cancel */
    KEY_BRIGHTNESSDOWN  (224),
    KEY_BRIGHTNESSUP    (225),
    KEY_MEDIA       (226),

    KEY_SWITCHVIDEOMODE (227), /* Cycle between available video
                           outputs (Monitor/LCD/TV-out/etc) */
    KEY_KBDILLUMTOGGLE  (228),
    KEY_KBDILLUMDOWN    (229),
    KEY_KBDILLUMUP      (230),

    KEY_SEND        (231), /* AC Send */
    KEY_REPLY       (232), /* AC Reply */
    KEY_FORWARDMAIL (233), /* AC Forward Msg */
    KEY_SAVE        (234), /* AC Save */
    KEY_DOCUMENTS   (235),

    KEY_BATTERY     (236),

    KEY_BLUETOOTH   (237),
    KEY_WLAN        (238),
    KEY_UWB         (239),

    KEY_UNKNOWN     (240),

    KEY_VIDEO_NEXT      (241), /* drive next video source */
    KEY_VIDEO_PREV      (242), /* drive previous video source */
    KEY_BRIGHTNESS_CYCLE (243), /* brightness up, after max is min */
    KEY_BRIGHTNESS_AUTO (244), /* Set Auto Brightness: manual
                          brightness control is off,
                          rely on ambient */
    KEY_BRIGHTNESS_ZERO (KEY_BRIGHTNESS_AUTO.valueOf()),
    KEY_DISPLAY_OFF     (245), /* display device to off state */

    KEY_WWAN        (246), /* Wireless WAN (LTE, UMTS, GSM, etc.) */
    KEY_WIMAX       (KEY_WWAN.valueOf()),
    KEY_RFKILL      (247), /* Key that controls all radios */

    KEY_MICMUTE     (248), /* Mute / unmute the microphone */

    KEY_OK          (0x160),
    KEY_SELECT      (0x161),
    KEY_GOTO        (0x162),
    KEY_CLEAR       (0x163),
    KEY_POWER2      (0x164),
    KEY_OPTION      (0x165),
    KEY_INFO        (0x166),   /* AL OEM Features/Tips/Tutorial */
    KEY_TIME        (0x167),
    KEY_VENDOR      (0x168),
    KEY_ARCHIVE     (0x169),
    KEY_PROGRAM     (0x16a),   /* Media Select Program Guide */
    KEY_CHANNEL     (0x16b),
    KEY_FAVORITES   (0x16c),
    KEY_EPG         (0x16d),
    KEY_PVR         (0x16e),   /* Media Select Home */
    KEY_MHP         (0x16f),
    KEY_LANGUAGE    (0x170),
    KEY_TITLE       (0x171),
    KEY_SUBTITLE    (0x172),
    KEY_ANGLE       (0x173),
    KEY_FULL_SCREEN (0x174),   /* AC View Toggle */
    KEY_ZOOM        (KEY_FULL_SCREEN.valueOf()),
    KEY_MODE        (0x175),
    KEY_KEYBOARD    (0x176),
    KEY_ASPECT_RATIO (0x177),   /* HUTRR37: Aspect */
    KEY_SCREEN      (KEY_ASPECT_RATIO.valueOf()),
    KEY_PC          (0x178),   /* Media Select Computer */
    KEY_TV          (0x179),   /* Media Select TV */
    KEY_TV2         (0x17a),   /* Media Select Cable */
    KEY_VCR         (0x17b),   /* Media Select VCR */
    KEY_VCR2        (0x17c),   /* VCR Plus */
    KEY_SAT         (0x17d),   /* Media Select Satellite */
    KEY_SAT2        (0x17e),
    KEY_CD          (0x17f),   /* Media Select CD */
    KEY_TAPE        (0x180),   /* Media Select Tape */
    KEY_RADIO       (0x181),
    KEY_TUNER       (0x182),   /* Media Select Tuner */
    KEY_PLAYER      (0x183),
    KEY_TEXT        (0x184),
    KEY_DVD         (0x185),   /* Media Select DVD */
    KEY_AUX         (0x186),
    KEY_MP3         (0x187),
    KEY_AUDIO       (0x188),   /* AL Audio Browser */
    KEY_VIDEO       (0x189),   /* AL Movie Browser */
    KEY_DIRECTORY   (0x18a),
    KEY_LIST        (0x18b),
    KEY_MEMO        (0x18c),   /* Media Select Messages */
    KEY_CALENDAR    (0x18d),
    KEY_RED         (0x18e),
    KEY_GREEN       (0x18f),
    KEY_YELLOW      (0x190),
    KEY_BLUE        (0x191),
    KEY_CHANNELUP   (0x192),   /* Channel Increment */
    KEY_CHANNELDOWN (0x193),   /* Channel Decrement */
    KEY_FIRST       (0x194),
    KEY_LAST        (0x195),   /* Recall Last */
    KEY_AB          (0x196),
    KEY_NEXT        (0x197),
    KEY_RESTART     (0x198),
    KEY_SLOW        (0x199),
    KEY_SHUFFLE     (0x19a),
    KEY_BREAK       (0x19b),
    KEY_PREVIOUS    (0x19c),
    KEY_DIGITS      (0x19d),
    KEY_TEEN        (0x19e),
    KEY_TWEN        (0x19f),
    KEY_VIDEOPHONE  (0x1a0),   /* Media Select Video Phone */
    KEY_GAMES       (0x1a1),   /* Media Select Games */
    KEY_ZOOMIN      (0x1a2),   /* AC Zoom In */
    KEY_ZOOMOUT     (0x1a3),   /* AC Zoom Out */
    KEY_ZOOMRESET   (0x1a4),   /* AC Zoom */
    KEY_WORDPROCESSOR (0x1a5),   /* AL Word Processor */
    KEY_EDITOR      (0x1a6),   /* AL Text Editor */
    KEY_SPREADSHEET     (0x1a7),   /* AL Spreadsheet */
    KEY_GRAPHICSEDITOR  (0x1a8),   /* AL Graphics Editor */
    KEY_PRESENTATION    (0x1a9),   /* AL Presentation App */
    KEY_DATABASE        (0x1aa),   /* AL Database App */
    KEY_NEWS        (0x1ab),   /* AL Newsreader */
    KEY_VOICEMAIL       (0x1ac),   /* AL Voicemail */
    KEY_ADDRESSBOOK     (0x1ad),   /* AL Contacts/Address Book */
    KEY_MESSENGER       (0x1ae),   /* AL Instant Messaging */
    KEY_DISPLAYTOGGLE   (0x1af),   /* Turn display (LCD) on and off */
    KEY_BRIGHTNESS_TOGGLE   (KEY_DISPLAYTOGGLE.valueOf()),
    KEY_SPELLCHECK      (0x1b0),   /* AL Spell Check */
    KEY_LOGOFF      (0x1b1),   /* AL Logoff */

    KEY_DOLLAR      (0x1b2),
    KEY_EURO        (0x1b3),

    KEY_FRAMEBACK       (0x1b4),   /* Consumer - transport controls */
    KEY_FRAMEFORWARD    (0x1b5),
    KEY_CONTEXT_MENU    (0x1b6),   /* GenDesc - system context menu */
    KEY_MEDIA_REPEAT    (0x1b7),   /* Consumer - transport control */
    KEY_10CHANNELSUP    (0x1b8),   /* 10 channels up (10+) */
    KEY_10CHANNELSDOWN  (0x1b9),   /* 10 channels down (10-) */
    KEY_IMAGES      (0x1ba),   /* AL Image Browser */

    KEY_DEL_EOL     (0x1c0),
    KEY_DEL_EOS     (0x1c1),
    KEY_INS_LINE    (0x1c2),
    KEY_DEL_LINE    (0x1c3),

    KEY_FN          (0x1d0),
    KEY_FN_ESC      (0x1d1),
    KEY_FN_F1       (0x1d2),
    KEY_FN_F2       (0x1d3),
    KEY_FN_F3       (0x1d4),
    KEY_FN_F4       (0x1d5),
    KEY_FN_F5       (0x1d6),
    KEY_FN_F6       (0x1d7),
    KEY_FN_F7       (0x1d8),
    KEY_FN_F8       (0x1d9),
    KEY_FN_F9       (0x1da),
    KEY_FN_F10      (0x1db),
    KEY_FN_F11      (0x1dc),
    KEY_FN_F12      (0x1dd),
    KEY_FN_1        (0x1de),
    KEY_FN_2        (0x1df),
    KEY_FN_D        (0x1e0),
    KEY_FN_E        (0x1e1),
    KEY_FN_F        (0x1e2),
    KEY_FN_S        (0x1e3),
    KEY_FN_B        (0x1e4),

    KEY_BRL_DOT1    (0x1f1),
    KEY_BRL_DOT2    (0x1f2),
    KEY_BRL_DOT3    (0x1f3),
    KEY_BRL_DOT4    (0x1f4),
    KEY_BRL_DOT5    (0x1f5),
    KEY_BRL_DOT6    (0x1f6),
    KEY_BRL_DOT7    (0x1f7),
    KEY_BRL_DOT8    (0x1f8),
    KEY_BRL_DOT9    (0x1f9),
    KEY_BRL_DOT10   (0x1fa),

    KEY_NUMERIC_0   (0x200),   /* used by phones, remote controls, */
    KEY_NUMERIC_1   (0x201),   /* and other keypads */
    KEY_NUMERIC_2   (0x202),
    KEY_NUMERIC_3   (0x203),
    KEY_NUMERIC_4   (0x204),
    KEY_NUMERIC_5   (0x205),
    KEY_NUMERIC_6   (0x206),
    KEY_NUMERIC_7   (0x207),
    KEY_NUMERIC_8   (0x208),
    KEY_NUMERIC_9   (0x209),
    KEY_NUMERIC_STAR   (0x20a),
    KEY_NUMERIC_POUND  (0x20b),
    KEY_NUMERIC_A   (0x20c),   /* Phone key A - HUT Telephony 0xb9 */
    KEY_NUMERIC_B   (0x20d),
    KEY_NUMERIC_C   (0x20e),
    KEY_NUMERIC_D   (0x20f),

    KEY_CAMERA_FOCUS    (0x210),
    KEY_WPS_BUTTON      (0x211),   /* WiFi Protected Setup key */

    KEY_TOUCHPAD_TOGGLE (0x212),   /* Request switch touchpad on or off */
    KEY_TOUCHPAD_ON     (0x213),
    KEY_TOUCHPAD_OFF    (0x214),

    KEY_CAMERA_ZOOMIN   (0x215),
    KEY_CAMERA_ZOOMOUT  (0x216),
    KEY_CAMERA_UP       (0x217),
    KEY_CAMERA_DOWN     (0x218),
    KEY_CAMERA_LEFT     (0x219),
    KEY_CAMERA_RIGHT    (0x21a),

    KEY_ATTENDANT_ON    (0x21b),
    KEY_ATTENDANT_OFF   (0x21c),
    KEY_ATTENDANT_TOGGLE    (0x21d),   /* Attendant call on or off */
    KEY_LIGHTS_TOGGLE   (0x21e),   /* Reading light on or off */

    BTN_DPAD_UP     (0x220),
    BTN_DPAD_DOWN   (0x221),
    BTN_DPAD_LEFT   (0x222),
    BTN_DPAD_RIGHT  (0x223),

    KEY_ALS_TOGGLE      (0x230),   /* Ambient light sensor */
    KEY_ROTATE_LOCK_TOGGLE  (0x231),   /* Display rotation lock */

    KEY_BUTTONCONFIG        (0x240),   /* AL Button Configuration */
    KEY_TASKMANAGER     (0x241),   /* AL Task/Project Manager */
    KEY_JOURNAL     (0x242),   /* AL Log/Journal/Timecard */
    KEY_CONTROLPANEL        (0x243),   /* AL Control Panel */
    KEY_APPSELECT       (0x244),   /* AL Select Task/Application */
    KEY_SCREENSAVER     (0x245),   /* AL Screen Saver */
    KEY_VOICECOMMAND        (0x246),   /* Listening Voice Command */
    KEY_ASSISTANT       (0x247),   /* AL Context-aware desktop assistant */

    KEY_BRIGHTNESS_MIN      (0x250),   /* Set Brightness to Minimum */
    KEY_BRIGHTNESS_MAX      (0x251),   /* Set Brightness to Maximum */

    KEY_KBDINPUTASSIST_PREV     (0x260),
    KEY_KBDINPUTASSIST_NEXT     (0x261),
    KEY_KBDINPUTASSIST_PREVGROUP        (0x262),
    KEY_KBDINPUTASSIST_NEXTGROUP        (0x263),
    KEY_KBDINPUTASSIST_ACCEPT       (0x264),
    KEY_KBDINPUTASSIST_CANCEL       (0x265),

    /* Diagonal movement keys */
    KEY_RIGHT_UP        (0x266),
    KEY_RIGHT_DOWN      (0x267),
    KEY_LEFT_UP         (0x268),
    KEY_LEFT_DOWN       (0x269),

    KEY_ROOT_MENU       (0x26a), /* Show Device's Root Menu */
    /* Show Top Menu of the Media (e.g. DVD) */
    KEY_MEDIA_TOP_MENU  (0x26b),
    KEY_NUMERIC_11      (0x26c),
    KEY_NUMERIC_12      (0x26d),
    /*
     * Toggle Audio Description: refers to an audio service that helps blind and
     * visually impaired consumers understand the action in a program. Note: in
     * some countries this is referred to as "Video Description".
     */
    KEY_AUDIO_DESC      (0x26e),
    KEY_3D_MODE         (0x26f),
    KEY_NEXT_FAVORITE   (0x270),
    KEY_STOP_RECORD     (0x271),
    KEY_PAUSE_RECORD    (0x272),
    KEY_VOD             (0x273), /* Video on Demand */
    KEY_UNMUTE          (0x274),
    KEY_FASTREVERSE     (0x275),
    KEY_SLOWREVERSE     (0x276),
    /*
     * Control a data application associated with the currently viewed channel,
     * e.g. teletext or data broadcast application (MHEG, MHP, HbbTV, etc.)
     */
    KEY_DATA            (0x277),
    KEY_ONSCREEN_KEYBOARD       (0x278);

    private int value;
    
    private WlKey(int value) { this.value = value; }
    
    public int valueOf() { return value; }

    public static WlKey fromValue(int inputValue)
    {
        WlKey result = null;
        
        switch(inputValue)
        {
            case 0:
                result = KEY_RESERVED;
                break;
            case 1:
                result = KEY_ESC;
                break;
            case 2:
                result = KEY_1;
                break;
            case 3:
                result = KEY_2;
                break;
            case 4:
                result = KEY_3;
                break;
            case 5:
                result = KEY_4;
                break;
            case 6:
                result = KEY_5;
                break;
            case 7:
                result = KEY_6;
                break;
            case 8:
                result = KEY_7;
                break;
            case 9:
                result = KEY_8;
                break;
            case 10:
                result = KEY_9;
                break;
            case 11:
                result = KEY_0;
                break;
            case 12:
                result = KEY_MINUS;
                break;
            case 13:
                result = KEY_EQUAL;
                break;
            case 14:
                result = KEY_BACKSPACE;
                break;
            case 15:
                result = KEY_TAB;
                break;
            case 16:
                result = KEY_Q;
                break;
            case 17:
                result = KEY_W;
                break;
            case 18:
                result = KEY_E;
                break;
            case 19:
                result = KEY_R;
                break;
            case 20:
                result = KEY_T;
                break;
            case 21:
                result = KEY_Y;
                break;
            case 22:
                result = KEY_U;
                break;
            case 23:
                result = KEY_I;
                break;
            case 24:
                result = KEY_O;
                break;
            case 25:
                result = KEY_P;
                break;
            case 26:
                result = KEY_LEFTBRACE;
                break;
            case 27:
                result = KEY_RIGHTBRACE;
                break;
            case 28:
                result = KEY_ENTER;
                break;
            case 29:
                result = KEY_LEFTCTRL;
                break;
            case 30:
                result = KEY_A;
                break;
            case 31:
                result = KEY_S;
                break;
            case 32:
                result = KEY_D;
                break;
            case 33:
                result = KEY_F;
                break;
            case 34:
                result = KEY_G;
                break;
            case 35:
                result = KEY_H;
                break;
            case 36:
                result = KEY_J;
                break;
            case 37:
                result = KEY_K;
                break;
            case 38:
                result = KEY_L;
                break;
            case 39:
                result = KEY_SEMICOLON;
                break;
            case 40:
                result = KEY_APOSTROPHE;
                break;
            case 41:
                result = KEY_GRAVE;
                break;
            case 42:
                result = KEY_LEFTSHIFT;
                break;
            case 43:
                result = KEY_BACKSLASH;
                break;
            case 44:
                result = KEY_Z;
                break;
            case 45:
                result = KEY_X;
                break;
            case 46:
                result = KEY_C;
                break;
            case 47:
                result = KEY_V;
                break;
            case 48:
                result = KEY_B;
                break;
            case 49:
                result = KEY_N;
                break;
            case 50:
                result = KEY_M;
                break;
            case 51:
                result = KEY_COMMA;
                break;
            case 52:
                result = KEY_DOT;
                break;
            case 53:
                result = KEY_SLASH;
                break;
            case 54:
                result = KEY_RIGHTSHIFT;
                break;
            case 55:
                result = KEY_KPASTERISK;
                break;
            case 56:
                result = KEY_LEFTALT;
                break;
            case 57:
                result = KEY_SPACE;
                break;
            case 58:
                result = KEY_CAPSLOCK;
                break;
            case 59:
                result = KEY_F1;
                break;
            case 60:
                result = KEY_F2;
                break;
            case 61:
                result = KEY_F3;
                break;
            case 62:
                result = KEY_F4;
                break;
            case 63:
                result = KEY_F5;
                break;
            case 64:
                result = KEY_F6;
                break;
            case 65:
                result = KEY_F7;
                break;
            case 66:
                result = KEY_F8;
                break;
            case 67:
                result = KEY_F9;
                break;
            case 68:
                result = KEY_F10;
                break;
            case 69:
                result = KEY_NUMLOCK;
                break;
            case 70:
                result = KEY_SCROLLLOCK;
                break;
            case 71:
                result = KEY_KP7;
                break;
            case 72:
                result = KEY_KP8;
                break;
            case 73:
                result = KEY_KP9;
                break;
            case 74:
                result = KEY_KPMINUS;
                break;
            case 75:
                result = KEY_KP4;
                break;
            case 76:
                result = KEY_KP5;
                break;
            case 77:
                result = KEY_KP6;
                break;
            case 78:
                result = KEY_KPPLUS;
                break;
            case 79:
                result = KEY_KP1;
                break;
            case 80:
                result = KEY_KP2;
                break;
            case 81:
                result = KEY_KP3;
                break;
            case 82:
                result = KEY_KP0;
                break;
            case 83:
                result = KEY_KPDOT;
                break;
            case 85:
                result = KEY_ZENKAKUHANKAKU;
                break;
            case 86:
                result = KEY_102ND;
                break;
            case 87:
                result = KEY_F11;
                break;
            case 88:
                result = KEY_F12;
                break;
            case 89:
                result = KEY_RO;
                break;
            case 90:
                result = KEY_KATAKANA;
                break;
            case 91:
                result = KEY_HIRAGANA;
                break;
            case 92:
                result = KEY_HENKAN;
                break;
            case 93:
                result = KEY_KATAKANAHIRAGANA;
                break;
            case 94:
                result = KEY_MUHENKAN;
                break;
            case 95:
                result = KEY_KPJPCOMMA;
                break;
            case 96:
                result = KEY_KPENTER;
                break;
            case 97:
                result = KEY_RIGHTCTRL;
                break;
            case 98:
                result = KEY_KPSLASH;
                break;
            case 99:
                result = KEY_SYSRQ;
                break;
            case 100:
                result = KEY_RIGHTALT;
                break;
            case 101:
                result = KEY_LINEFEED;
                break;
            case 102:
                result = KEY_HOME;
                break;
            case 103:
                result = KEY_UP;
                break;
            case 104:
                result = KEY_PAGEUP;
                break;
            case 105:
                result = KEY_LEFT;
                break;
            case 106:
                result = KEY_RIGHT;
                break;
            case 107:
                result = KEY_END;
                break;
            case 108:
                result = KEY_DOWN;
                break;
            case 109:
                result = KEY_PAGEDOWN;
                break;
            case 110:
                result = KEY_INSERT;
                break;
            case 111:
                result = KEY_DELETE;
                break;
            case 112:
                result = KEY_MACRO;
                break;
            case 113:
                result = KEY_MUTE;
                break;
            case 114:
                result = KEY_VOLUMEDOWN;
                break;
            case 115:
                result = KEY_VOLUMEUP;
                break;
            case 116:
                result = KEY_POWER;
                break;
            case 117:
                result = KEY_KPEQUAL;
                break;
            case 118:
                result = KEY_KPPLUSMINUS;
                break;
            case 119:
                result = KEY_PAUSE;
                break;
            case 120:
                result = KEY_SCALE;
                break;
            case 121:
                result = KEY_KPCOMMA;
                break;
            case 122:
                result = KEY_HANGEUL;
                break;
            case 123:
                result = KEY_HANJA;
                break;
            case 124:
                result = KEY_YEN;
                break;
            case 125:
                result = KEY_LEFTMETA;
                break;
            case 126:
                result = KEY_RIGHTMETA;
                break;
            case 127:
                result = KEY_COMPOSE;
                break;
            case 128:
                result = KEY_STOP;
                break;
            case 129:
                result = KEY_AGAIN;
                break;
            case 130:
                result = KEY_PROPS;
                break;
            case 131:
                result = KEY_UNDO;
                break;
            case 132:
                result = KEY_FRONT;
                break;
            case 133:
                result = KEY_COPY;
                break;
            case 134:
                result = KEY_OPEN;
                break;
            case 135:
                result = KEY_PASTE;
                break;
            case 136:
                result = KEY_FIND;
                break;
            case 137:
                result = KEY_CUT;
                break;
            case 138:
                result = KEY_HELP;
                break;
            case 139:
                result = KEY_MENU;
                break;
            case 140:
                result = KEY_CALC;
                break;
            case 141:
                result = KEY_SETUP;
                break;
            case 142:
                result = KEY_SLEEP;
                break;
            case 143:
                result = KEY_WAKEUP;
                break;
            case 144:
                result = KEY_FILE;
                break;
            case 145:
                result = KEY_SENDFILE;
                break;
            case 146:
                result = KEY_DELETEFILE;
                break;
            case 147:
                result = KEY_XFER;
                break;
            case 148:
                result = KEY_PROG1;
                break;
            case 149:
                result = KEY_PROG2;
                break;
            case 150:
                result = KEY_WWW;
                break;
            case 151:
                result = KEY_MSDOS;
                break;
            case 152:
                result = KEY_SCREENLOCK;
                break;
            case 153:
                result = KEY_ROTATE_DISPLAY;
                break;
            case 154:
                result = KEY_CYCLEWINDOWS;
                break;
            case 155:
                result = KEY_MAIL;
                break;
            case 156:
                result = KEY_BOOKMARKS;
                break;
            case 157:
                result = KEY_COMPUTER;
                break;
            case 158:
                result = KEY_BACK;
                break;
            case 159:
                result = KEY_FORWARD;
                break;
            case 160:
                result = KEY_CLOSECD;
                break;
            case 161:
                result = KEY_EJECTCD;
                break;
            case 162:
                result = KEY_EJECTCLOSECD;
                break;
            case 163:
                result = KEY_NEXTSONG;
                break;
            case 164:
                result = KEY_PLAYPAUSE;
                break;
            case 165:
                result = KEY_PREVIOUSSONG;
                break;
            case 166:
                result = KEY_STOPCD;
                break;
            case 167:
                result = KEY_RECORD;
                break;
            case 168:
                result = KEY_REWIND;
                break;
            case 169:
                result = KEY_PHONE;
                break;
            case 170:
                result = KEY_ISO;
                break;
            case 171:
                result = KEY_CONFIG;
                break;
            case 172:
                result = KEY_HOMEPAGE;
                break;
            case 173:
                result = KEY_REFRESH;
                break;
            case 174:
                result = KEY_EXIT;
                break;
            case 175:
                result = KEY_MOVE;
                break;
            case 176:
                result = KEY_EDIT;
                break;
            case 177:
                result = KEY_SCROLLUP;
                break;
            case 178:
                result = KEY_SCROLLDOWN;
                break;
            case 179:
                result = KEY_KPLEFTPAREN;
                break;
            case 180:
                result = KEY_KPRIGHTPAREN;
                break;
            case 181:
                result = KEY_NEW;
                break;
            case 182:
                result = KEY_REDO;
                break;
            case 183:
                result = KEY_F13;
                break;
            case 184:
                result = KEY_F14;
                break;
            case 185:
                result = KEY_F15;
                break;
            case 186:
                result = KEY_F16;
                break;
            case 187:
                result = KEY_F17;
                break;
            case 188:
                result = KEY_F18;
                break;
            case 189:
                result = KEY_F19;
                break;
            case 190:
                result = KEY_F20;
                break;
            case 191:
                result = KEY_F21;
                break;
            case 192:
                result = KEY_F22;
                break;
            case 193:
                result = KEY_F23;
                break;
            case 194:
                result = KEY_F24;
                break;
            case 200:
                result = KEY_PLAYCD;
                break;
            case 201:
                result = KEY_PAUSECD;
                break;
            case 202:
                result = KEY_PROG3;
                break;
            case 203:
                result = KEY_PROG4;
                break;
            case 204:
                result = KEY_DASHBOARD;
                break;
            case 205:
                result = KEY_SUSPEND;
                break;
            case 206:
                result = KEY_CLOSE;
                break;
            case 207:
                result = KEY_PLAY;
                break;
            case 208:
                result = KEY_FASTFORWARD;
                break;
            case 209:
                result = KEY_BASSBOOST;
                break;
            case 210:
                result = KEY_PRINT;
                break;
            case 211:
                result = KEY_HP;
                break;
            case 212:
                result = KEY_CAMERA;
                break;
            case 213:
                result = KEY_SOUND;
                break;
            case 214:
                result = KEY_QUESTION;
                break;
            case 215:
                result = KEY_EMAIL;
                break;
            case 216:
                result = KEY_CHAT;
                break;
            case 217:
                result = KEY_SEARCH;
                break;
            case 218:
                result = KEY_CONNECT;
                break;
            case 219:
                result = KEY_FINANCE;
                break;
            case 220:
                result = KEY_SPORT;
                break;
            case 221:
                result = KEY_SHOP;
                break;
            case 222:
                result = KEY_ALTERASE;
                break;
            case 223:
                result = KEY_CANCEL;
                break;
            case 224:
                result = KEY_BRIGHTNESSDOWN;
                break;
            case 225:
                result = KEY_BRIGHTNESSUP;
                break;
            case 226:
                result = KEY_MEDIA;
                break;
            case 227:
                result = KEY_SWITCHVIDEOMODE;
                break;
            case 228:
                result = KEY_KBDILLUMTOGGLE;
                break;
            case 229:
                result = KEY_KBDILLUMDOWN;
                break;
            case 230:
                result = KEY_KBDILLUMUP;
                break;
            case 231:
                result = KEY_SEND;
                break;
            case 232:
                result = KEY_REPLY;
                break;
            case 233:
                result = KEY_FORWARDMAIL;
                break;
            case 234:
                result = KEY_SAVE;
                break;
            case 235:
                result = KEY_DOCUMENTS;
                break;
            case 236:
                result = KEY_BATTERY;
                break;
            case 237:
                result = KEY_BLUETOOTH;
                break;
            case 238:
                result = KEY_WLAN;
                break;
            case 239:
                result = KEY_UWB;
                break;
            case 240:
                result = KEY_UNKNOWN;
                break;
            case 241:
                result = KEY_VIDEO_NEXT;
                break;
            case 242:
                result = KEY_VIDEO_PREV;
                break;
            case 243:
                result = KEY_BRIGHTNESS_CYCLE;
                break;
            case 244:
                result = KEY_BRIGHTNESS_AUTO;
                break;
//            case KEY_BRIGHTNESS_AUTO.valueOf():
//                result = KEY_BRIGHTNESS_ZERO;
//                break;
            case 245:
                result = KEY_DISPLAY_OFF;
                break;
            case 246:
                result = KEY_WWAN;
                break;
//            case KEY_WWAN.valueOf():
//                result = KEY_WIMAX;
//                break;
            case 247:
                result = KEY_RFKILL;
                break;
            case 248:
                result = KEY_MICMUTE;
                break;
            case 0x160:
                result = KEY_OK;
                break;
            case 0x161:
                result = KEY_SELECT;
                break;
            case 0x162:
                result = KEY_GOTO;
                break;
            case 0x163:
                result = KEY_CLEAR;
                break;
            case 0x164:
                result = KEY_POWER2;
                break;
            case 0x165:
                result = KEY_OPTION;
                break;
            case 0x166:
                result = KEY_INFO;
                break;
            case 0x167:
                result = KEY_TIME;
                break;
            case 0x168:
                result = KEY_VENDOR;
                break;
            case 0x169:
                result = KEY_ARCHIVE;
                break;
            case 0x16a:
                result = KEY_PROGRAM;
                break;
            case 0x16b:
                result = KEY_CHANNEL;
                break;
            case 0x16c:
                result = KEY_FAVORITES;
                break;
            case 0x16d:
                result = KEY_EPG;
                break;
            case 0x16e:
                result = KEY_PVR;
                break;
            case 0x16f:
                result = KEY_MHP;
                break;
            case 0x170:
                result = KEY_LANGUAGE;
                break;
            case 0x171:
                result = KEY_TITLE;
                break;
            case 0x172:
                result = KEY_SUBTITLE;
                break;
            case 0x173:
                result = KEY_ANGLE;
                break;
            case 0x174:
                result = KEY_FULL_SCREEN;
                break;
//            case KEY_FULL_SCREEN.valueOf():
//                result = KEY_ZOOM;
//                break;
            case 0x175:
                result = KEY_MODE;
                break;
            case 0x176:
                result = KEY_KEYBOARD;
                break;
            case 0x177:
                result = KEY_ASPECT_RATIO;
                break;
//            case KEY_ASPECT_RATIO.valueOf():
//                result = KEY_SCREEN;
//                break;
            case 0x178:
                result = KEY_PC;
                break;
            case 0x179:
                result = KEY_TV;
                break;
            case 0x17a:
                result = KEY_TV2;
                break;
            case 0x17b:
                result = KEY_VCR;
                break;
            case 0x17c:
                result = KEY_VCR2;
                break;
            case 0x17d:
                result = KEY_SAT;
                break;
            case 0x17e:
                result = KEY_SAT2;
                break;
            case 0x17f:
                result = KEY_CD;
                break;
            case 0x180:
                result = KEY_TAPE;
                break;
            case 0x181:
                result = KEY_RADIO;
                break;
            case 0x182:
                result = KEY_TUNER;
                break;
            case 0x183:
                result = KEY_PLAYER;
                break;
            case 0x184:
                result = KEY_TEXT;
                break;
            case 0x185:
                result = KEY_DVD;
                break;
            case 0x186:
                result = KEY_AUX;
                break;
            case 0x187:
                result = KEY_MP3;
                break;
            case 0x188:
                result = KEY_AUDIO;
                break;
            case 0x189:
                result = KEY_VIDEO;
                break;
            case 0x18a:
                result = KEY_DIRECTORY;
                break;
            case 0x18b:
                result = KEY_LIST;
                break;
            case 0x18c:
                result = KEY_MEMO;
                break;
            case 0x18d:
                result = KEY_CALENDAR;
                break;
            case 0x18e:
                result = KEY_RED;
                break;
            case 0x18f:
                result = KEY_GREEN;
                break;
            case 0x190:
                result = KEY_YELLOW;
                break;
            case 0x191:
                result = KEY_BLUE;
                break;
            case 0x192:
                result = KEY_CHANNELUP;
                break;
            case 0x193:
                result = KEY_CHANNELDOWN;
                break;
            case 0x194:
                result = KEY_FIRST;
                break;
            case 0x195:
                result = KEY_LAST;
                break;
            case 0x196:
                result = KEY_AB;
                break;
            case 0x197:
                result = KEY_NEXT;
                break;
            case 0x198:
                result = KEY_RESTART;
                break;
            case 0x199:
                result = KEY_SLOW;
                break;
            case 0x19a:
                result = KEY_SHUFFLE;
                break;
            case 0x19b:
                result = KEY_BREAK;
                break;
            case 0x19c:
                result = KEY_PREVIOUS;
                break;
            case 0x19d:
                result = KEY_DIGITS;
                break;
            case 0x19e:
                result = KEY_TEEN;
                break;
            case 0x19f:
                result = KEY_TWEN;
                break;
            case 0x1a0:
                result = KEY_VIDEOPHONE;
                break;
            case 0x1a1:
                result = KEY_GAMES;
                break;
            case 0x1a2:
                result = KEY_ZOOMIN;
                break;
            case 0x1a3:
                result = KEY_ZOOMOUT;
                break;
            case 0x1a4:
                result = KEY_ZOOMRESET;
                break;
            case 0x1a5:
                result = KEY_WORDPROCESSOR;
                break;
            case 0x1a6:
                result = KEY_EDITOR;
                break;
            case 0x1a7:
                result = KEY_SPREADSHEET;
                break;
            case 0x1a8:
                result = KEY_GRAPHICSEDITOR;
                break;
            case 0x1a9:
                result = KEY_PRESENTATION;
                break;
            case 0x1aa:
                result = KEY_DATABASE;
                break;
            case 0x1ab:
                result = KEY_NEWS;
                break;
            case 0x1ac:
                result = KEY_VOICEMAIL;
                break;
            case 0x1ad:
                result = KEY_ADDRESSBOOK;
                break;
            case 0x1ae:
                result = KEY_MESSENGER;
                break;
            case 0x1af:
                result = KEY_DISPLAYTOGGLE;
                break;
//            case KEY_DISPLAYTOGGLE.valueOf():
//                result = KEY_BRIGHTNESS_TOGGLE;
//                break;
            case 0x1b0:
                result = KEY_SPELLCHECK;
                break;
            case 0x1b1:
                result = KEY_LOGOFF;
                break;
            case 0x1b2:
                result = KEY_DOLLAR;
                break;
            case 0x1b3:
                result = KEY_EURO;
                break;
            case 0x1b4:
                result = KEY_FRAMEBACK;
                break;
            case 0x1b5:
                result = KEY_FRAMEFORWARD;
                break;
            case 0x1b6:
                result = KEY_CONTEXT_MENU;
                break;
            case 0x1b7:
                result = KEY_MEDIA_REPEAT;
                break;
            case 0x1b8:
                result = KEY_10CHANNELSUP;
                break;
            case 0x1b9:
                result = KEY_10CHANNELSDOWN;
                break;
            case 0x1ba:
                result = KEY_IMAGES;
                break;
            case 0x1c0:
                result = KEY_DEL_EOL;
                break;
            case 0x1c1:
                result = KEY_DEL_EOS;
                break;
            case 0x1c2:
                result = KEY_INS_LINE;
                break;
            case 0x1c3:
                result = KEY_DEL_LINE;
                break;
            case 0x1d0:
                result = KEY_FN;
                break;
            case 0x1d1:
                result = KEY_FN_ESC;
                break;
            case 0x1d2:
                result = KEY_FN_F1;
                break;
            case 0x1d3:
                result = KEY_FN_F2;
                break;
            case 0x1d4:
                result = KEY_FN_F3;
                break;
            case 0x1d5:
                result = KEY_FN_F4;
                break;
            case 0x1d6:
                result = KEY_FN_F5;
                break;
            case 0x1d7:
                result = KEY_FN_F6;
                break;
            case 0x1d8:
                result = KEY_FN_F7;
                break;
            case 0x1d9:
                result = KEY_FN_F8;
                break;
            case 0x1da:
                result = KEY_FN_F9;
                break;
            case 0x1db:
                result = KEY_FN_F10;
                break;
            case 0x1dc:
                result = KEY_FN_F11;
                break;
            case 0x1dd:
                result = KEY_FN_F12;
                break;
            case 0x1de:
                result = KEY_FN_1;
                break;
            case 0x1df:
                result = KEY_FN_2;
                break;
            case 0x1e0:
                result = KEY_FN_D;
                break;
            case 0x1e1:
                result = KEY_FN_E;
                break;
            case 0x1e2:
                result = KEY_FN_F;
                break;
            case 0x1e3:
                result = KEY_FN_S;
                break;
            case 0x1e4:
                result = KEY_FN_B;
                break;
            case 0x1f1:
                result = KEY_BRL_DOT1;
                break;
            case 0x1f2:
                result = KEY_BRL_DOT2;
                break;
            case 0x1f3:
                result = KEY_BRL_DOT3;
                break;
            case 0x1f4:
                result = KEY_BRL_DOT4;
                break;
            case 0x1f5:
                result = KEY_BRL_DOT5;
                break;
            case 0x1f6:
                result = KEY_BRL_DOT6;
                break;
            case 0x1f7:
                result = KEY_BRL_DOT7;
                break;
            case 0x1f8:
                result = KEY_BRL_DOT8;
                break;
            case 0x1f9:
                result = KEY_BRL_DOT9;
                break;
            case 0x1fa:
                result = KEY_BRL_DOT10;
                break;
            case 0x200:
                result = KEY_NUMERIC_0;
                break;
            case 0x201:
                result = KEY_NUMERIC_1;
                break;
            case 0x202:
                result = KEY_NUMERIC_2;
                break;
            case 0x203:
                result = KEY_NUMERIC_3;
                break;
            case 0x204:
                result = KEY_NUMERIC_4;
                break;
            case 0x205:
                result = KEY_NUMERIC_5;
                break;
            case 0x206:
                result = KEY_NUMERIC_6;
                break;
            case 0x207:
                result = KEY_NUMERIC_7;
                break;
            case 0x208:
                result = KEY_NUMERIC_8;
                break;
            case 0x209:
                result = KEY_NUMERIC_9;
                break;
            case 0x20a:
                result = KEY_NUMERIC_STAR;
                break;
            case 0x20b:
                result = KEY_NUMERIC_POUND;
                break;
            case 0x20c:
                result = KEY_NUMERIC_A;
                break;
            case 0x20d:
                result = KEY_NUMERIC_B;
                break;
            case 0x20e:
                result = KEY_NUMERIC_C;
                break;
            case 0x20f:
                result = KEY_NUMERIC_D;
                break;
            case 0x210:
                result = KEY_CAMERA_FOCUS;
                break;
            case 0x211:
                result = KEY_WPS_BUTTON;
                break;
            case 0x212:
                result = KEY_TOUCHPAD_TOGGLE;
                break;
            case 0x213:
                result = KEY_TOUCHPAD_ON;
                break;
            case 0x214:
                result = KEY_TOUCHPAD_OFF;
                break;
            case 0x215:
                result = KEY_CAMERA_ZOOMIN;
                break;
            case 0x216:
                result = KEY_CAMERA_ZOOMOUT;
                break;
            case 0x217:
                result = KEY_CAMERA_UP;
                break;
            case 0x218:
                result = KEY_CAMERA_DOWN;
                break;
            case 0x219:
                result = KEY_CAMERA_LEFT;
                break;
            case 0x21a:
                result = KEY_CAMERA_RIGHT;
                break;
            case 0x21b:
                result = KEY_ATTENDANT_ON;
                break;
            case 0x21c:
                result = KEY_ATTENDANT_OFF;
                break;
            case 0x21d:
                result = KEY_ATTENDANT_TOGGLE;
                break;
            case 0x21e:
                result = KEY_LIGHTS_TOGGLE;
                break;
            case 0x220:
                result = BTN_DPAD_UP;
                break;
            case 0x221:
                result = BTN_DPAD_DOWN;
                break;
            case 0x222:
                result = BTN_DPAD_LEFT;
                break;
            case 0x223:
                result = BTN_DPAD_RIGHT;
                break;
            case 0x230:
                result = KEY_ALS_TOGGLE;
                break;
            case 0x231:
                result = KEY_ROTATE_LOCK_TOGGLE;
                break;
            case 0x240:
                result = KEY_BUTTONCONFIG;
                break;
            case 0x241:
                result = KEY_TASKMANAGER;
                break;
            case 0x242:
                result = KEY_JOURNAL;
                break;
            case 0x243:
                result = KEY_CONTROLPANEL;
                break;
            case 0x244:
                result = KEY_APPSELECT;
                break;
            case 0x245:
                result = KEY_SCREENSAVER;
                break;
            case 0x246:
                result = KEY_VOICECOMMAND;
                break;
            case 0x247:
                result = KEY_ASSISTANT;
                break;
            case 0x250:
                result = KEY_BRIGHTNESS_MIN;
                break;
            case 0x251:
                result = KEY_BRIGHTNESS_MAX;
                break;
            case 0x260:
                result = KEY_KBDINPUTASSIST_PREV;
                break;
            case 0x261:
                result = KEY_KBDINPUTASSIST_NEXT;
                break;
            case 0x262:
                result = KEY_KBDINPUTASSIST_PREVGROUP;
                break;
            case 0x263:
                result = KEY_KBDINPUTASSIST_NEXTGROUP;
                break;
            case 0x264:
                result = KEY_KBDINPUTASSIST_ACCEPT;
                break;
            case 0x265:
                result = KEY_KBDINPUTASSIST_CANCEL;
                break;
            case 0x266:
                result = KEY_RIGHT_UP;
                break;
            case 0x267:
                result = KEY_RIGHT_DOWN;
                break;
            case 0x268:
                result = KEY_LEFT_UP;
                break;
            case 0x269:
                result = KEY_LEFT_DOWN;
                break;
            case 0x26a:
                result = KEY_ROOT_MENU;
                break;
            case 0x26b:
                result = KEY_MEDIA_TOP_MENU;
                break;
            case 0x26c:
                result = KEY_NUMERIC_11;
                break;
            case 0x26d:
                result = KEY_NUMERIC_12;
                break;
            case 0x26e:
                result = KEY_AUDIO_DESC;
                break;
            case 0x26f:
                result = KEY_3D_MODE;
                break;
            case 0x270:
                result = KEY_NEXT_FAVORITE;
                break;
            case 0x271:
                result = KEY_STOP_RECORD;
                break;
            case 0x272:
                result = KEY_PAUSE_RECORD;
                break;
            case 0x273:
                result = KEY_VOD;
                break;
            case 0x274:
                result = KEY_UNMUTE;
                break;
            case 0x275:
                result = KEY_FASTREVERSE;
                break;
            case 0x276:
                result = KEY_SLOWREVERSE;
                break;
            case 0x277:
                result = KEY_DATA;
                break;
            case 0x278:
                result = KEY_ONSCREEN_KEYBOARD;
                break;
        }

        if (result == null)
            throw new IllegalArgumentException("Illegal value specified for this Enum.");

        return result;
    }

}
