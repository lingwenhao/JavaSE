package action.strategy.strategy_b;

public class NoSwimBehavior implements SwimBehavior{
    @Override
    public void swim() {
        System.out.println("压根就不会游泳......");
    }
}
