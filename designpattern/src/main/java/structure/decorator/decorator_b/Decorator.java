package structure.decorator.decorator_b;

public class Decorator extends Drink{

    private Drink drink;

    public Decorator(Drink drink) {
        this.drink = drink;
    }

    @Override
    public double cost() {
        return super.getPrice() + drink.cost();
    }

    @Override
    public String getDesc() {
        return super.getDesc() + ":" +super.getPrice() + "&&" + drink.getDesc() +":" + drink.getPrice();
    }
}
