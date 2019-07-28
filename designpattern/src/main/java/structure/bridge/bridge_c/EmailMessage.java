package structure.bridge.bridge_c;

/**
 * @author ronin
 * @version V1.0
 * @desc    发送邮件类型的消息
 * @since 2019/7/24 11:03
 */
public class EmailMessage implements MessageInterface{

    @Override
    public boolean sendMssage(String message, String receiver) {
        System.out.println("使用邮件发送消息......");
        return true;
    }
}
