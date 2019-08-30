package structure.decorator.decorator_a;

/**
 * @author ronin
 * @version V1.0
 * @since 2019/8/30 15:11
 */
public class Mocha extends CondimentDecorator {

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription()+",Mocha";
    }

    @Override
    public double cost() {
        return 0.5 + beverage.cost();
    }
}
