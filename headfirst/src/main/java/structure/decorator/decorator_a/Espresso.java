package structure.decorator.decorator_a;

/**
 * 浓咖啡
 * @author ronin
 * @version V1.0
 * @since 2019/8/30 14:58
 */
public class Espresso extends Beverage{

    public Espresso() {
        super.description = "Espresso";
    }

    @Override
    public double cost() {
        return 5.0;
    }
}
