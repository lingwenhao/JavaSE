package structure.bridge.bridge_e;

/**
 * @author ronin
 * @version V1.0
 * @desc 消息的抽象
 * @since 2019/7/24 13:30
 */
public abstract class AbstractMessage {

    /**持有一个实现部分的对象*/
    MessageImplementor messageImplementor;

    /**
     * 构造方法，传入实现部分的对象
     * @param messageImplementor  实现部分的对象
     */
    public AbstractMessage(MessageImplementor messageImplementor){
        this.messageImplementor = messageImplementor;
    }

    /**
     * 发送消息，委派给实现部分的方法
     * @param message    要发送消息的内容
     * @param toUser    消息的接受者
     */
    public void sendMessage(String message , String toUser){
        this.messageImplementor.send(message, toUser);
    }
}
