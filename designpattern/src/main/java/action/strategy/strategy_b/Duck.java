package action.strategy.strategy_b;

public abstract class Duck {
    //聚合飞翔技能
    protected FlyBehavior flyBehavior;
    //聚合游泳技能
    protected SwimBehavior swimBehavior;
    //聚合喝水技能
    protected DrinkBehavior drinkBehavior;

    public void fly(){
        if(null != flyBehavior){
            flyBehavior.fly();
        }
    }
    
    public void swim(){
        if(null != swimBehavior){
            swimBehavior.swim();
        }

    }
    public void drink(){
        if(null != drinkBehavior){
            drinkBehavior.drink();
        }

    }
}
