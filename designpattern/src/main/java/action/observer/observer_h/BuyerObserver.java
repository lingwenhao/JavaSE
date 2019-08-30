package action.observer.observer_h;

/**
 * @author ronin
 * @version V1.0
 * @since 2019/8/30 10:22
 */
public class BuyerObserver implements Observer{

    /**买家姓名*/
    private String buyerName;

    public BuyerObserver(String buyerName) {
        this.buyerName = buyerName;
    }

    /**
     * 观察者接收消息的方法
     */
    @Override
    public void update(Subject subject) {
        System.out.println(this.buyerName+"收到了"+((ProductSubject)subject).getName()+"最新价格:"+((ProductSubject)subject).getPrice());
    }
}
