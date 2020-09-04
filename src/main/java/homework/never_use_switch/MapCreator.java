package homework.never_use_switch;

import homework.never_use_switch.mail_types.CallbackMailMessage;
import homework.never_use_switch.mail_types.WelcomeMailMessage;

import java.util.HashMap;
import java.util.Map;

public class MapCreator {
    private static Map<Integer, MailSender> fromIntTypeToRealMailTypeMap = new HashMap<>();
    private static boolean isInit = false;


    private MapCreator() {

    }

    private static void createMap() {
        fromIntTypeToRealMailTypeMap.put(Const.WELCOME, new WelcomeMailMessage());
        fromIntTypeToRealMailTypeMap.put(Const.CALLBACK, new CallbackMailMessage());
    }

    public static Map<Integer, MailSender> getFromIntTypeToRealMailTypeMap() {
        if (!isInit) {
            createMap();
            isInit = true;
        }
        return fromIntTypeToRealMailTypeMap;
    }
}
