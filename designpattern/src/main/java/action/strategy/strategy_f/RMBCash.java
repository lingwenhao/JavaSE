package action.strategy.strategy_f;

/**
 * 人民币支付
 * @author ronin
 * @version V1.0
 * @since 2019/8/28 17:16
 */
public class RMBCash implements PaymentStrategy{

    @Override
    public void pay(PaymentContext ctx) {
        System.out.println("现在给"+ctx.getUserName()+"人民币现金支付"+ctx.getMoney()+"元");
    }
}
