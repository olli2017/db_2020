package my_spring;

import heroes.RandomUtil;
import lombok.SneakyThrows;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

public class SingletonAnnotationObjectConfigurer implements ObjectConfigurer {

    private final Map<Class<?>, Object> map = new HashMap<>();

    @Override
    @SneakyThrows
    public void configure(Object t) {
        Field[] fields = t.getClass().getDeclaredFields();
        for (Field field : fields) {
            Class<?> aClass = field.getType();
            if (aClass.isAnnotationPresent(Singleton.class)) {
                if (!map.containsKey(aClass)) {
                    Object value = ObjectFactory.getInstance().createObject(field.getType());
                    map.put(aClass, value);
                }
                field.setAccessible(true);
                field.set(t, map.get(aClass));
            }
        }
    }
}
