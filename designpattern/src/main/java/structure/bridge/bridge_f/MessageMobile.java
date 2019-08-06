package structure.bridge.bridge_f;

/**
 * 很方便就可以基于某一个维度进行扩展
 * @author ronin
 * @version V1.0
 * @since 2019/8/6 9:26
 */
public class MessageMobile implements MessageImplementor{

    /**
     * 发送消息
     *
     * @param message
     * @param toUer
     */
    @Override
    public void send(String message, String toUer) {
        System.out.println("使用手机的方法发送消息"+message+"给"+toUer);
    }
}
