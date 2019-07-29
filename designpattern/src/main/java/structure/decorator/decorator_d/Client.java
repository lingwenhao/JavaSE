package structure.decorator.decorator_d;

/**
 * @author ronin
 * @version V1.0
 * @desc
 * @since 2019/7/25 17:13
 */
public class Client {
    public static void main(String[] args) {
        //买一个普通面包
        Bread bread = new ConcreteComponment();
        System.out.println(bread.getDesc());
        System.out.println("价格:"+bread.getPrice());

            //再加一份曲奇
        bread = new ConcreteDecorator(bread);
        System.out.println(bread.getDesc());
        System.out.println("价格:"+bread.getPrice());

            //加一份曲奇
        bread = new ConcreteDecorator(bread);
        System.out.println(bread.getDesc());
        System.out.println("价格:"+bread.getPrice());
    }
}
