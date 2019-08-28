package action.strategy;

/**
 * @author ronin
 * @version V1.0
 * @since 2019/8/28 15:26
 */
public class ModelDuck extends Duck{
    public ModelDuck() {
        super.flyBehavior = new FlyWithNoWay();
        super.quackBehavior = new MuteQuack();
    }
}
