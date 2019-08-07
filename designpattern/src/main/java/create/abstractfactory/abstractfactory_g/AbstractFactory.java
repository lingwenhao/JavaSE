package create.abstractfactory.abstractfactory_g;

/**
 *
 * 抽象工厂的接口，声明创建抽象产品的操作
 * @author ronin
 * @version V1.0
 * @since 2019/8/7 14:47
 */
public interface AbstractFactory {

    /**
     * 创建硬件
     * @return
     */
    Object createHardware(int type);
}
