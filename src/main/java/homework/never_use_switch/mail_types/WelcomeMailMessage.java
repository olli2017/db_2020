package homework.never_use_switch.mail_types;

import homework.never_use_switch.MailInfo;
import homework.never_use_switch.MailSender;

public class WelcomeMailMessage implements MailSender {
    @Override
    public void sendMail(MailInfo mailInfo) {
        System.out.println("WELCOME " + mailInfo.getText() + " was sent to " + mailInfo.getEmail());
    }
}
