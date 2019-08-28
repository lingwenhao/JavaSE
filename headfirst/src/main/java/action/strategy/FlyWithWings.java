package action.strategy;

/**
 * @author ronin
 * @version V1.0
 * @since 2019/8/28 14:18
 */
public class FlyWithWings implements FlyBehavior{

    /**
     * 飞行
     */
    @Override
    public void fly() {
        System.out.println("I can fly~");
    }
}
