package structure.flyweight.flyweight_f;


/**
 * @author ronin
 * @version V1.0
 * @desc
 * @since 2019/8/1 13:47
 */
public class AuthorizationFlyweight implements Flyweight {

    /**安全实体:被权限系统检测的对象*/
    private String securityEntity;
    /**权限*/
    private String authority;

    public AuthorizationFlyweight(String state){
        String ss[] = state.split(",");
        securityEntity = ss[0];
        authority = ss[1];
    }

    public String getSecurityEntity() {
        return securityEntity;
    }

    public String getAuthority() {
        return authority;
    }

    /**
     * 判断传入的安全实体和内部权限，是否和享元对象的内部状态相匹配
     *
     * @param securityEntity 安全实体:被权限系统检测的对象
     * @param authority      具体的权限
     * @return
     */
    @Override
    public boolean match(String securityEntity, String authority) {
        if(this.securityEntity.equals(securityEntity) && this.authority.equals(authority)){
            return true;
        }
        return false;
    }

    /**
     * 为flyweight添加子flyweight对象
     *
     * @param flyweight
     */
    @Override
    public void add(Flyweight flyweight) {
        throw new UnsupportedOperationException();
    }
}
