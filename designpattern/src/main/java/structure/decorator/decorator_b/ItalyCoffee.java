package structure.decorator.decorator_b;

/**
 * 意大利咖啡：被装饰者
 */
public class ItalyCoffee extends Coffee{
    public ItalyCoffee() {
        super.setDesc("意大利咖啡");
        super.setPrice(109.6);
    }
}
