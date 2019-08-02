package action.strategy.strategy_d;

/**
 * @author ronin
 * @version V1.0
 * @desc    VIP客户:打九折
 * @since 2019/8/2 15:10
 */
public class VIPCustomerPriceStrategy implements PriceStragegy
{
    /**
     * 针对VIP客户的计算策略
     *
     * @param price 具体的价格
     * @return
     */
    @Override
    public double calcPrice(Double price) {
        System.out.println("对于老客户，打9折扣......");
        return price * 0.9;
    }
}
