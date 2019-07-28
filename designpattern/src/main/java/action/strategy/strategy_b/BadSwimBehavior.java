package action.strategy.strategy_b;

public class BadSwimBehavior implements SwimBehavior {
    @Override
    public void swim() {
        System.out.println("游泳技能高超.....");
    }
}
