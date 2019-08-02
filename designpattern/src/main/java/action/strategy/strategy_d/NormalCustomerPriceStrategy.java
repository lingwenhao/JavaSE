package action.strategy.strategy_d;

/**
 * @author ronin
 * @version V1.0
 * @desc    常规客户:不打折
 * @since 2019/8/2 15:07
 */
public class NormalCustomerPriceStrategy implements PriceStragegy {

    /**
     * 抽象的计算策略
     *
     * @param price 具体的价格
     * @return
     */
    @Override
    public double calcPrice(Double price) {
        System.out.println("对于普通客户或者是新客户，没有优惠......");
        return price;
    }
}
