package structure.flyweight.flyweight_b;

/**
 * @author ronin
 * @version V1.0
 * @desc
 * @since 2019/7/30 13:34
 */
public class Client {
    public static void main(String[] args) {
        /**
         * 第一次创建X、Y、Z时，都是先创建再从池中取出，而第二次创建X时，因为池中已经存
         *      在了，所以直接从池中取出，这就是享元模式。
         */
        int extrinsic = 22;
        FlyweightFactory SingleFlyweightFactory = FlyweightFactory.getInstance();
        Flyweight flyweightX = SingleFlyweightFactory.getFlyweight("X");
        flyweightX.operate(++extrinsic);

        Flyweight flyweightY = SingleFlyweightFactory.getFlyweight("Y");
        flyweightY.operate(++extrinsic);

        Flyweight flyweightZ = SingleFlyweightFactory.getFlyweight("Z");
        flyweightZ.operate(++extrinsic);

        Flyweight flyweightReX = SingleFlyweightFactory.getFlyweight("X");
        flyweightReX.operate(++extrinsic);

        Flyweight unsharedFlyweight = new UnsharedConcreteFlyweight("X");
        unsharedFlyweight.operate(++ extrinsic);

        int size = SingleFlyweightFactory.getFlyweightCount();
        System.out.println("享元池中存放的元素个数:"+size);

    }
}
