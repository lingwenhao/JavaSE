package structure.decorator.decorator_d;

/**
 * @author ronin
 * @version V1.0
 * @desc
 * @since 2019/7/25 17:02
 */

/**抽象装饰者*/
public abstract class Decorator extends Bread{
    /**持有一个抽象组件的引用*/
    private Bread bread;

    public Decorator(Bread bread) {
        this.bread = bread;
    }

    @Override
    public String getDesc() {
        return bread.getDesc();
    }

    @Override
    public double getPrice() {
        return bread.getPrice();
    }
}
