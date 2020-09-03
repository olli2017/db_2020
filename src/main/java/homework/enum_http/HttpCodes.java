package homework.enum_http;

public enum HttpCodes {
    INFORMATIONAL {
        @Override void codeReaction(int code){
            System.out.println("Informational with code: " + code);
        }
    }, SUCCESS {
        @Override void codeReaction(int code){
            System.out.println("Success with code: " + code);
        }
    }, REDIRECTION {
        @Override void codeReaction(int code){
            System.out.println("Redirection with code: " + code);
        }
    }, CLIENT_ERROR {
        @Override void codeReaction(int code){
            System.out.println("ClientError with code: " + code);
        }
    }, SERVER_ERROR {
        @Override void codeReaction(int code){
            System.out.println("ServerError with code: " + code);
        }
    };

    abstract void codeReaction(int code);
}
