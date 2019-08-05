package action.command.command_a;

/**
 * 这个客户端并方法不是具体的调用者，只是完成创建命令对象并设置接收者
 *      通常这个客户端和调用者可以合为一体
 * @author ronin
 * @version V1.0
 * @since 2019/8/5 11:37
 */
public class Client {

    /**
     * 示意，负责创建命令对象，并设定它的接收者
     */
    public void assemble(){
        //创建接收者
        Receiver receiver = new Receiver();
        //创建命令对象，设定它的接收者
        Command command = new ConcreteCommand(receiver);
        //创建Invoker，把命令对象设置进去
        Invoker invoker = new Invoker();
        invoker.setCommand(command);
    }
}
