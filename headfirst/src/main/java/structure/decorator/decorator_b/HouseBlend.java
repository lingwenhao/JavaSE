package structure.decorator.decorator_b;

/**
 * 混合咖啡
 * @author ronin
 * @version V1.0
 * @since 2019/8/30 15:02
 */
public class HouseBlend extends Beverage{

    public HouseBlend() {
        super.description = "HouseBlend Coffee";
    }

    @Override
    public double cost() {
        double price = 0.0;
        if(super.getSize().equals(Beverage.MIN)){
            price = 1.0;
        }else if(super.getSize().equals(Beverage.MID)){
            price = 2.0;
        }else if(super.getSize().equals(Beverage.MAX)){
            price = 3.0;
        }else {
            System.out.println("请输入合法的参数");
        }
        return price;
    }
}
