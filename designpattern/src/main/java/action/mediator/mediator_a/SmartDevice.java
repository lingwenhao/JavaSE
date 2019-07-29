package action.mediator.mediator_a;

/**
 * @author ronin
 * @version V1.0
 * @desc 抽象同事类:智能设备
 * @since 2019/7/29 9:19
 */
public abstract class SmartDevice {

    /**
     * 相关设备打开之后 使其进入准备状态
     * @param instruction
     */
    public abstract void readyState(String instruction);

    /**
     * 操作该设备
     * @param instruction
     * @param mediator
     */
    public abstract void operateDevice(String instruction, SmartMediator mediator);
}
