package action.observer.observer_a;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ronin
 * @version V1.0
 * @since 2019/8/29 13:21
 */
public class WeatherData implements Subject{
    private List<Observer> observers;

    /*温度**/
    private float temperature;
    /*湿度**/
    private float humidity;
    /*压力**/
    private float pressure;

    public WeatherData(){
        observers = new ArrayList<>();
    }

    /**
     * 注册观察者
     *
     * @param o
     */
    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    /**
     * 移除观察者
     *
     * @param o
     */
    @Override
    public void removeOberver(Observer o) {
        if(observers.contains(o)){
            observers.remove(o);
        }
    }

    /**
     * 通知所有的观察者
     */
    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(temperature,humidity,pressure);
        }
    }

    /**
     * 当测量值发生了改变时
     */
    public void measurementsChanged(){
        notifyObservers();
    }

    /**
     * 设置测量值
     * @param temperature
     * @param humidity
     * @param pressure
     */
    public void setMeasurements(float temperature,float humidity,float pressure){
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }
}
