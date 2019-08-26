package action.template.template_e.normal;

/**
 * 描述登录人员登录时填写的信息的数据模型
 * @author ronin
 * @version V1.0
 * @since 2019/8/26 11:35
 */
public class LoginModel {

    private String userId,pwd;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }
}
