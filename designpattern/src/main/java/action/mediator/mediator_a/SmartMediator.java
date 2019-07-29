package action.mediator.mediator_a;

/**
 * @author ronin
 * @version V1.0
 * @desc 抽象中介类
 * @since 2019/7/29 9:24
 */
public abstract class SmartMediator {

    /**
     * 保留所有设备的引用是为了当接收指令时可以唤醒其他设备的操作
     */
    protected SmartDevice bathDevice;
    protected SmartDevice curtainDevice;
    protected SmartDevice musicDevice;

    public SmartMediator(SmartDevice bathDevice, SmartDevice curtainDevice, SmartDevice musicDevice) {
        this.bathDevice = bathDevice;
        this.curtainDevice = curtainDevice;
        this.musicDevice = musicDevice;
    }

    /**
     * 调用音乐设备的方法
     * @param instruction
     */
    public abstract void music(String instruction);

    /**
     * 调用窗帘设备的方法
     * @param instruction
     */
    public abstract void curtain(String instruction);

    /**
     * 调用洗浴设备的方法
     * @param instruction
     */
    public abstract void bath(String instruction);
}
