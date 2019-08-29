package action.observer.observer_a;

/**
 * 目前状况布告板
 * @author ronin
 * @version V1.0
 * @since 2019/8/29 13:34
 */
public class CurrentConditionsDisplay implements Observer,DisplayElement{

    private float temperature;
    private float humidity;
    private float pressure;
    private Subject weatherData;

    public CurrentConditionsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    /**
     * 更新
     *
     * @param temperature
     * @param humidity
     * @param pressure
     */
    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }

    /**
     * DisplayElement接口只包含了一个方法，也就是display()。当布告板需要显示时，调用此方法。
     */
    @Override
    public void display() {
        System.out.println("Current conditions:"+temperature
                +"F degrees and "+humidity+ "% humidity and "+pressure+"Pa");
    }
}
