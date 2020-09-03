package homework.enum_http;

import java.util.HashMap;
import java.util.Map;

public class HttpCodeService {

    public void processHttp(String text) {
        //todo dgasfdjgsafd  httpcode: 404   sjdghfkjdshgafsdah
        int httpCode = getHttpCode(text);
        Map<Integer, HttpCodes> map = createHttpCodesMap();
        map.get(httpCode / 100).codeReaction(httpCode);
    }

    private int getHttpCode(String text) {
        int endOfKeyWord = text.indexOf("httpcode:") + 9;
        while (!Character.isDigit(text.charAt(endOfKeyWord))) {
            endOfKeyWord++;
        }

        return Integer.parseInt(text.substring(endOfKeyWord, endOfKeyWord + 3));
    }

    private static Map<Integer, HttpCodes> createHttpCodesMap() {
        Map<Integer, HttpCodes> map = new HashMap<>();
        map.put(1, HttpCodes.INFORMATIONAL);
        map.put(2, HttpCodes.SUCCESS);
        map.put(3, HttpCodes.REDIRECTION);
        map.put(4, HttpCodes.CLIENT_ERROR);
        map.put(5, HttpCodes.SERVER_ERROR);

        return map;
    }

}
