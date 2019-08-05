package action.command.command_e;

import java.util.ArrayList;
import java.util.Collection;

/**
 * 菜单对象:是个宏命令对象,里面聚合了多个子命令
 * @author ronin
 * @version V1.0
 * @since 2019/8/5 13:43
 */
public class MenuCommand implements Command{

    /**
     * 用来记录组合本菜单的多道菜品，也就是多个命令对象
     */
    private Collection<Command> col = new ArrayList<>();

    /**
     * 点菜，把菜品加入到菜单中
     * @param cmd 客户点的菜
     */
    public void addCommand(Command cmd){
        col.add(cmd);
    }

    @Override
    public void execute() {
        //执行菜单其实就是循环执行菜单里面的每个菜
        for(Command cmd : col){
            cmd.execute();
        }
    }
}
