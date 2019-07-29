package create.simplefactory.simplefactory_b;

/**
 * 方法的提供者:
 */
public class PizzaFacory {
    public static Pizza createPizza(String pizzType) {
        Pizza pizza = null;
        if("greek".equals(pizzType)){
            pizza = new GreekPizza();
        }else if("asian".equals(pizzType)){
            pizza = new AsianPizza();
        }else {
            pizza = null;
        }
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }
}
