package com.dragonsoft.extends_demo.extends_a;

/**
 * @author ronin
 * @version V1.0
 * @since 2019/8/14 15:51
 */
public class Cat extends Animal{

    @Override
    public void setName() {
        super.name = "猫";
    }

    @Override
    public String getName() {
        return super.name;
    }
}
