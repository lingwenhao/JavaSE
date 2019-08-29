package action.strategy.strategy_g;

/**
 * @author ronin
 * @version V1.0
 * @since 2019/8/28 17:21
 */
public class Client {

    public static void main(String[] args) {
        //创建相应的支付策略
        PaymentStrategy strategyRMB = new RMBCash();
        PaymentStrategy strategyDollar = new DollarCash();

        //准备小李的支付工资上下文
        PaymentContext ctx1 = new PaymentContext("小李",5000,strategyRMB);
        //向小李支付工资
        ctx1.payNow();

        //切换一个人，给petter支付工资
        PaymentContext ctx2 = new PaymentContext("Petter",8000,strategyDollar);
        ctx2.payNow();
    }
}
