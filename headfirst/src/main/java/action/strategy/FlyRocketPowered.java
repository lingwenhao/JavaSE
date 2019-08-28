package action.strategy;

/**
 * @author ronin
 * @version V1.0
 * @since 2019/8/28 15:27
 */
public class FlyRocketPowered implements FlyBehavior{

    /**
     * 飞行
     */
    @Override
    public void fly() {
        System.out.println("I am flying with a rocket~");
    }
}
