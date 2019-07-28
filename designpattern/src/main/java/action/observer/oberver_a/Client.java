package action.observer.oberver_a;

public class Client {
    public static void main(String[] args) {
        //创建接入方
        ConcreteConditions concreteConditions = new ConcreteConditions();
        //创建接入方
        WeatherData weatherData = new WeatherData(concreteConditions);
        //设置天气信息
        weatherData.setData("10","10","10");
        System.out.println("==========天气情况发生了变化==========");
        //更新数据
        weatherData.setData("20","20","20");
    }
}
