package homework.enum_http;

import java.util.HashMap;
import java.util.Map;

public class HttpCodeService {

    public void processHttp(String text) {
        //todo dgasfdjgsafd  httpcode: 404   sjdghfkjdshgafsdah
        int httpCode = getHttpCode(text);
        System.out.println(HttpCodes.getStatus(httpCode));
    }

    private int getHttpCode(String text) {
        int endOfKeyWord = text.indexOf("httpcode:") + 9;
        while (!Character.isDigit(text.charAt(endOfKeyWord))) {
            endOfKeyWord++;
        }

        return Integer.parseInt(text.substring(endOfKeyWord, endOfKeyWord + 3));
    }

}
