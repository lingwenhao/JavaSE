package action.responsibility.responsibility_b;

/**
 * 采购请求
 */
public class PurchaseRequest {
    private int type;
    /**
     * 请求金额
     */
    private double price;
    private int id = 0;

    public PurchaseRequest(int type, double price, int id) {
        this.type = type;
        this.price = price;
        this.id = id;
    }

    public int getType() {
        return type;
    }

    public double getPrice() {
        return price;
    }

    public int getId() {
        return id;
    }
}
