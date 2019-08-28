package action.strategy;

/**
 * @author ronin
 * @version V1.0
 * @since 2019/8/28 15:13
 */
public class ToyDuck extends Duck{
    public ToyDuck() {
        System.out.println("I am a toy duck~");
        super.quackBehavior = new MuteQuack();
        super.flyBehavior = new FlyWithNoWay();
    }
}
