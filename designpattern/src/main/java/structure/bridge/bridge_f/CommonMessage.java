package structure.bridge.bridge_f;

/**
 * 普通消息,什么也不干
 * @author ronin
 * @version V1.0
 * @since 2019/8/6 9:16
 */
public class CommonMessage extends AbstractMessage {
    /**
     * 构造方法:传入实现部分的对象
     *
     * @param messageImplementor
     */
    public CommonMessage(MessageImplementor messageImplementor) {
        super(messageImplementor);
    }

    /**
     * 发送普通消息:普通消息什么也不干，直接调用父类方法，把消息发送出去
     *
     * @param message
     * @param toUer
     */
    @Override
    public void sendMessage(String message, String toUer) {
        super.sendMessage(message, toUer);
    }
}
