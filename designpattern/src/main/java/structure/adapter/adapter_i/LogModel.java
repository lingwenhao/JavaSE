package structure.adapter.adapter_i;

import java.io.Serializable;

/**
 * 日志数据对象
 * @author ronin
 * @version V1.0
 * @since 2019/8/8 13:28
 */
public class LogModel implements Serializable{

    /**日志编号*/
    private String logId;

    /**操作人员*/
    private String operateUser;

    /**操作时间，以yyyy-MM-dd HH:mm:ss的格式记录*/
    private String operateTime;

    /**日志内容*/
    private String logContent;

    public String getLogId() {
        return logId;
    }

    public void setLogId(String logId) {
        this.logId = logId;
    }

    public String getOperateUser() {
        return operateUser;
    }

    public void setOperateUser(String operateUser) {
        this.operateUser = operateUser;
    }

    public String getOperateTime() {
        return operateTime;
    }

    public void setOperateTime(String operateTime) {
        this.operateTime = operateTime;
    }

    public String getLogContent() {
        return logContent;
    }

    public void setLogContent(String logContent) {
        this.logContent = logContent;
    }

    @Override
    public String toString(){
        return "logId="+logId+",operateUser="+operateUser
                +",operateTime="+operateTime+",logContent="+logContent;
    }
}
