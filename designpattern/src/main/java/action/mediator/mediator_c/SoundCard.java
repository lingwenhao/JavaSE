package action.mediator.mediator_c;

/**
 * 声卡
 * @author ronin
 * @version V1.0
 * @since 2019/8/14 13:13
 */
public class SoundCard extends Colleague{
    public SoundCard(Mediator mediator) {
        super(mediator);
    }

    /**
     * 按照声频数据发出声音
     * @param data 发出声音的数据
     */
    public void soundData(String data){
        System.out.println("(声卡开始工作)画外音："+data);
    }
}
