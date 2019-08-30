package structure.decorator.decorator_b;

/**
 * @author ronin
 * @version V1.0
 * @since 2019/8/30 15:15
 */
public class Client {
    public static void main(String[] args) {
        //点一杯浓咖啡:$5.0
        Beverage beverage = new Espresso();
            //设置容量为小杯
        //beverage.setSize("MIN");
            //设置容量为大杯
        beverage.setSize("MAX");
        System.out.println(beverage.getDescription()+","+beverage.cost());

        //加一份摩卡:$0.5
        Beverage mocha = new Mocha(beverage);
        System.out.println(mocha.getDescription()+","+mocha.cost());

        //再加一份摩卡:$0.5
        mocha = new Mocha(mocha);
        System.out.println(mocha.getDescription()+","+mocha.cost());

        //再加一份奶泡:$1.5
        Beverage whip = new Whip(mocha);
        System.out.println(whip.getDescription()+","+whip.cost());
    }
}
