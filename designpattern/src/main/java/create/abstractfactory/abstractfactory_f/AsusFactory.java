package create.abstractfactory.abstractfactory_f;

/**
 * 华硕工厂:组装华硕电脑,华硕电脑搭载Intel CPU和技嘉主板
 * @author ronin
 * @version V1.0
 * @since 2019/8/7 14:50
 */
public class AsusFactory implements AbstractFactory{

    /**
     * 构造方法在此处无意义,只是标识一个这个类是华硕
     */
    public AsusFactory() {
        System.out.println("华硕电脑工厂准备生产华硕电脑,华硕电脑搭载Intel牌CPU和技嘉主板");
    }

    /**
     * 创建CPU的对象
     *      Intel牌CPU
     * @return CPU的对象
     */
    @Override
    public CPUApi createCPU() {
        return new IntelCPU(10000);
    }

    /**
     * 创建主板的对象
     *      技嘉主板
     * @return 主板的对象
     */
    @Override
    public MainboardApi createMainboard() {
        return new GAMainboard(10000);
    }
}
