package structure.decorator.decorator_h;

import structure.decorator.decorator_g.TempDB;

import java.util.Date;

/**
 * 装饰者对象:计算当月业务奖金
 * @author ronin
 * @version V1.0
 * @since 2019/8/6 15:39
 */
public class MonthPrizeDecorator extends Decorator {

    public MonthPrizeDecorator(Component component) {
        super(component);
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
        //1.先计算出前面运算出来的奖金
        double money = super.calcPrize(user, begin, end);
        //2：然后计算当月业务奖金,按人员和时间去获取当月业务额，然后再乘以3%
        double prize = TempDB.mapMonthSaleMoney.get(user) * 0.03;
        System.out.println(user+"当月业务奖金"+prize);
        return money + prize;
    }
}
