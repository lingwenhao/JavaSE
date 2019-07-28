package com.dragonsoft.action.strategy.strategy_b;

/**
 * 北京鸭
 */
public class BeijingDuck extends Duck {
    public BeijingDuck() {
        System.out.println("北京鸭.....");
        //北京鸭飞翔技能一般
        super.flyBehavior = new BadFlyBehavior();
        //北京鸭游泳技能一般
        super.swimBehavior = new BadSwimBehavior();
        //北京鸭喝水技能一般
        super.drinkBehavior = new BadDrinkBehavior();
    }

}
