package real_spring.quoters;

import heroes.RandomUtil;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.FactoryBean;

/**
 * @author Evgeny Borisov
 */
@RequiredArgsConstructor
public class IntegerFactory implements FactoryBean<Integer> {

    private final int min,max;

    public int randomInt(){
        return RandomUtil.getIntBetween(min, max);
    }

    @Override
    public Integer getObject() throws Exception {
        return randomInt();
    }

    @Override
    public Class<?> getObjectType() {
        return Integer.class;
    }

    @Override
    public boolean isSingleton() {
        return false;
    }
}
