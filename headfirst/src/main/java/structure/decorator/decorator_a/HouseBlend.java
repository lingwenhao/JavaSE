package structure.decorator.decorator_a;

/**
 * 混合咖啡
 * @author ronin
 * @version V1.0
 * @since 2019/8/30 15:02
 */
public class HouseBlend extends Beverage{

    public HouseBlend() {
        super.description = "HouseBlend Coffee";
    }

    @Override
    public double cost() {
        return 0.89;
    }
}
