package action.observer.observer_i;

/**
 * @author ronin
 * @version V1.0
 * @since 2019/8/30 13:23
 */
public class Client {
    public static void main(String[] args) {
        //打野
        Hero jungle = new Hero("jungle", new Position(0, 0));
        //上路
        Hero top = new Hero("top", new Position(0, 0));
        //中路
        Hero middle = new Hero("middle", new Position(0, 0));
        //打野发布消息,中上订阅
        jungle.addObserver(top);
        jungle.addObserver(middle);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        jungle.move();
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        jungle.move();
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        //中路发布消息,上野订阅
        middle.addObserver(top);
        middle.addObserver(jungle);
        middle.move();
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }
}
