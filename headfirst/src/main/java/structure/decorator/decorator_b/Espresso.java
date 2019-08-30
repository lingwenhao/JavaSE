package structure.decorator.decorator_b;

/**
 * 浓咖啡
 * @author ronin
 * @version V1.0
 * @since 2019/8/30 14:58
 */
public class Espresso extends Beverage{

    public Espresso() {
        super.description = "Espresso";
    }

    @Override
    public double cost() {
        double price = 0.0;
        if(super.getSize().equals(Beverage.MIN)){
            price = 5.0;
        }else if(super.getSize().equals(Beverage.MID)){
            price = 6.0;
        }else if(super.getSize().equals(Beverage.MAX)){
            price = 7.0;
        }else {
            System.out.println("请输入合法的参数");
        }
        return price;
    }
}
