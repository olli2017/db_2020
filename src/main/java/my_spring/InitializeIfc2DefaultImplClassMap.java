package my_spring;

import java.util.Map;

public class InitializeIfc2DefaultImplClassMap {

    private static Map<Class, Class> map = Map.of(
            Speaker.class, ConsoleSpeaker.class,
            Cleaner.class, CleanerImpl.class
    );

    public static Map<Class, Class> getMap() {
        return map;
    }
}
