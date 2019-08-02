package action.command.command_b;


/**
 * @author ronin
 * @version V1.0
 * @desc
 * @since 2019/8/2 9:05
 */
public class Client {
    public static void main(String[] args) {
        Request request = new Request();
        BuyRequest buyRequest = new BuyRequest(request);
        SellRequest sellRequest = new SellRequest(request);
        Handler handler = new Handler();
        handler.takeOrder(buyRequest);
        handler.takeOrder(sellRequest);
        handler.placeOrders();
    }
}
