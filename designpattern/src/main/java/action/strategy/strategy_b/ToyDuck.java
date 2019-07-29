package action.strategy.strategy_b;

/**
 * 玩具鸭
 */
public class ToyDuck extends Duck {
    public ToyDuck() {
        System.out.println("我是一只玩具鸭.....");
        //玩具鸭不会飞翔
        super.flyBehavior = new NoFlyBehavior();
        //玩具鸭不会游泳
        super.swimBehavior = new NoSwimBehavior();
        //玩具鸭不会喝水
        super.drinkBehavior = new NoDrinkBehavior();
    }
}
