package com.dragonsoft.create.builder.builder_f;

public class Client {
    public static void main(String[] args) {
        //创建普通房子建造者
        HouseBuilder commonHouseBuilder = new CommonHouseBuilder();
        //建造普通房子
        House commonHouse = commonHouseBuilder
                        .buildBasic("普通房子地基")
                        .buildWalls("普通房子墙壁")
                        .buildRoof("普通房子房顶")
                        .build();
        System.out.println(commonHouse);


        System.out.println("---------------------------");
        //创建高楼大厦建造者
        HouseBuilder highHouseBuilder = new HighHouseBuilder();
        //建造高楼大厦
        House highHouse = highHouseBuilder
                        .buildBasic("高楼大厦地基")
                        .buildWalls("高楼大厦墙壁")
                        .buildRoof("高楼大厦屋顶")
                        .build();
        System.out.println(highHouse);
    }
}
