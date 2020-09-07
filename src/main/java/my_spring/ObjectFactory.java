package my_spring;

import lombok.SneakyThrows;

import java.util.Map;

/**
 * @author Evgeny Borisov
 */
public class ObjectFactory {


    private Map<Class, Class> ifc2DefaultImplClass = InitializeIfc2DefaultImplClassMap.getMap();


    private static ObjectFactory objectFactory = new ObjectFactory();

    private ObjectFactory() {
    }

    public static ObjectFactory getInstance() {
        return objectFactory;
    }

    @SneakyThrows
    public Object createObject(Class type) {
        //todo finish this
        // if type is concrete class, just create and return it's instance
        //if type is and interface, you should find appropriative impl.
        if (type.isInterface()) {
            return ifc2DefaultImplClass.get(type).getDeclaredConstructor().newInstance();
        }
        return type.getDeclaredConstructor().newInstance();
    }
}
