package structure.decorator.decorator_a;

/**
 * 饮料
 * @author ronin
 * @version V1.0
 * @since 2019/8/30 14:48
 */
public abstract class Beverage {
    protected String description = "Unknown Beverage!";

    public String getDescription(){
        return this.description;
    }

    public abstract double cost();
}
