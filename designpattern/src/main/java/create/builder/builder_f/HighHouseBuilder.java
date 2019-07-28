package create.builder.builder_f;

/**
 * 具体的建造者，只负责产品的创建
 */
public class HighHouseBuilder extends HouseBuilder {
    private House house;
    public HighHouseBuilder() {
        house = new House();
    }
    @Override
    public HouseBuilder buildBasic(String basic) {
        house.setBasic(basic);
        System.out.println("高楼大厦地基......");
        return this;
    }

    @Override
    public HouseBuilder buildWalls(String walls) {
        house.setWalls(walls);
        System.out.println("高楼大厦墙面......");
        return this;
    }

    @Override
    public HouseBuilder buildRoof(String roof) {
        house.setRoof(roof);
        System.out.println("高楼大厦屋顶......");
        return this;
    }

    @Override
    public House build() {
        return house;
    }
}
