package action.strategy.strategy_b;

public class NoFlyBehavior implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("压根就不会飞翔......");
    }
}
