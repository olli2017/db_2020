package homework.spring_never_use_switch;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Evgeny Borisov
 */
@Component
public class MailDistributor {

    @Autowired
    private Map<Integer, MailSender> mailSenderMap;

    @Autowired
    private List<MailSender> mailSenderList;

    @PostConstruct
    public void init() {
        for (MailSender mailSender : mailSenderList) {
            mailSenderMap.put(mailSender.myCode(), mailSender);
        }
    }

    public void sendMailInfo(MailInfo mailInfo) {
        MailSender mailSender = mailSenderMap.getOrDefault(mailInfo.getMailType(), new DefaultMailSender());
        mailSender.sendMail(mailInfo);
    }
}











