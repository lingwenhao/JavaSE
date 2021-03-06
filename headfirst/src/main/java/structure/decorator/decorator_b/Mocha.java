package structure.decorator.decorator_b;

/**
 * @author ronin
 * @version V1.0
 * @since 2019/8/30 15:11
 */
public class Mocha extends CondimentDecorator {

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription()+",Mocha";
    }

    @Override
    public double cost() {
        double price = 0.0;
        if(super.getSize().equals(Beverage.MIN)){
            price = 0.5 + beverage.cost();
        }else if(super.getSize().equals(Beverage.MID)){
            price = 0.5 * 2 + (price == 0.0 ? beverage.cost() * 2 :beverage.cost());
        }else if(super.getSize().equals(Beverage.MAX)){
            price = 0.5 * 3 + (price == 0.0 ? beverage.cost() * 3 :beverage.cost());
        }else {
            System.out.println("请输入合法的参数");
        }
        return price;
    }
}
