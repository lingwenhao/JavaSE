package action.command.command_e;

/**
 * 做热菜的厨师
 * @author ronin
 * @version V1.0
 * @since 2019/8/5 13:38
 */
public class HotCook implements CookApi{

    /**
     * 做热菜
     * @param food 做热菜
     */
    @Override
    public void cook(Food food) {
        System.out.println("凉菜"+food.getName()+"已经做好，本厨师正在装盘。");
    }
}
