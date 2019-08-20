package action.iterator.iterator_g;


import java.util.Iterator;

/**
 * @author ronin
 * @version V1.0
 * @since 2019/8/20 9:16
 */
public abstract class Aggregate {

    /**
     * 工厂方法，创建相应迭代器对象的接口
     * @return 相应迭代器对象的接口
     */
    public abstract Iterator createIterator();
}
