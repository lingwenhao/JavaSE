package structure.bridge.bridge_f;

/**
 * 定义抽象部分接口:这个抽象接口中的操作是基于实现接口中的操作的，
 *      在另一个维度上增强了第一个接口中发送短信的操作
 * @author ronin
 * @version V1.0
 * @since 2019/8/6 9:07
 */
public abstract class AbstractMessage {

    /**
     * 持有一个实现部分的对象
     */
    protected MessageImplementor messageImplementor;

    /**
     * 构造方法:传入实现部分的对象
     * @param messageImplementor
     */
    public AbstractMessage(MessageImplementor messageImplementor) {
        this.messageImplementor = messageImplementor;
    }

    /**
     * 发送短信
     * @param message
     * @param toUer
     */
    public void sendMessage(String message,String toUer){
        messageImplementor.send(message,toUer);
    }
}
