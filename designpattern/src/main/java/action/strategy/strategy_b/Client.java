package action.strategy.strategy_b;

public class Client {
    public static void main(String[] args) {
        System.out.println("--------------------测试野鸭各项技能--------------------");
        Duck wildDuck = new WildDuck();
        wildDuck.fly();
        wildDuck.swim();
        wildDuck.drink();

        System.out.println("--------------------测试北京鸭各项技能--------------------");
        Duck beijingDuck = new BeijingDuck();
        beijingDuck.fly();
        beijingDuck.swim();
        beijingDuck.drink();

        System.out.println("--------------------测试玩具鸭各项技能--------------------");
        Duck toyDuck = new ToyDuck();
        toyDuck.fly();
        toyDuck.swim();
        toyDuck.drink();


        //对玩具鸭进行升级，升级完成后玩具鸭具有了飞行行为
        System.out.println("--------------------测试最新版玩具鸭各项技能--------------------");
        Duck newToyDuck = new ToyDuck();
            //升级飞翔行为
        newToyDuck.setFlyBehavior(new GoodFlyBehavior());
        newToyDuck.fly();
        newToyDuck.swim();
        newToyDuck.drink();
    }
}
