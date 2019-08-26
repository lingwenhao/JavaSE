package action.template.template_f;

/**
 * 普通用户登录控制的逻辑处理
 * @author ronin
 * @version V1.0
 * @since 2019/8/26 14:23
 */
public class NormalLogin extends LoginTemplate{

    /**
     *
     * @param loginId 登录编号
     * @return
     */
    @Override
    public LoginModel findLoginUser(String loginId) {
        // 这里省略具体的处理，仅做示意，返回一个有默认数据的对象
        LoginModel lm = new LoginModel();
        lm.setLoginId(loginId);
        lm.setPwd("testpwd");
        return lm;
    }
}
