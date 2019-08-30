package structure.decorator.decorator_b;

/**
 * 调料
 * @author ronin
 * @version V1.0
 * @since 2019/8/30 14:52
 */
public class CondimentDecorator extends Beverage{

    /**
     * 被装饰者
     */
    protected Beverage beverage;

    private String size;

    @Override
    public String getSize() {
        return beverage.getSize();
    }

    @Override
    public void setSize(String size) {
        this.size = size;
    }

    @Override
    public String getDescription() {
        return super.getDescription();
    }

    @Override
    public double cost() {
        return 0;
    }
}
