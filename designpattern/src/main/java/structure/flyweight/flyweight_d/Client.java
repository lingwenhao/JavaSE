package structure.flyweight.flyweight_d;


/**
 * @author ronin
 * @version V1.0
 * @desc
 * @since 2019/7/30 15:06
 */
public class Client {
    public static void main(String[] args) {
        //需要先登录，然后再判断是否有权限
        SecurityMgr securityMgr = SecurityMgr.getInstance();
        securityMgr.login("张三");
        securityMgr.login("李四");
        boolean f1 = securityMgr.hasAuthority("张三","薪资数据","查看");
        boolean f2 = securityMgr.hasAuthority("李四","薪资数据","查看");

        //表示张三对薪资数据没有查看的权限；而f2为true，表示李四对对薪资数据有查看的权限，是正确的，基本完成了功能。
        System.out.println("f1=="+f1);
        System.out.println("f2=="+f2);

        for(int i=0;i<3;i++){
            securityMgr.login("张三"+i);
            securityMgr.hasAuthority("张三"+i,"薪资数据","查看");
        }
    }
}
