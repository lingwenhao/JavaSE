package action.strategy.strategy_h;

/**
 * 把日志记录到数据库
 * @author ronin
 * @version V1.0
 * @since 2019/8/29 9:05
 */
public class DbLog extends LogStrategyTemplate{

    /**
     * 除了定义上发生了改变外，具体的实现没变
     * @param msg 需记录的日志信息
     */
    @Override
    public void doLog(String msg) {
        //制造错误
        if(msg!=null && msg.trim().length()>5){
            int a = 5/0;
        }
        System.out.println("现在把 '"+msg+"' 记录到数据库中");
    }
}
