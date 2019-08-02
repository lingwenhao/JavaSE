package action.strategy.strategy_c;

/**
 * @author ronin
 * @version V1.0
 * @desc    价格管理类
 * @since 2019/8/2 15:00
 */
public class Price {

    /**
     * 报价，对不同类型的，计算不同的价格
     * @param goodsPrice 商品销售原价
     * @param customerType 客户类型
     * @return 计算出来的，应该给客户报的价格
     */
    public double quote(double goodsPrice,String customerType) {
        if (customerType.equals("普通客户 ")) {
            System.out.println("对于新客户或者是普通客户，没有折扣 ");
            return goodsPrice;
        } else if (customerType.equals("老客户 ")) {
            System.out.println("对于老客户，统一折扣 5%");
            return goodsPrice * (1 - 0.05);
        } else if (customerType.equals("大客户 ")) {
            System.out.println("对于大客户，统一折扣 10%");
            return goodsPrice * (1 - 0.1);
        }
        //其余人员都是报原价
        return goodsPrice;
    }
}
