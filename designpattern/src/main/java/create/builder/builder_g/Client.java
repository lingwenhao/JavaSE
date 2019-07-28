package create.builder.builder_g;

public class Client {
    public static void main(String[] args) {
        /**
         * 测试第一个指挥者:地基-->墙面-->屋顶
         */
        //盖普通房子
        CommonHouseBuilder commonHouseBuilder = new CommonHouseBuilder();
        //创建指挥者
        HouseDirector1 houseDirector1 = new HouseDirector1(commonHouseBuilder);
        House commonHouse1 = houseDirector1.buildeHouse();
        System.out.println(commonHouse1);


        System.out.println("---------------------------");
        //盖高楼大厦
        HighHouseBuilder highHouseBuilder = new HighHouseBuilder();
        //重置建造者
        houseDirector1.setHouseBuilder(highHouseBuilder);
        House highHouse1 = houseDirector1.buildeHouse();
        System.out.println(highHouse1);


        System.out.println("---------------------------");
        /**
         * 测试第二个指挥者:地基-->屋顶-->墙面
         */
        //创建指挥者
        HouseDirector2 houseDirecto2 = new HouseDirector2(commonHouseBuilder);
        House commonHouse2 = houseDirecto2.buildeHouse();
        System.out.println(commonHouse2);


        System.out.println("---------------------------");
        /**
         * 测试第三个指挥者:墙面-->屋顶-->地基
         */
        //创建指挥者
        HouseDirector3 houseDirecto3 = new HouseDirector3(commonHouseBuilder);
        House commonHouse3 = houseDirecto3.buildeHouse();
        System.out.println(commonHouse3);
    }
}
