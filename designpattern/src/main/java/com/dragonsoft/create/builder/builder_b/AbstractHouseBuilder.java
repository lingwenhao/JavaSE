package com.dragonsoft.create.builder.builder_b;

public abstract class AbstractHouseBuilder {
    //建造地基
    public abstract void buildBasic();
    //建造围墙
    public abstract void buildWalls();
    //建造屋顶
    public abstract void buildRoof();

    public void build(){
        buildBasic();
        buildWalls();
        buildRoof();
    }
}
