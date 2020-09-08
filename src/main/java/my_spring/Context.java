package my_spring;

import lombok.Setter;

public class Context {

    @Setter
    private Config config;

    private final ObjectFactory objectFactory = ObjectFactory.getInstance();


    public Context(Config config) {
        this.config = config;
        objectFactory.setConfig(config);
    }

    public <T> T createObject(Class<T> type) {
        return objectFactory.createObject(type);
    }
}
