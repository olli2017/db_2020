package my_spring;

import lombok.SneakyThrows;

import java.lang.reflect.Field;
import java.util.Map;

/**
 * @author Evgeny Borisov
 */
public class ObjectFactory {


    private Map<Class, Class> ifc2DefaultImplClass = InitializeIfc2DefaultImplClassMap.getMap();
    private InjectRandomIntHandler randomIntHandler = new InjectRandomIntHandler();


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
        Object object = null;
        if (type.isInterface()) {
            object = ifc2DefaultImplClass.get(type).getDeclaredConstructor().newInstance();
        } else  {
            object = type.getDeclaredConstructor().newInstance();
        }

        for (Field field : object.getClass().getDeclaredFields()) {
            InjectRandomInt annotation = field.getAnnotation(InjectRandomInt.class);
            if (annotation != null) {
                field.setAccessible(true);
                field.setInt(object, randomIntHandler.getValue(annotation.min(), annotation.max()));
            }
        }
        return object;
    }
}
