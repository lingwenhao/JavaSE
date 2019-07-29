package action.mediator.mediator_a;

/**
 * @author ronin
 * @version V1.0
 * @desc 具体同事类3:洗浴设备
 * @since 2019/7/29 9:23
 */
public class BathDevice extends SmartDevice{

    /**
     * 相关设备打开之后 使其进入准备状态
     *
     * @param instruction
     */
    @Override
    public void readyState(String instruction) {
        System.out.println("洗浴设备正在准备"+instruction);
    }

    /**
     * 操作该设备
     *
     * @param instruction
     * @param mediator
     */
    @Override
    public void operateDevice(String instruction, SmartMediator mediator) {
        System.out.println("洗浴设备"+instruction);
        mediator.bath(instruction);
    }
}
