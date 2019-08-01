package structure.flyweight.flyweight_e;

/**
 * @author ronin
 */
public interface Flyweight {

    /**
     * 判断传入的安全实体和内部权限，是否和享元对象的内部状态相匹配
     * @param securityEntity 安全实体:被权限系统检测的对象
     * @param authority 具体的权限
     * @return
     */
    boolean match(String securityEntity, String authority);

    /**
     * 为flyweight添加子flyweight对象
     * @param flyweight 被添加的子flyweight对象
     */
    void add(Flyweight flyweight);
}
