package action.command.command_d;

/**
 * @author ronin
 * @version V1.0
 * @since 2019/8/5 10:52
 */
public interface MainBoardApi {
    /**
     * 主板具有能开机的功能
     */
    void open();

    /**
     * 主板具有重启的命令
     */
    void restart();
}
