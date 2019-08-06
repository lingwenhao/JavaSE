package structure.bridge.bridge_f;

/**
 * 使用站内短信的方式发送消息
 * @author ronin
 * @version V1.0
 * @since 2019/8/6 9:12
 */
public class MessageSMS implements MessageImplementor{

    /**
     * 发送消息
     * @param message
     * @param toUer
     */
    @Override
    public void send(String message, String toUer) {
        System.out.println("使用站内短信的方法发送消息"+message+"给"+toUer);
    }
}
