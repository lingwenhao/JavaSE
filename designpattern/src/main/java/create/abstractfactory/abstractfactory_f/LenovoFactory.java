package create.abstractfactory.abstractfactory_f;

/**
 * 联想工厂:组装联想电脑，联想电脑搭载 AMD CPU和微星主板
 * @author ronin
 * @version V1.0
 * @since 2019/8/7 14:52
 */
public class LenovoFactory implements AbstractFactory{

    /**
     * 构造方法在此处无意义,只是标识一个这个类是华硕
     */
    public LenovoFactory() {
        System.out.println("联想电脑工厂准备生产联想电脑,联想电脑搭载AMD牌CPU和MSI主板");
    }

    /**
     * 创建CPU的对象
     *      AMD牌CPU
     * @return CPU的对象
     */
    @Override
    public CPUApi createCPU() {
        return new AMDCPU(8000);
    }

    /**
     * 创建主板的对象
     *      微星主板
     * @return 主板的对象
     */
    @Override
    public MainboardApi createMainboard() {
        return new MSIMainboard(8000);
    }
}
