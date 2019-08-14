package action.mediator.mediator_b;

/**
 * 具体同事类A
 * @author ronin
 * @version V1.0
 * @since 2019/8/14 11:32
 */
public class ConcreteColleagueA extends Colleague{

    public ConcreteColleagueA(Mediator mediator) {
        super(mediator);
    }

    /**
     * 示意方法，执行某些业务功能
     */
    public void someOperation() {
        //在需要跟其它同事通信的时候，通知中介者对象
        getMediator().changed(this);
    }
}
