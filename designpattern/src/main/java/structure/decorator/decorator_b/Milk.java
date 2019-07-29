package structure.decorator.decorator_b;

/**
 * 具体的Decorator
 */
public class Milk extends Decorator{
    public Milk(Drink drink) {
        super(drink);
        setDesc("牛奶");
        setPrice(8.0);
    }
}
