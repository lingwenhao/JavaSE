package action.command.command_e;

/**
 * 命令的组装这:负责组合具体的菜和每个具体的命令对象
 * 相当于标准命令模式中的:Invoker+Client
 * @author ronin
 * @version V1.0
 * @since 2019/8/5 13:44
 */
public class Waiter {

    /**
     * 持有一个宏命令对象——菜单
     */
    private MenuCommand menuCommand = new MenuCommand();

    /**
     * 客户点菜
     * @param cmd 客户点的菜，每道菜是一个命令对象
     */
    public void orderDish(Command cmd){
        //热菜厨师
        CookApi hotCook = new HotCook();
        //凉菜厨师
        CookApi coolCook = new CoolCook();
        //判读到底是组合凉菜师傅还是热菜师傅
        //简单点根据命令的原始对象的类型来判断
        if(cmd instanceof DumplingCommand){
            //装命令和命令的具体执行者:做热菜(饺子)的命令
            ((DumplingCommand)cmd).setCookApi(hotCook);
        }else if(cmd instanceof ChopCommand){
            ((ChopCommand)cmd).setCookApi(hotCook);
        }
        //添加到菜单中
        menuCommand.addCommand(cmd);
    }
    /**
     * 客户点菜完毕，表示要执行命令了，这里就是执行菜单这个组合命令
     */
    public void orderOver(){
        menuCommand.execute();
    }
}
