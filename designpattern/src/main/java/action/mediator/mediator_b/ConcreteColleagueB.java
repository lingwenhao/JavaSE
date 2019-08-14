package action.mediator.mediator_b;

/**
 * 具体的同事类B
 * @author ronin
 * @version V1.0
 * @since 2019/8/14 11:33
 */
public class ConcreteColleagueB extends Colleague{

    public ConcreteColleagueB(Mediator mediator) {
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
