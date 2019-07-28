package structure.bridge.bridge_e;

/**
 * @author ronin
 * @version V1.0
 * @desc 普通消息
 * @since 2019/7/24 13:39
 */
public class CommonMessage extends AbstractMessage{

    public CommonMessage(MessageImplementor messageImplementor) {
        super(messageImplementor);
    }

    /**
     * 普通类型的消息:直接调用父类的方法
     * 发送消息，委派给实现部分的方法
     *
     * @param message 要发送消息的内容
     * @param toUser  消息的接受者
     */
    @Override
    public void sendMessage(String message, String toUser) {
        super.sendMessage(message, toUser);
    }
}
