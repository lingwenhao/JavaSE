package action.strategy.strategy_g;

/**
 * 使用构造函数解决参数问题
 * @author ronin
 * @version V1.0
 * @since 2019/8/29 8:56
 */
public class Client_card2 {
    public static void main(String[] args) {
        //测试新添加的支付方式
        PaymentStrategy strategyCard2 = new Card2("010998877656");
        PaymentContext ctx4 =
                new PaymentContext("小张",9000,strategyCard2);
        ctx4.payNow();
    }
}
