package action.strategy.strategy_d;

/**
 * @author ronin
 * @version V1.0
 * @desc 算法策略接口
 * @since 2019/8/2 15:06
 */
public interface PriceStragegy {

    /**
     * 抽象的计算策略
     * @param price 具体的价格
     * @return
     */
    double calcPrice(Double price);
}
