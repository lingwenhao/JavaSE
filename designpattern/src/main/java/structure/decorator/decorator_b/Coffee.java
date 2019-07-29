package structure.decorator.decorator_b;

/**
 * 所有咖啡公共特性的抽取
 */
public class Coffee extends Drink{
    @Override
    public double cost() {
        return super.getPrice();
    }
}
