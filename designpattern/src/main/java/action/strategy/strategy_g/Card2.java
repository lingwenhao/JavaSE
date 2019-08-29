package action.strategy.strategy_g;

/**
 * 支付到银行卡
 * @author ronin
 * @version V1.0
 * @since 2019/8/29 8:55
 */
public class Card2 implements PaymentStrategy{

    /**
     * 帐号信息
     */
    private String account = "";

    /**
     * 构造方法，传入帐号信息
     * @param account 帐号信息
     */
    public Card2(String account){
        this.account = account;
    }

    public void pay(PaymentContext ctx) {
        System.out.println(" 现在给 "+ctx.getUserName()+" 的 "
                +this.account+" 帐号支付了 "+ctx.getMoney()+" 元 ");
        // 连接银行，进行转帐，就不去管了
    }
}
