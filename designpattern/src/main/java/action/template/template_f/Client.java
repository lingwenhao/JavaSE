package action.template.template_f;

/**
 * @author ronin
 * @version V1.0
 * @since 2019/8/26 14:25
 */
public class Client {

    public static void main(String[] args) {
        //准备登录人的信息
        LoginModel lm = new LoginModel();
        lm.setLoginId("admin");
        lm.setPwd("workerpwd");

        //准备用来进行判断的对象
        LoginTemplate lt = new WorkerLogin();
        LoginTemplate lt2 = new NormalLogin();

        //进行登录测试
        boolean flag = lt.login(lm);
        System.out.println("可以登录工作平台="+flag);

        boolean flag2 = lt2.login(lm);
        System.out.println("可以进行普通人员登录="+flag2);
    }
}
