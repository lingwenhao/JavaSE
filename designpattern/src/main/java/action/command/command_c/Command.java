package action.command.command_c;

public interface Command {
    /**
     * 执行操作
     */
    void execute();
    /**
     * 撤销执行操作
     */
    void undo();
}
