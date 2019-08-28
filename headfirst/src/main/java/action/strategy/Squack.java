package action.strategy;

/**
 * @author ronin
 * @version V1.0
 * @since 2019/8/28 14:17
 */
public class Squack implements QuackBehavior {

    /**
     * 鸣叫
     */
    @Override
    public void quack() {
        System.out.println("Squack~");
    }
}
