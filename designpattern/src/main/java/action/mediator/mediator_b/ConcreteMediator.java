package action.mediator.mediator_b;

/**
 * 具体中介者
 * @author ronin
 * @version V1.0
 * @since 2019/8/14 11:34
 */
public class ConcreteMediator implements Mediator{

    /**持有并维护同事A*/
    private ConcreteColleagueA colleagueA;

    /**持有并维护同事B*/
    private ConcreteColleagueB colleagueB;

    /**
     * 设置中介者需要了解并维护的同事A对象
     * @param colleague 同事A对象
     */
    public void setConcreteColleagueA(ConcreteColleagueA colleague) {
        colleagueA = colleague;
    }

    /**
     * 设置中介者需要了解并维护的同事B对象
     * @param colleague 同事B对象
     */
    public void setConcreteColleagueB(ConcreteColleagueB colleague) {
        colleagueB = colleague;
    }

    @Override
    public void changed(Colleague colleague) {
        //某个同事类发生了变化，通常需要与其它同事交互
        //具体协调相应的同事对象来实现协作行为
    }

}
