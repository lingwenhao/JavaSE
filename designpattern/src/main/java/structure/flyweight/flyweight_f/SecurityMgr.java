package structure.flyweight.flyweight_f;



import java.util.ArrayList;
import java.util.Collection;

/**
 * @author ronin
 * @version V1.0
 * @desc
 * @since 2019/8/1 13:54
 */
public class SecurityMgr {

    /**
     * 饿汉式单例模式
     */
    private static final SecurityMgr securityMgr = new SecurityMgr();

    /**
     * 私有化构造方法
     */
    private SecurityMgr(){
    }

    /**
     * 获取单例的SecurityMgr实例
     * @return
     */
    public static SecurityMgr getInstance(){
        return securityMgr;
    }
    /**
     * 判断某用户对某个安全实体是否拥有某权限
     * @param user 被检测权限的用户
     * @param securityEntity 安全实体
     * @param authority 权限
     * @return true表示拥有相应权限，false表示没有相应权限
     */
    public boolean hasAuthority(String user,String securityEntity ,String authority){
        Collection<Flyweight> col = this.queryByUser(user);
        if(col==null || col.size()==0){
            System.out.println(user+"没有登录或是没有被分配任何权限");
            return false;
        }
        for(Flyweight flyweight : col){
            if(flyweight.match(securityEntity, authority)){
                return true;
            }
        }
        return false;
    }

    /**
     * 从数据库中获取某人所拥有的权限
     * @param user 需要获取所拥有的权限的人员
     * @return 某人所拥有的权限
     */
    private Collection<Flyweight> queryByUser(String user){
        Collection<Flyweight> col = new ArrayList<>();
        for(String s : DataFactory.getAuthorityInfos()){
            String ss[] = s.split(",");
            if(ss[0].equals(user)){
                Flyweight flyweight = null;
                if(ss[3].equals("2")){
                    //ss[3].equals("2")为真表示是组合
                    flyweight = new UnSharedConcreteFlyweight();
                    //获取需要组合的数据
                    String tempSs[] = DataFactory.getAuthorityInfosMap().get(ss[1]);
                    for(String tempS : tempSs){
                        Flyweight tempFm = FlyweightFactory.getInstance().getFlyweight(tempS);
                        //把这个对象加入到组合对象中
                        flyweight.add(tempFm);
                    }
                }else{
                    flyweight = FlyweightFactory.getInstance().getFlyweight(ss[1]+","+ss[2]);
                }
                col.add(flyweight);
            }
        }
        return col;
    }

}
