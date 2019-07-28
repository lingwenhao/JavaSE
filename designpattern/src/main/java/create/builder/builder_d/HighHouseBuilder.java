package create.builder.builder_d;

/**
 * 具体的建造者，只负责产品的创建
 */
public class HighHouseBuilder extends HouseBuilder {
    @Override
    public void buildBasic() {
        super.house.setBasic("高楼大厦地基");
        System.out.println("高楼大厦地基......");
    }

    @Override
    public void buildWalls() {
        super.house.setWalls("高楼大厦墙面");
        System.out.println("高楼大厦墙面......");
    }

    @Override
    public void buildRoof() {
        super.house.setRoof("高楼大厦屋顶");
        System.out.println("高楼大厦屋顶......");
    }
}
