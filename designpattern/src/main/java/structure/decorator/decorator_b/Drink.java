package structure.decorator.decorator_b;

public abstract class Drink {
    /**描述*/
    private String desc;
    /**价格*/
    private double price;

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    /**计算费用的抽象方法*/
    public abstract double cost();
}
