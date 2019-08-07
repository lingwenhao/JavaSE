package create.abstractfactory.abstractfactory_f;

/**
 * 装机工程师类
 * @author ronin
 * @version V1.0
 * @since 2019/8/7 15:24
 */
public class ComputerEngineer {

    /**定义组装机器需要的CPU*/
    private CPUApi cpu= null;

    /**定义组装机器需要的主板*/
    private MainboardApi mainboard = null;

    /**
     * 组装电脑
     * @param factory
     */
    public void makeComputer(AbstractFactory factory){
        //创建CPU
        CPUApi cpu = factory.createCPU();
        //创建主板
        MainboardApi mainboard = factory.createMainboard();

        //测试配件是否好用
        cpu.calculate();
        mainboard.installCPU();
    }
}
