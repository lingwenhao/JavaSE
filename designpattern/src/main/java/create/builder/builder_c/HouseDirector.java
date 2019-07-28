package create.builder.builder_c;

/**
 * 指挥者
 */
public class HouseDirector {
    private HouseBuilder houseBuilder;

    //通过构造器传入HouseBuilder
    public HouseDirector(HouseBuilder houseBuilder) {
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
        houseBuilder.buildWalls();
        houseBuilder.buildRoof();
        return houseBuilder.buildHouse();
    }
}
