package com.dragonsoft.create.builder.builder_g;

/**
 * 指挥者
 */
public class HouseDirector2 {
    private HouseBuilder houseBuilder;

    //通过构造器传入HouseBuilder
    public HouseDirector2(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }

    //用于重置建造者
    public void setHouseBuilder(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }

    /**
     * 如何建造房子交给指挥者
     */
    public House buildeHouse(){
        houseBuilder.buildBasic();
        houseBuilder.buildRoof();
        houseBuilder.buildWalls();
        return houseBuilder.buildHouse();
    }
}
