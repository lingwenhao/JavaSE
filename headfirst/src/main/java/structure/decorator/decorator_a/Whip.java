package structure.decorator.decorator_a;

/**
 * @author ronin
 * @version V1.0
 * @since 2019/8/30 15:14
 */
public class Whip extends CondimentDecorator{

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ",Whip";
    }

    @Override
    public double cost() {
        return 1.5 + beverage.cost();
    }
}
