package create.builder.builder_c;

public class Client {
    public static void main(String[] args) {
        //盖普通房子
        CommonHouseBuilder commonHouseBuilder = new CommonHouseBuilder();
        //创建指挥者
        HouseDirector houseDirector = new HouseDirector(commonHouseBuilder);
        House commonHouse = houseDirector.buildeHouse();
        System.out.println(commonHouse);


        System.out.println("---------------------------");
        //盖高楼大厦
        HighHouseBuilder highHouseBuilder = new HighHouseBuilder();
        //重置建造者
        houseDirector.setHouseBuilder(highHouseBuilder);
        House highHouse = houseDirector.buildeHouse();
        System.out.println(highHouse);
    }
}
