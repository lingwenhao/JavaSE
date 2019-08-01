package structure.flyweight.flyweight_c;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * @author ronin
 * @version V1.0
 * @desc 安全管理，实现成单例
 * @since 2019/7/30 15:02
 */
public class SecurityMgr {
    /**单例的安全管理对象*/
    private static SecurityMgr securityMgr = new SecurityMgr();

    private SecurityMgr(){
    }

    public static SecurityMgr getInstance(){
        return securityMgr;
    }

    /**
     * 在运行期间，用来存放登录人员对应的权限，
     * 在Web应用中，这些数据通常会存放到session中
     */
    private Map<String,Collection<AuthorizationModel>> map = new HashMap<>();

    /**
     * 模拟登录的功能
     * @param user 登录的用户
     */
    public void login(String user){
        //登录时就需要把该用户所拥有的权限，从数据库中取出来，放到缓存中去
        Collection<AuthorizationModel> col = validateAutority(user);
        map.put(user, col);
    }

    /**
     * 模拟从数据库中获取某人所拥有的权限
     * @param user 需要获取所拥有的权限的人员
     * @return 某人所拥有的权限
     */
    private Collection<AuthorizationModel> validateAutority(String user){
        Collection<AuthorizationModel> col = new ArrayList<>();
        for(String authorityInfo : DataFactory.getAuthorityInfos()){
            String[] authorityInfoArr = authorityInfo.split(",");
            //authorityInfoArr结构:{"张三","人员列表","查看"}
            if(authorityInfoArr[0].equals(user)){
                AuthorizationModel am = new AuthorizationModel();
                am.setUser(authorityInfoArr[0]);
                am.setSecurityEntity(authorityInfoArr[1]);
                am.setAuthority(authorityInfoArr[2]);
                /**
                 * 和享元模式的区别:此模式并没有区分出变化和不变化的元数据，而是将变化和不变化的元数据一起封装到了
                 * AuthorizationModel这个实体中，而享元模式是区分出不变的发生变化的，把不变的作为内部状态封装
                 * 到享元类中
                 */
                col.add(am);
            }
        }
        return col;
    }

    /**
     * 判断某用户对某个安全实体是否拥有某权限
     * @param user 被检测权限的用户
     * @param securityEntity 安全实体
     * @param authority 权限
     * @return true表示拥有相应权限，false表示没有相应权限
     */
    public boolean hasAuthority(String user,String securityEntity,String authority){
        Collection<AuthorizationModel> col = map.get(user);
        if(col==null || col.size()==0){
            System.out.println(user+"没有登录或是没有被分配任何权限");
            return false;
        }
        for(AuthorizationModel am : col){
            //输出当前实例，看看是否同一个实例对象
            System.out.println("am=="+am);
            if(am.getSecurityEntity().equals(securityEntity) && am.getAuthority().equals(authority)){
                return true;
            }
        }
        return false;
    }

}
