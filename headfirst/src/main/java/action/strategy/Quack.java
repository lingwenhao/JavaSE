package action.strategy;

/**
 * @author ronin
 * @version V1.0
 * @since 2019/8/28 14:15
 */
public class Quack implements QuackBehavior{
    /**
     * 鸣叫
     */
    @Override
    public void quack() {
        System.out.println("Quack~");
    }
}
