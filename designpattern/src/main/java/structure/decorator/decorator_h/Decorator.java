package structure.decorator.decorator_h;

import java.util.Date;

/**
 * 装饰者接口，需要和被装饰的对象实现同样的接口
 * @author ronin
 * @version V1.0
 * @since 2019/8/6 15:37
 */
public abstract class Decorator implements Component{

    /**持有被装饰者的引用*/
    private Component component;

    public Decorator(Component component) {
        this.component = component;
    }

    /**
     * 计算某人在某段时间内的奖金，有些参数在演示中并不会使用，
     * 但是在实际业务实现上是会用的，为了表示这是个具体的业务方法，
     * 因此这些参数被保留了
     *
     * @param user  被计算奖金的人员
     * @param begin 计算奖金的开始时间
     * @param end   计算奖金的结束时间
     * @return 某人在某段时间内的奖金
     */
    @Override
    public double calcPrize(String user, Date begin, Date end) {
        return component.calcPrize(user,begin,end);
    }
}
