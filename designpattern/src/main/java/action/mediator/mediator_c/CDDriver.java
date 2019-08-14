package action.mediator.mediator_c;

/**
 * 光驱
 * @author ronin
 * @version V1.0
 * @since 2019/8/14 11:39
 */
public class CDDriver extends Colleague{

    public CDDriver(Mediator mediator) {
        super(mediator);
    }

    /**
     * 光驱读取出来的数据
     */
    private String data = "";

    /**
     * 获取光驱读取出来的数据
     * @return 光驱读取出来的数据
     */
    public String getData(){
        return this.data;
    }

    /**
     * 读取光盘
     */
    public void readCD(){
        //逗号前是视频显示的数据，逗号后是声音
        this.data = "电影:红河谷,国产经典电影，讲述了西藏人民和侵略者进行斗争的故事......";
        //通知主板，自己的状态发生了改变
        this.getMediator().changed(this);
    }
}
