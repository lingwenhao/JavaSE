package structure.decorator.decorator_b;

/**
 * 具体的Decorator
 */
public class Cholate extends Decorator{
    public Cholate(Drink drink) {
        super(drink);
        setDesc("巧克力");
        setPrice(8.5);
    }
}
