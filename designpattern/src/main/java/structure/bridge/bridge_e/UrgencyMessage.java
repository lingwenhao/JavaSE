package structure.bridge.bridge_e;

/**
 * @author ronin
 * @version V1.0
 * @desc 加急类型消息
 * @since 2019/7/24 13:35
 */
public class UrgencyMessage extends AbstractMessage{

    public UrgencyMessage(MessageImplementor messageImplementor) {
        super(messageImplementor);
    }

    /**
     *  加急消息:发送前给消息内容加上加急
     * 发送消息，委派给实现部分的方法
     *
     * @param message 要发送消息的内容
     * @param toUser  消息的接受者
     */
    @Override
    public void sendMessage(String message, String toUser) {
        message = "加急：" + message;
        super.sendMessage(message, toUser);
    }

    /**
     * 扩展自己的新功能，监控某消息的处理状态
     * @param messageId    被监控的消息编号
     * @return    监控到的消息的处理状态
     */
    public Object watch(String messageId) {
        // 根据消息id获取消息的状态，组织成监控的数据对象，然后返回
        return null;
    }
}
