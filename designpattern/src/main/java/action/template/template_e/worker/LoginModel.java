package action.template.template_e.worker;

/**
 * 描述登录人员登录时填写的信息的数据模型
 * @author ronin
 * @version V1.0
 * @since 2019/8/26 13:19
 */
public class LoginModel {
    private String workerId,pwd;

    public String getWorkerId() {
        return workerId;
    }

    public void setWorkerId(String workerId) {
        this.workerId = workerId;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }
}
