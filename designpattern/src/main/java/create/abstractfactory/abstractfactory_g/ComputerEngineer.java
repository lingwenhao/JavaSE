package create.abstractfactory.abstractfactory_g;


/**
 * 电脑组装工程师
 * @author ronin
 * @version V1.0
 * @since 2019/8/7 16:09
 */
public class ComputerEngineer {
    private CPUApi cpu= null;
    private MainboardApi mainboard = null;
    /**
     * 定义组装机器需要的内存
     */
    private MemoryApi memory = null;
    public void makeComputer(AbstractFactory factory){
        //这里要去准备CPU和主板的具体实现，为了示例简单，这里只准备这两个
        //可是，装机工程师并不知道如何去创建，怎么办呢？

        //使用抽象工厂来获取相应的接口对象
        this.cpu = (CPUApi)factory.createHardware(1);
        this.mainboard = (MainboardApi)factory.createHardware(2);
        this.memory = (MemoryApi)factory.createHardware(3);
        //测试一下配件是否好用
        this.cpu.calculate();
        this.mainboard.installCPU();
        if(memory!=null){
            this.memory.cacheData();
        }
    }
}
