package structure.bridge.bridge_c;

/**
 * @author ronin
 * @version V1.0
 * @desc
 * @since 2019/7/24 11:28
 */
public interface SpecialUrgencyMessage extends MessageInterface{
    /**
     * 催促功能，没有发送就催一下
     */
    void hurry();
}
