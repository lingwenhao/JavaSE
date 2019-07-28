package create.builder.builder_g;

/**
 * 指挥者
 */
public class HouseDirector3 {
    private HouseBuilder houseBuilder;

    //通过构造器传入HouseBuilder
    public HouseDirector3(HouseBuilder houseBuilder) {
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
        houseBuilder.buildWalls();
        houseBuilder.buildRoof();
        houseBuilder.buildBasic();
        return houseBuilder.buildHouse();
    }
}
