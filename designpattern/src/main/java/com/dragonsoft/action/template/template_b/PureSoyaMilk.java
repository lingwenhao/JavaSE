package com.dragonsoft.action.template.template_b;

/**
 * 纯豆浆
 */
public class PureSoyaMilk extends SoyaMilk{
    @Override
    void addIngredients() {
        System.out.println("纯豆浆,不加任何佐料......");
    }

    @Override
    public boolean hook() {
        return false;
    }
}
