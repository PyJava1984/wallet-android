package org.trinity.wallet;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class ConfigList {
    public static final String REGEX_NEO_PUBLIC_KEY = "^[0-9a-f]{66}$";
    public static final String REGEX_IP_PORT = "^(25[0-5]|2[0-4]\\d|((1\\d{2})|([1-9]?\\d)))\\.(25[0-5]|2[0-4]\\d|((1\\d{2})|([1-9]?\\d)))\\.(25[0-5]|2[0-4]\\d|((1\\d{2})|([1-9]?\\d)))\\.(25[0-5]|2[0-4]\\d|((1\\d{2})|([1-9]?\\d))):([0-9]|[1-9]\\d|[1-9]\\d{2}|[1-9]\\d{3}|[1-5]\\d{4}|6[0-4]\\d{3}|65[0-4]\\d{2}|655[0-2]\\d|6553[0-5])$";

    public static final String HTTP_URL_PREFIX = "http://";
    public static final String WS_URL_PREFIX = "ws://";
    public static final String MAIN_NET_URL = HTTP_URL_PREFIX + "47.96.175.193:21332";
    public static final String MAIN_NET_URL_FOR_NEO = HTTP_URL_PREFIX + "47.96.175.193:10332";
    public static final String TEST_NET_URL = HTTP_URL_PREFIX + "47.254.64.251:21332";
    public static final String TEST_NET_URL_FOR_NEO = HTTP_URL_PREFIX + "47.254.64.251:20332";
    public static final String MAIN_NET_MAGIC = "763040120030515";
    public static final String TEST_NET_MAGIC = "195378745719990331";

    public static final int COIN_TYPE_ACCOUNT = 3;
    public static final int BACK_RESULT = 0;
    public static final int SIGN_IN_RESULT = 1;
    public static final int SIGN_OUT_RESULT = 2;
    public static final int CHANGE_PASSWORD_RESULT = 3;
    public static final int SCAN_RESULT = -1;

    public static final int BLOCK_SYNC_TIME = 15;
    public static final double POST_TIME_AT_LEAST = 0.2;
    public static final int READ_TIME_OUT = 20;
    public static final int WRITE_TIME_OUT = 20;
    public static final int CONNECT_TIME_OUT = 20;
    public static final String CLIENT_MEDIA_TYPE = "application/json; charset=utf-8";

    public static final int NEO_ADDRESS_LENGTH = 34;
    public static final String NEO_ADDRESS_FIRST = "A";
    public static final String PAYMENT_CODE_FIRST = "TN";
    public static final String NET_TYPE_MAIN = "MAIN";
    public static final String NET_TYPE_TEST = "TEST";
    public static final int USER_PASSWORD_MIN = 8;
    public static final int USER_PASSWORD_MAX = 16;
    public static final int QR_CODE_WIDTH = 1024;
    public static final int QR_CODE_HEIGHT = 1024;
    public static final int QR_MARGIN = 1;
    public static final String CHANNEL_STATE_HEATING = "Heating";
    public static final String CHANNEL_STATE_CLEAR = "Clear";
    public static final String CHANNEL_STATE_COOLING = "Cooling";
    public static final String CHANNEL_STATE_DISMANTLED = "Dismantled";
    public static final String GATEWAY_SPV_PORT = "8766";


    public static final List<String> SAVE_LIST = new ArrayList<>();
    public static final String SAVE_WALLET_KEY = "WIF";
    public static final String SAVE_NET = "NET";
    public static final String SAVE_CHANNEL_LIST = "CHANNEL_LIST";
    public static final String SAVE_RECORD_LIST = "RECORD_LIST";
    public static final String SAVE_USER_PASSWORD = "PASSWORD";

    public static final Map<String, String> ASSET_ID_MAP = new HashMap<>();
    public static final String ASSET_ID_MAP_KEY_TNC = "TNC";
    public static final String ASSET_ID_MAP_KEY_NEO = "NEO";
    public static final String ASSET_ID_MAP_KEY_GAS = "GAS";
    public static final String ASSET_ID_TNC_MAIN = "0x08e8c4400f1af2c20c28e0018f29535eb85d15b6";
    public static final String ASSET_ID_TNC_TEST = "0x849d095d07950b9e56d0c895ec48ec5100cfdff1";
    public static final String ASSET_ID_NEO = "0xc56f33fc6ecfcd0c225c4ab356fee59390af8560be0e930faebe74a6daff7c9b";
    public static final String ASSET_ID_GAS = "0x602c79718b16e442de58778e148d0b1084e3b2dffd5de6b7b16cee7969282de7";
    public static final int COIN_DIGITS = 8;

    static {
        SAVE_LIST.add(SAVE_WALLET_KEY);
        SAVE_LIST.add(SAVE_NET);
        SAVE_LIST.add(SAVE_CHANNEL_LIST);
        SAVE_LIST.add(SAVE_RECORD_LIST);
        SAVE_LIST.add(SAVE_USER_PASSWORD);

        ASSET_ID_MAP.put(ASSET_ID_MAP_KEY_TNC, ASSET_ID_TNC_MAIN);
        ASSET_ID_MAP.put(ASSET_ID_MAP_KEY_NEO, ASSET_ID_NEO);
        ASSET_ID_MAP.put(ASSET_ID_MAP_KEY_GAS, ASSET_ID_GAS);
    }
}
