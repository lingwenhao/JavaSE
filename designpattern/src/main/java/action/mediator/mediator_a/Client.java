package action.mediator.mediator_a;

/**
 * @author ronin
 * @version V1.0
 * @desc
 * @since 2019/7/29 9:32
 */
public class Client {
    public static void main(String[] args) {
        SmartDevice bd=new BathDevice();
        SmartDevice cd=new CurtainDevice();
        SmartDevice md=new MusicDevice();
        //把设备引用都保存在调停者中
        SmartMediator sm=new ConcreteMediator(bd, cd, md);
        //开启窗帘
        cd.operateDevice("open",sm);
        //关闭音乐
        md.operateDevice("close",sm);
    }
}
