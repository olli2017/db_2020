package real_spring.quoters;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Evgeny Borisov
 */


public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(RealSpringConfig.class);
//        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        context.close();
    }
}
