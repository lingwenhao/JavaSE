package structure.flyweight.flyweight_d;

/**
 * @author ronin
 */
public abstract class Flyweight {

    /**安全实体:被权限系统检测的对象*/
    private String securityEntity;
    /**权限*/
    private String authority;

    public abstract boolean match(String securityEntity,String authority);
}
