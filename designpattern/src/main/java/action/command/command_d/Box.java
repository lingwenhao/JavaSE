package action.command.command_d;

/**
 * 机箱对象，本身有按钮，持有按钮对应的命令对象
 * @author ronin
 * @version V1.0
 * @since 2019/8/5 10:56
 */
public class Box {
    /**
     * 开机命令对象
     */
    private Command openCommand;

    /**
     * 重启命令对象
     */
    private Command restartCommand;

    /**
     * 设置开机命令对象
     * @param command 开机命令对象
     */
    public void setOpenCommand(Command command){
        this.openCommand = command;
    }

    /**
     * 设置重启命令对象
     * @param restartCommand
     */
    public void setRestartCommand(Command restartCommand) {
        this.restartCommand = restartCommand;
    }

    /**
     * 组装开机命令
     */
    public void openButtonPressed(){
        //按下按钮，执行命令
        openCommand.execute();
    }

    /**
     * 组装重启命令
     */
    public void restartButtonPressed(){
        //按下按钮，执行命令
        restartCommand.execute();
    }
}
