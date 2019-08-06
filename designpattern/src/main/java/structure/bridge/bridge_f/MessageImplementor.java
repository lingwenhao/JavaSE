package structure.bridge.bridge_f;

/**
 * 实现部分接口:定义了第一个维度的操作(基本操作)
 * @author ronin
 * @version V1.0
 * @since 2019/8/6 9:03
 */
public interface MessageImplementor {
    /**
     * 发送消息
     * @param message
     * @param toUer
     */
    void send(String message,String toUer);
}
