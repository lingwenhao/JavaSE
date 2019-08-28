package action.strategy;

/**
 * @author ronin
 * @version V1.0
 * @since 2019/8/28 15:10
 */
public class MuteQuack implements QuackBehavior{

    /**
     * 鸣叫
     */
    @Override
    public void quack() {
        System.out.println("<< Silence~ >>");
    }
}
