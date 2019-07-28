package structure.bridge.bridge_c;

/**
 * @author ronin
 * @version V1.0
 * @desc 加急消息接口
 * @since 2019/7/24 11:11
 */
public interface UrgencyMessage extends MessageInterface{

    /**
     * 监控指定消息的处理过程
     * @param messageId  被监控的消息编号
     * @return    监控到的消息的处理状态
     */
    public Object watch(String messageId);
}
