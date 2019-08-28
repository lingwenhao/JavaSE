package action.strategy;

/**
 * @author ronin
 * @version V1.0
 * @since 2019/8/28 14:35
 */
public class Client {
    public static void main(String[] args) {
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        //测试野鸭
        Duck mallardDuck =  new MallardDuck();
        mallardDuck.performFly();
        mallardDuck.performQuack();

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        //测试玩具鸭
        Duck toyDuck = new ToyDuck();
        toyDuck.performFly();
        toyDuck.performQuack();

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        //测试鸭模型
        Duck modelDuck = new ModelDuck();
        modelDuck.performFly();
        modelDuck.performQuack();
            //给鸭模型增加火箭动力
        modelDuck.setFlyBehavior(new FlyRocketPowered());
        modelDuck.performFly();
        modelDuck.performQuack();

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }
}
