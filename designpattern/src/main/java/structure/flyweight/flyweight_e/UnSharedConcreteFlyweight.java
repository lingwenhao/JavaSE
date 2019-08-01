package structure.flyweight.flyweight_e;

import java.util.ArrayList;
import java.util.List;

/**
 * 复合的享元对象
 */
public class UnSharedConcreteFlyweight implements Flyweight {

    /*** 存放多个单独的享元对象*/
    private List<Flyweight> flyweightList = new ArrayList<>();

    /**
     * 判断传入的安全实体和内部权限，是否和享元对象的内部状态相匹配
     *
     * @param securityEntity 安全实体:被权限系统检测的对象
     * @param authority      具体的权限
     * @return
     */
    @Override
    public boolean match(String securityEntity, String authority) {
        for(Flyweight flyweight:flyweightList){
            if(flyweight.match(securityEntity,authority)){
                return true;
            }
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
        flyweightList.add(flyweight);
    }
}
