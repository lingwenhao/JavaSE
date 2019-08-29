package action.observer.observer_a;

/**
 * @author ronin
 * @version V1.0
 * @since 2019/8/29 13:40
 */
public class Client {
    public static void main(String[] args) {
        //被观察的目标对象
        WeatherData weatherData = new WeatherData();
        /**
         * 创建具体的观察者,并使得观察者和目标对象发生关系
         */
            //具体的观察者:当前状况布告板
        CurrentConditionsDisplay currentDisplay =  new CurrentConditionsDisplay(weatherData);
            //具体的观察者:统计布告板
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
            //具体的观察者:未来状况预测布告板
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        weatherData.setMeasurements(80, 65, 30.4f);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        weatherData.setMeasurements(82, 70, 29.2f);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        weatherData.setMeasurements(78, 90, 29.2f);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }
}
