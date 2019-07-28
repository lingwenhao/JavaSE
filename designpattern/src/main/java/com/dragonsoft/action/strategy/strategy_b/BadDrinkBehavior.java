package com.dragonsoft.action.strategy.strategy_b;

public class BadDrinkBehavior implements DrinkBehavior{
    @Override
    public void drink() {
        System.out.println("喝水技能糟糕.....");
    }
}
