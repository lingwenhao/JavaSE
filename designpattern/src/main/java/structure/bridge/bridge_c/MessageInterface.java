package structure.bridge.bridge_c;

/**
 * @author ronin
 * @version V1.0
 * @desc    消息接口
 * @since 2019/7/24 11:02
 */
public interface MessageInterface {
    boolean sendMssage(String message, String receiver);
}
