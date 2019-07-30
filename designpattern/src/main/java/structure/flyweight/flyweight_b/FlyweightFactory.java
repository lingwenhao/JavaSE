package structure.flyweight.flyweight_b;

import java.util.HashMap;

/**
 * @author ronin
 * @version V1.0
 * @desc 享元工厂
 * @since 2019/7/30 13:24
 */
public class FlyweightFactory {
    /**私有化享元工厂构造方法*/
    private FlyweightFactory() {}

    private static final FlyweightFactory flyweightFactory = new FlyweightFactory();

    public static FlyweightFactory getInstance(){
        return flyweightFactory;
    }

    /**定义一个池容器*/
    private static HashMap<String, Flyweight> pool = new HashMap<>();

    /**
     * 享元工厂
     * @param extrinsic
     * @return
     */
    public Flyweight getFlyweight(String extrinsic) {
        Flyweight flyweight = null;
        if(pool.containsKey(extrinsic)) {
            flyweight = pool.get(extrinsic);
        }else{
            flyweight = new ConcreteFlyweight(extrinsic);
            pool.put(extrinsic,flyweight);
        }
        return flyweight;
    }

    /**
     * 获取对象种类
     * @return
     */
    public int getFlyweightCount(){
        return pool.size();
    }
}
