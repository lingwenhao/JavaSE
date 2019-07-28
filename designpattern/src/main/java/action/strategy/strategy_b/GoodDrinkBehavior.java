package action.strategy.strategy_b;

public class GoodDrinkBehavior implements DrinkBehavior{
    @Override
    public void drink() {
        System.out.println("喝水技能高超......");
    }
}
