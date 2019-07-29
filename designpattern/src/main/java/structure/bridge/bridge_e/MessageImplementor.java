package structure.bridge.bridge_e;

/**
 * @author ronin
 * @version V1.0
 * @desc 发送消息的接口
 * @since 2019/7/24 13:31
 */
public interface MessageImplementor {
    /**
     * @param message 要发送的消息内容
     * @param toUser   接收消息的用户
     */
    void send(String message, String toUser);
}
