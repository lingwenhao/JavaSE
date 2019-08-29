package action.strategy.strategy_h;

/**
 * 日志记录策略的接口
 * @author ronin
 * @version V1.0
 * @since 2019/8/29 9:02
 */
public interface LogStrategy {

    /**
     * 记录日志
     * @param msg 需记录的日志信息
     */
    public void log(String msg);
}
