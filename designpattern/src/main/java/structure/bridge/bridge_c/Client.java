package structure.bridge.bridge_c;

/**
 * @author ronin
 * @version V1.0
 * @desc
 * @since 2019/7/24 11:07
 */
public class Client {
    public static void main(String[] args) {
        /**
         * 测试发送普通消息
         */
        //发送短信类型的消息
        MessageInterface smsInterface = new SmsMessage();
        smsInterface.sendMssage("在吗","123456789");

        //发送邮件类型的消息
        MessageInterface emailnterface = new EmailMessage();
        emailnterface.sendMssage("在吗","123456789@qq.com");


        System.out.println("===================================================");
        /**
         * 使用短信方式发送加急消息
         */
        UrgencyMessageSMS urgencyMessageSMS = new UrgencyMessageSMS();
        urgencyMessageSMS.sendMssage("在吗","123456789");

        /**
         * 使用邮件方式发送加急消息
         */
        UrgencyMessageEmail urgencyMessageEmail = new UrgencyMessageEmail();
        urgencyMessageEmail.sendMssage("在吗","123456789@qq.com");

        System.out.println("===================================================");

        /**
         * 使用短信方式发送特急消息
         */
        SpecialUrgencyMessage specialUrgencyMessage = new SmsSpecialUrgencyMessage();
        specialUrgencyMessage.sendMssage("在吗","123456789");

        /**
         * 使用邮件方式发送特急消息
         */
        EmailSpecialUrgencyMessage emailSpecialUrgencyMessage = new EmailSpecialUrgencyMessage();
        emailSpecialUrgencyMessage.sendMssage("在吗","123456789");
    }
}
