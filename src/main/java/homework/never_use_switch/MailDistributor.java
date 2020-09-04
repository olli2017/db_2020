package homework.never_use_switch;

import java.util.Map;

/**
 * @author Evgeny Borisov
 */
public class MailDistributor {

    public void sendMailInfo(MailInfo mailInfo) {
        Map<Integer, MailSender> mailSenderMap = MapCreator.getFromIntTypeToRealMailTypeMap();
        MailSender mailSender = mailSenderMap.get(mailInfo.getMailType());
        if (mailSender != null) {
            mailSender.sendMail(mailInfo);
        } else {
            throw new IllegalStateException();
        }
    }
}
