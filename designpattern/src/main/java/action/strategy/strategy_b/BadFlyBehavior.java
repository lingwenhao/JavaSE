package action.strategy.strategy_b;

public class BadFlyBehavior implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("飞翔技能糟糕......");
    }
}
