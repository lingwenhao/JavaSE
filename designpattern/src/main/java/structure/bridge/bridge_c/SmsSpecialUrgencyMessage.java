package structure.bridge.bridge_c;

/**
 * @author ronin
 * @version V1.0
 * @desc
 * @since 2019/7/24 11:29
 */
public class SmsSpecialUrgencyMessage implements SpecialUrgencyMessage{
    /**
     * 催促功能，没有发送就催一下
     */
    @Override
    public void hurry() {
        System.out.println("催一下......");
    }

    @Override
    public boolean sendMssage(String message, String receiver) {
        System.out.println("使用短信发送消息......");
        //催一下
        hurry();
        return true;
    }
}
