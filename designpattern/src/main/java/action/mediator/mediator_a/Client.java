package action.mediator.mediator_a;

/**
 * @author ronin
 * @version V1.0
 * @desc
 * @since 2019/7/29 9:32
 */
public class Client {
    public static void main(String[] args) {
        SmartDevice bathDevice =new BathDevice();
        SmartDevice curtainDevice =new CurtainDevice();
        SmartDevice musicDevice =new MusicDevice();
        //把设备引用都保存在调停者中
        SmartMediator smartMediator =new ConcreteMediator(bathDevice, curtainDevice, musicDevice);
        //开启窗帘
        curtainDevice.operateDevice("open",smartMediator);

        System.out.println("----------------------------------------");

        //关闭音乐
        musicDevice.operateDevice("close",smartMediator);
    }
}
