package structure.decorator.decorator_b;

/**
 * 饮料
 * @author ronin
 * @version V1.0
 * @since 2019/8/30 14:48
 */
public abstract class Beverage {

    /**小杯*/
    protected static final String MIN = "MIN";
    /**中杯*/
    protected static final String MID = "MID";
    /**大杯*/
    protected static final String MAX = "MAX";

    protected String description = "Unknown Beverage!";

    private String size;

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getDescription(){
        return this.description;
    }


    public abstract double cost();

}
