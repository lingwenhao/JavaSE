package action.strategy.strategy_d;

/**
 * @author ronin
 * @version V1.0
 * @desc    测试策略模式解决不同类型客户使用不同价格计算策略的需求
 * @since 2019/8/2 15:22
 */
public class Client {
    public static void main(String[] args) {
        CalcPrice calcPrice = new CalcPrice(new LargeCustomerPriceStrategy());
        double targetPrice = calcPrice.calcPrice(1.0);
        System.out.println(targetPrice);
    }

}
