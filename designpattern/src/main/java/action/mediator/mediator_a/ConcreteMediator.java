package action.mediator.mediator_a;

/**
 * @author ronin
 * @version V1.0
 * @desc 具体中介者
 * @since 2019/7/29 9:28
 */
public class ConcreteMediator extends SmartMediator{

    public ConcreteMediator(SmartDevice bd, SmartDevice md, SmartDevice cd) {
        super(bd, md, cd);
    }

    public void music(String instruction) {//音乐被唤醒后，使其他设备进入准备状态
        cd.readyState(instruction);//调用窗帘的准备方法
        bd.readyState(instruction);//调用洗浴设备的准备方法
    }

    public void curtain(String instruction) {
        md.readyState(instruction);
        bd.readyState(instruction);
    }

    public void bath(String instruction) {
        cd.readyState(instruction);
        md.readyState(instruction);
    }

}
