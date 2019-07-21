package com.dragonsoft.create.builder.builder_d;

/**
 * 抽象的建造者
 */
public abstract class HouseBuilder {
    protected House house = new House();
    //地基
    public abstract void buildBasic();
    //墙面
    public abstract void buildWalls();
    //屋顶
    public abstract void buildRoof();

    //建造好房子后，返回房子
    public House buildHouse(){
        return house;
    }

    /**
     * 如何建造房子交给指挥者，并且把Director的功能加入到抽象构建者
     *
     */
    public House constructor(){
        this.buildBasic();
        this.buildWalls();
        this.buildRoof();
        return this.buildHouse();
    }
}
