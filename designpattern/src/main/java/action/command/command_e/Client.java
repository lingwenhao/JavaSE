package action.command.command_e;

/**
 * @author ronin
 * @version V1.0
 * @since 2019/8/5 14:03
 */
public class Client {
    public static void main(String[] args) {
        //冰镇绿豆排骨汤命令
        ChopCommand chopCommand = new ChopCommand();
        //水晶蒸饺命令
        DumplingCommand dumplingCommand = new DumplingCommand();

        //创建宏命令对象
        Waiter waiter = new Waiter();
        //执行点菜操作
        waiter.orderDish(chopCommand);
        waiter.orderDish(dumplingCommand);
        //厨师做菜
        waiter.orderOver();
    }
}
