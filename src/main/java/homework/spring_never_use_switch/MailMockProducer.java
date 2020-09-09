package homework.spring_never_use_switch;

import com.github.javafaker.Faker;
import heroes.RandomUtil;
import lombok.SneakyThrows;
import org.fluttercode.datafactory.impl.DataFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * @author Evgeny Borisov
 */
@Component
public class MailMockProducer {

    @Autowired
    private MailDistributor mailDistributor;
    @Autowired
    private Faker faker;
    @Autowired
    private DataFactory dataFactory;


    @SneakyThrows
    @PostConstruct
    public void sendMailsForever()  {
        while (true) {
            int mailType = RandomUtil.getIntBetween(0, 2) + 1;
            MailInfo mailInfo = MailInfo.builder()
                    .email(dataFactory.getEmailAddress())
                    .mailType(mailType)
                    .text(faker.chuckNorris().fact()).build();
            try {
                mailDistributor.sendMailInfo(mailInfo);
            } catch (Exception e) {
                e.printStackTrace();
            }
            Thread.sleep(1000);
        }
    }

}






