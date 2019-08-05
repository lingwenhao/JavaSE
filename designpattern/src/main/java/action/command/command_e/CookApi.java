package action.command.command_e;

/**
 * 命令对象接口:厨师接口
 * @author ronin
 * @version V1.0
 * @since 2019/8/5 13:37
 */
public interface CookApi {
    /**
     * 示意，做菜的方法
     * @param food 菜品
     */
    void cook(Food food);
}
