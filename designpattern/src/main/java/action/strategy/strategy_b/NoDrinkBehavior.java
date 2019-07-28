package action.strategy.strategy_b;

public class NoDrinkBehavior implements DrinkBehavior {
    @Override
    public void drink() {
        System.out.println("压根就不会喝水......");
    }
}
