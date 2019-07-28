package create.builder.builder_b;

public class HighHouseBuilder extends AbstractHouseBuilder{
    @Override
    public void buildBasic() {
        System.out.println("高楼大厦地基50米......");
    }

    @Override
    public void buildWalls() {
        System.out.println("高楼大厦围墙40公分......");
    }

    @Override
    public void buildRoof() {
        System.out.println("高楼大厦屋顶有三层.......");
    }
}
