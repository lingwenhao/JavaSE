package action.mediator.mediator_c;

/**
 * 抽象同事类:计算机的各个部件
 * @author ronin
 * @version V1.0
 * @since 2019/8/14 11:38
 */
public abstract class Colleague {
    /**持有具体中介者的引用*/
    private Mediator mediator;

    public Colleague(Mediator mediator) {
        this.mediator = mediator;
    }

    public Mediator getMediator() {
        return mediator;
    }
}
