package homework.never_use_switch.mail_types;

import homework.never_use_switch.MailInfo;
import homework.never_use_switch.MailSender;

public class CallbackMailMessage implements MailSender {
    @Override
    public void sendMail(MailInfo mailInfo) {
        System.out.println("Callback " + mailInfo.getText() + " was sent to" + mailInfo.getEmail());
    }
}
