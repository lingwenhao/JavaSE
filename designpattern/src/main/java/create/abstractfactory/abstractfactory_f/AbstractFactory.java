package create.abstractfactory.abstractfactory_f;

/**
 *
 * 抽象工厂的接口，声明创建抽象产品的操作
 * @author ronin
 * @version V1.0
 * @since 2019/8/7 14:47
 */
public interface AbstractFactory {

    /**
     * 创建CPU的对象
     * @return CPU的对象
     */
    CPUApi createCPU();
    /**
     * 创建主板的对象
     * @return 主板的对象
     */
    MainboardApi createMainboard();
}
