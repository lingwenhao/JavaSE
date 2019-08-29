package action.observer.observer_b;


import java.util.Observable;
import java.util.Observer;

/**
 * 观察者
 * @author ronin
 * @version V1.0
 * @since 2019/8/29 15:56
 */
public class StatisticsDisplay implements Observer, DisplayElement {

    private float temperature;
    private float humidity;
    private float pressure;
    private Observable weatherData;

    public StatisticsDisplay(Observable weatherData) {
        this.weatherData = weatherData;
        weatherData.addObserver(this);
    }

    /**
     * @param obs 主题
     * @param arg 参数
     */
    @Override
    public void update(Observable obs, Object arg) {
        if (obs instanceof WeatherData) {
            WeatherData weatherData = (WeatherData)obs;
            this.temperature = weatherData.getTemperature();
            this.humidity = weatherData.getHumidity();
            this.pressure = weatherData.getPressure();
            display();
        }
    }

    /**
     * DisplayElement接口只包含了一个方法，也就是display()。当布告板需要显示时，调用此方法。
     */
    @Override
    public void display() {
        System.out.println("Statistics:"+temperature
                +"F degrees and "+humidity+ "% humidity and "+pressure+"Pa");
    }
}
