package action.command.command_d;

/**
 * 重启命令对象
 * @author ronin
 * @version V1.0
 * @since 2019/8/5 13:20
 */
public class RestartCommand implements Command{

    /**持有可以真正完成命令的对象的引用:即技嘉主板*/
    private MainBoardApi mainBoard;

    public RestartCommand(MainBoardApi mainBoard) {
        this.mainBoard = mainBoard;
    }

    /**
     * 执行命令对应的操作
     */
    @Override
    public void execute() {
        mainBoard.restart();
    }
}
