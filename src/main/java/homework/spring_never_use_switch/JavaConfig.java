package homework.spring_never_use_switch;

import com.github.javafaker.Faker;
import org.fluttercode.datafactory.impl.DataFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.HashMap;
import java.util.Map;

@Configuration
@ComponentScan("homework.spring_never_use_switch")
public class JavaConfig {
    @Bean
    public Faker faker() {
        return new Faker();
    }

    @Bean
    public DataFactory dataFactory() {
        return new DataFactory();
    }

    @Bean
    public Map<Integer, MailSender> mailSenderMap() {
        return new HashMap<>();
    }
}
