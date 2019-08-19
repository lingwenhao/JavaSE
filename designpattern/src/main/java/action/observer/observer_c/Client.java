package action.observer.observer_c;

import java.util.Iterator;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        //创建具体的发布者
        WeatherData weatherData = new WeatherData();
        //创建一个观察者
        Observer concreteConditions = new ConcreteConditions();
        //注册观察者
        weatherData.regist(concreteConditions);
        //测试
        weatherData.setData("10","10","10");
        System.out.println("------------------更新天气信息------------------------");
        //更新天气信息
        weatherData.setData("20","20","20");
        System.out.println("-------------------新增观察者之后更新天气信息-----------------------");
        //新增一个观察者
        Observer baiduWebsit = new BaiduWebsit();
        //注册新的观察者
        weatherData.regist(baiduWebsit);
        //更新天气信息
        weatherData.setData("30","30","30");
        //移除百度
        weatherData.remove(baiduWebsit);
        System.out.println("-------------------移除观察者之后更新天气信息-----------------------");
        //更新天气信息
        weatherData.setData("20","20","20");

        //获取当前所有的观察者
        System.out.println("-------------------当前所有的观察者-----------------------");
        List<Observer> obervers = weatherData.getObervers();
        Iterator<Observer> iterator = obervers.iterator();
        while (iterator.hasNext()){
            Observer observer = iterator.next();
            System.out.println(observer.getClass().getName());
        }
    }
}
