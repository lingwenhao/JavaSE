package structure.bridge.bridge_g;

/**
 * 加急消息:这个维度的实现类，可以在发送短信的时候添加一些扩充方法
 * @author ronin
 * @version V1.0
 * @since 2019/8/6 9:17
 */
public class UrgencyMessage extends AbstractMessage {

    public UrgencyMessage(MessageEmail messageEmail) {
        super(messageEmail);
    }

    /**
     * 发送加急消息:
     *
     * @param message
     * @param toUer
     */
    @Override
    public void sendMessage(String message, String toUer) {
        message = "加急" + message;
        super.sendMessage(message, toUer);
    }

    /**
     * 扩展自己的新功能:监控某消息的处理过程
     *
     * @param  messgeId 被监控的消息的编号
     * @return
     */
    public Object watch(String messgeId){
        return null;
    }
}
