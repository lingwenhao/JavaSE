package create.builder.builder_b;

public class CommonHouseBuilder extends AbstractHouseBuilder{
    @Override
    public void buildBasic() {
        System.out.println("普通房子地基5米......");
    }

    @Override
    public void buildWalls() {
        System.out.println("普通房子围墙20公分......");
    }

    @Override
    public void buildRoof() {
        System.out.println("普通房子屋顶只有一层.......");
    }
}
