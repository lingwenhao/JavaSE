package action.command.command_a;

/**
 * 遥控器类
 */
public class RemoteContoller {
    //开按钮的命令数组
    private Command[] onCmmands;
    //关按钮的命令数组
    private Command[] offCommands;

    //执行撤销的命令
    private Command undoCommand;

    /**
     * 完成对按钮的初始化
     */
    public RemoteContoller() {
        onCmmands = new Command[5];
        offCommands = new Command[5];
        for(int i=0;i<5;i++){
            onCmmands[i] = undoCommand;
            offCommands[i] = undoCommand;
        }
    }

    /**
     * 设置对应的按钮
     * @param no
     * @param onCmmand
     * @param offCommand
     */
    public void setOnCmmand(int no,Command onCmmand,Command offCommand){
        onCmmands[no] = onCmmand;
        offCommands[no] = offCommand;
    }

    /**
     * 按下开的按钮
     * @param no
     */
    public void onButtonWasPush(int no){
        //找到这个按钮对应的开的方法，并调用
        onCmmands[no].execute();
        //记录这次操作，用于撤销
        undoCommand = onCmmands[no];
    }

    /**
     * 按下关的按钮
     * @param no
     */
    public void offButtonWasPush(int no){
        //找到这个按钮对应的开的方法，并调用
        offCommands[no].execute();
        //记录这次操作，用于撤销
        undoCommand = offCommands[no];
    }

    /**
     * 按下撤销按钮
     */
    public void undoButtonWasPush(){
        System.out.println("---------------------------");
        System.out.println("上一步操作:");
        undoCommand.execute();
        System.out.println("---------------------------");
        undoCommand.undo();
    }
}
