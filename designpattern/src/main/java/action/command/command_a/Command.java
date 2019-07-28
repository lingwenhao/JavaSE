package action.command.command_a;

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
