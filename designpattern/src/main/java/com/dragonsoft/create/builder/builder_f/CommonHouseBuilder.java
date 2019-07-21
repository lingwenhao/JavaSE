package com.dragonsoft.create.builder.builder_f;

/**
 * 具体的建造者
 */
public class CommonHouseBuilder extends HouseBuilder {
    private House house;
    public CommonHouseBuilder() {
        house = new House();
    }

    @Override
    public HouseBuilder buildBasic(String basic) {
        house.setBasic(basic);
        System.out.println("普通房子地基......");
        return this;
    }

    @Override
    public HouseBuilder buildWalls(String walls) {
        house.setWalls(walls);
        System.out.println("普通房子墙面......");
        return this;
    }

    @Override
    public HouseBuilder buildRoof(String roof) {
        house.setRoof(roof);
        System.out.println("普通房子屋顶......");
        return this;
    }

    @Override
    public House build() {
        return house;
    }
}
