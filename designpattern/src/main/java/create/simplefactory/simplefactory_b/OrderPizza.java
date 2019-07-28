package create.simplefactory.simplefactory_b;

/**
 * 方法的使用者:
 */
public class OrderPizza {
    private Pizza pizza = null;

    public OrderPizza(String pizzType) {
        this.pizza = PizzaFacory.createPizza(pizzType);
    }

    public Pizza order(){
        return pizza;
    }
}
