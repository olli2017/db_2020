package homework.enum_http;

public enum HttpCodes {
    INFORMATIONAL, SUCCESS, REDIRECTION, CLIENT_ERROR, SERVER_ERROR;

    static HttpCodes getStatus(int code){
        code = code / 100;
        HttpCodes[] values = values();
        for (int i = 0; i < values.length; i++) {
            if (code == i + 1) {
                return values[i];
            }
        }
        return null;
    }

}
