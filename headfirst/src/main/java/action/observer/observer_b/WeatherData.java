package action.observer.observer_b;

import java.util.Observable;

/**
 * 主题
 * @author ronin
 * @version V1.0
 * @since 2019/8/29 15:20
 */
public class WeatherData extends Observable{
    /*温度**/
    private float temperature;
    /*湿度**/
    private float humidity;
    /*压力**/
    private float pressure;

    public WeatherData(){}


    /**
     * 测量数据发生了改变
     */
    public void measurementsChanage(){
        setChanged();
        notifyObservers();
    }

    /**
     * 设置数据
     * @param temperature
     * @param humidity
     * @param pressure
     */
    public void setMeasurements(float temperature,float humidity,float pressure){
      this.temperature = temperature;
      this.humidity = humidity;
      this.pressure = pressure;
      measurementsChanage();
    }

    /**
     * 观察者使用下面的方法获取WeatherData对象的状态
     * @return 温度
     */
    public float getTemperature() {
        return temperature;
    }

    /**
     * 观察者使用下面的方法获取WeatherData对象的状态
     * @return 湿度
     */
    public float getHumidity() {
        return humidity;
    }

    /**
     * 观察者使用下面的方法获取WeatherData对象的状态
     * @return 气压
     */
    public float getPressure() {
        return pressure;
    }
}
