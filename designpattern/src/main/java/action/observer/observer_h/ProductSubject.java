package action.observer.observer_h;

/**
 * 具体的商品
 * @author ronin
 * @version V1.0
 * @since 2019/8/30 10:09
 */
public class ProductSubject extends Subject{

    /**商品名称*/
    private String name;

    /**商品价格*/
    private double price;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * 更新商品价格
     * @param price
     */
    public void setPrice(double price){
        this.price = price;
        super.notifyObservers();
    }

    public double getPrice() {
        return price;
    }
}
