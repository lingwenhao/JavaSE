package action.observer.observer_h;

/**
 * @author ronin
 * @version V1.0
 * @since 2019/8/30 10:32
 */
public class Client {
    public static void main(String[] args) {
        //创建目标对象
        ProductSubject product = new ProductSubject();
        //创建观察者
        BuyerObserver zhangsan = new BuyerObserver("张三");
        BuyerObserver lisi = new BuyerObserver("李四");
        BuyerObserver wangwu = new BuyerObserver("王五");
        //目标对象管理观察者
        product.addObserer(zhangsan);
        product.addObserer(lisi);
        product.addObserer(wangwu);

        product.setName("笔记本");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        product.setPrice(10.0);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        product.setPrice(20.0);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        product.setPrice(30.0);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }
}
