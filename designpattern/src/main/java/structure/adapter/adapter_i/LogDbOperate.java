package structure.adapter.adapter_i;

import java.util.List;

/**
 * 日志管理第二版接口
 * @author ronin
 * @version V1.0
 * @since 2019/8/8 13:56
 */
public class LogDbOperate implements LogDbOperateApi{

    @Override
    public void createLog(LogModel lm) {
        System.out.println("日志管理第二版实现，now in LogDbOperate createLog,lm="+lm);
    }

    @Override
    public List<LogModel> getAllLog() {
        System.out.println("日志管理第二版实现，now in LogDbOperate getAllLog");
        return null;
    }

    @Override
    public void removeLog(LogModel lm) {
        System.out.println("日志管理第二版实现，now in LogDbOperate removeLog,lm="+lm);
    }

    @Override
    public void updateLog(LogModel lm) {
        System.out.println("now in LogDbOperate updateLog,lm="+lm);
    }
}
