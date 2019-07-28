package action.strategy.strategy_b;

public class Client {
    public static void main(String[] args) {
        //测试野鸭各项技能
        Duck wildDuck = new WildDuck();
        wildDuck.fly();
        wildDuck.swim();
        wildDuck.drink();

        System.out.println("------------------------");
        //测试北京鸭各项技能
        Duck beijingDuck = new BeijingDuck();
        beijingDuck.fly();
        beijingDuck.swim();
        beijingDuck.drink();

        System.out.println("------------------------");
        //测试玩具鸭各项技能
        Duck toyDuck = new ToyDuck();
        toyDuck.fly();
        toyDuck.swim();
        toyDuck.drink();
    }
}
