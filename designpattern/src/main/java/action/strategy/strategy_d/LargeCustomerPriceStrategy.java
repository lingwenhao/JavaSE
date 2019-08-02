package action.strategy.strategy_d;

/**
 * @author ronin
 * @version V1.0
 * @desc    大客户:打8折
 * @since 2019/8/2 15:12
 */
public class LargeCustomerPriceStrategy implements PriceStragegy {

    /**
     * 针对大客户的计算策略
     *
     * @param price 具体的价格
     * @return
     */
    @Override
    public double calcPrice(Double price) {
        return price * 0.8;
    }
}
