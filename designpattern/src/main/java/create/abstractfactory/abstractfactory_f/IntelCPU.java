package create.abstractfactory.abstractfactory_f;

/**
 * @author ronin
 * @version V1.0
 * @since 2019/8/7 14:57
 */
public class IntelCPU implements CPUApi{
    /**
     * 针脚数
     */
    private int pins  = 0;

    public IntelCPU(int pins){
        this.pins = pins;
    }

    /**
     * CPU具有运算功能
     */
    @Override
    public void calculate() {
        System.out.println("Intel牌CPU，针脚个数有:" + pins);
    }
}
