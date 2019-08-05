package action.command.command_a;

/**
 * 命令接口，生命执行命令的操作
 * @author ronin
 * @version V1.0
 * @since 2019/8/5 11:29
 */
public interface Command {
    /**
     * 执行命令对应的操作
     */
    void execute();
}
