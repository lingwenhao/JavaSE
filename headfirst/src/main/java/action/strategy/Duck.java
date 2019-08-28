package action.strategy;

/**
 * @author ronin
 * @version V1.0
 * @since 2019/8/28 14:20
 */
public abstract class Duck {
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    public Duck() {}

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }

    /**
     * 委托给行为类
     */
    public void performFly(){
        flyBehavior.fly();
    }

    /**
     * 委托给行为类
     */
    public void performQuack(){
        quackBehavior.quack();
    }
}
