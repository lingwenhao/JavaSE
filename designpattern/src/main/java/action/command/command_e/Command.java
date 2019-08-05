package action.command.command_e;

/**
 * 命令接口:生命执行的操作
 * @author ronin
 * @version V1.0
 * @since 2019/8/5 13:39
 */
public interface Command {
    /**
     * 执行命令对应的操作
     */
    public void execute();
}
