package real_spring.quoters;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("real_spring")
@PropertySource("classpath:application.properties")
public class RealSpringConfig {
}
