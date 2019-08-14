package action.mediator.mediator_c;


/**
 * 显卡
 * @author ronin
 * @version V1.0
 * @since 2019/8/14 13:12
 */
public class VideoCard extends Colleague{
    public VideoCard(Mediator mediator) {
        super(mediator);
    }

    /**
     * 显示视频数据
     * @param data 被显示的数据
     */
    public void showData(String data){
        System.out.println("(显卡开始工作)您正观看的是："+data);
    }
}
