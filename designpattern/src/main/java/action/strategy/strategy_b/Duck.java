package action.strategy.strategy_b;

public abstract class Duck {
    /**
     * 聚合飞翔技能
     */
    protected FlyBehavior flyBehavior;
    /**
     * 聚合游泳技能
     */
    protected SwimBehavior swimBehavior;
    /**
     * 聚合喝水技能
     */
    protected DrinkBehavior drinkBehavior;

    /**
     * 设置实际的飞翔行为/重置鸭子飞翔行为/改变鸭子飞翔行为
     * @param flyBehavior
     */
    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    /**
     * 设置实际的游泳行为/重置鸭子游泳行为/改变鸭子游泳行为
     * @param swimBehavior
     */
    public void setSwimBehavior(SwimBehavior swimBehavior) {
        this.swimBehavior = swimBehavior;
    }

    /**
     * 设置实际的喝水行为/重置鸭子喝水行为/改变鸭子喝水行为
     * @param drinkBehavior
     */
    public void setDrinkBehavior(DrinkBehavior drinkBehavior) {
        this.drinkBehavior = drinkBehavior;
    }

    public void fly(){
        if(null != flyBehavior){
            /**
             * 鸭子对象不亲自执行飞翔相关操作，而是委托给flyBehavior实际引用
             *  的对象(即FlyBehavior接口的具体实现类))执行
             */
            flyBehavior.fly();
        }
    }
    
    public void swim(){
        if(null != swimBehavior){
            /**
             * 鸭子对象不亲自执行游泳相关操作，而是委托给swimBehavior实际引用
             *  的对象(即SwimBehavior接口的具体实现类)执行
             */
            swimBehavior.swim();
        }

    }
    public void drink(){
        if(null != drinkBehavior){
            /**
             * 鸭子对象不亲自执行喝水相关操作，而是委托给drinkBehavior实际引用
             *  的对象(即DrinkBehavior接口的具体实现类)执行
             */
            drinkBehavior.drink();
        }

    }
}
