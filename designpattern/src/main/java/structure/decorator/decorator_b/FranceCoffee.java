package structure.decorator.decorator_b;

/**
 * 法国咖啡：被装饰者
 */
public class FranceCoffee extends Coffee{
    public FranceCoffee() {
        super.setDesc("法国咖啡");
        super.setPrice(20.0);
    }
}
