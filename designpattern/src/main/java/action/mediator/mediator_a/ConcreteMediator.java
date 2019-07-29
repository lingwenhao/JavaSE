package action.mediator.mediator_a;

/**
 * @author ronin
 * @version V1.0
 * @desc 具体中介者
 * @since 2019/7/29 9:28
 */
public class ConcreteMediator extends SmartMediator{

    /**
     * @param bathDevice 洗浴设备
     * @param curtainDevice 窗帘设备
     * @param musicDevice   音乐设备
     */
    public ConcreteMediator(SmartDevice bathDevice, SmartDevice curtainDevice, SmartDevice musicDevice) {
        super(bathDevice, curtainDevice, musicDevice);
    }

    /**
     * 音乐设备被唤醒后，使其他设备进入准备状态
     * @param instruction
     */
    @Override
    public void music(String instruction) {
        //调用窗帘的准备方法
        curtainDevice.readyState(instruction);
        //调用洗浴设备的准备方法
        bathDevice.readyState(instruction);
    }

    /**
     * 窗帘设备被唤醒后，使其他设备进入准备状态
     * @param instruction
     */
    @Override
    public void curtain(String instruction) {
        //调用音乐设备的准备方法
        musicDevice.readyState(instruction);
        //调用洗浴设备的准备方法
        bathDevice.readyState(instruction);
    }

    /**
     * 洗浴设备被唤醒后，使其他设备进入准备状态
     * @param instruction
     */
    @Override
    public void bath(String instruction) {
        curtainDevice.readyState(instruction);
        musicDevice.readyState(instruction);
    }

}
