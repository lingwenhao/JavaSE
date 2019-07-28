package structure.bridge.bridge_c;

/**
 * @author ronin
 * @version V1.0
 * @desc    加急使用短信发送消息
 * @since 2019/7/24 11:13
 */
public class UrgencyMessageSMS implements UrgencyMessage{
    /**
     * 监控指定消息的处理过程
     *
     * @param messageId 被监控的消息编号
     * @return 监控到的消息的处理状态
     */
    @Override
    public Object watch(String messageId) {
        return null;
    }

    @Override
    public boolean sendMssage(String message, String receiver) {
        System.out.println("加急消息......使用短信发送消息");
        return true;
    }
}
