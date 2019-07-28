package action.observer.observer_b;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 具体的发布者
 */
public class WeatherData implements Subject{
    //温度
    private String temperature;
    //气压
    private String pressure;
    //湿度
    private String humidity;

    /**
     * 所有的观察者
     */
    private List<Observer> observers;

    public WeatherData() {
        observers = new ArrayList<Observer>();
    }

    public String getTemperature() {
        return temperature;
    }

    public String getPressure() {
        return pressure;
    }

    public String getHumidity() {
        return humidity;
    }

    /**
     * 当数据有更新时就调用此方法:会先更新数据然后通知所有的观察者
     * @param temperature
     * @param pressure
     * @param humidity
     */
    public void setData(String temperature, String pressure, String humidity){
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
        //把更新推送给所有的观察者
        notifyObservers();
    }

    @Override
    public void regist(Observer object) {
        observers.add(object);
    }

    @Override
    public void remove(Observer object) {
        observers.remove(object);
    }

    /**
     * 遍历所有观察者,并通知
     */
    @Override
    public void notifyObservers() {
        Iterator<Observer> iterator = observers.iterator();
        while (iterator.hasNext()){
            Observer observer = iterator.next();
            observer.update(this.temperature,this.pressure,this.humidity);
        }
    }

    @Override
    public List<Observer> getObervers() {
        return observers;
    }

}
