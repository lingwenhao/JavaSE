package action.strategy.strategy_d;

/**
 * @author ronin
 * @version V1.0
 * @desc    使用各种不同策略的客户端
 * @since 2019/8/2 15:14
 */
public class CalcPrice {

    /**聚合算法策略*/
    private PriceStragegy priceStrategy;

    public CalcPrice(PriceStragegy priceStrategy) {
        this.priceStrategy = priceStrategy;
    }

    public double calcPrice(Double price){
        return priceStrategy.calcPrice(price);
    }
}
