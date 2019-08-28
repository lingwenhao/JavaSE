package action.strategy;

/**
 * @author ronin
 * @version V1.0
 * @since 2019/8/28 14:22
 */
public class MallardDuck extends Duck{

    public MallardDuck() {
        System.out.println("I am a mallard duck~");
        super.quackBehavior = new Quack();
        super.flyBehavior = new FlyWithWings();
    }
}
