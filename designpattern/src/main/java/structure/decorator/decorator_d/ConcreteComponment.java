package structure.decorator.decorator_d;

/**
 * @author ronin
 * @version V1.0
 * @desc
 * @since 2019/7/25 17:01
 */

/**具体组件*/
public class ConcreteComponment extends Bread{

    @Override
    public String getDesc() {
        return "普通面包";
    }

    @Override
    public double getPrice() {
        return 2.5;
    }
}
