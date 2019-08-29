package action.strategy.strategy_h;

/**
 * 把日志记录到数据库
 * @author ronin
 * @version V1.0
 * @since 2019/8/29 9:06
 */
public class FileLog extends LogStrategyTemplate{

    @Override
    public void doLog(String msg) {
        System.out.println("现在把 '"+msg+"' 记录到文件中");
    }
}
