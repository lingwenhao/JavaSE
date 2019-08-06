package structure.bridge.bridge_g;

/**
 * @author ronin
 * @version V1.0
 * @since 2019/8/6 9:24
 */
public class SpecialUrgencyMessage extends AbstractMessage {

    public SpecialUrgencyMessage(MessageEmail messageEmail) {
        super(messageEmail);
    }

    /**
     * 因为是特急消息:所以就催促发送
     */
    public void hurry(){
        System.out.println("催促......");
    }

    /**
     * 发送短信
     *
     * @param message
     * @param toUer
     */
    @Override
    public void sendMessage(String message, String toUer) {
        hurry();
        System.out.println("特急......");
        super.sendMessage(message, toUer);
    }
}
