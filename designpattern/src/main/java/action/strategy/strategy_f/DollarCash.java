package action.strategy.strategy_f;

/**
 * 美元现金支付
 * @author ronin
 * @version V1.0
 * @since 2019/8/28 17:17
 */
public class DollarCash implements PaymentStrategy{

    @Override
    public void pay(PaymentContext ctx) {
        System.out.println("现在给"+ctx.getUserName()+"美元现金支付"+ctx.getMoney()+"元");
    }
}
