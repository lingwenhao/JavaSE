package action.observer.observer_b;

/**
 * 1.包含了最新的天气信息
 * 2.包含了ConcreteConditions
 * 3.如果数据有更新,就调用concreteConditions.update()完成最新信息推送
 */
public class WeatherData {
    //温度
    private String temperature;
    //气压
    private String pressure;
    //湿度
    private String humidity;
    private ConcreteConditions concreteConditions;

    public WeatherData(ConcreteConditions concreteConditions) {
        this.concreteConditions = concreteConditions;
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
     * 当数据有更新时就调用此方法
     * @param temperature
     * @param pressure
     * @param humidity
     */
    public void setData(String temperature, String pressure, String humidity){
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
        //将最新的信息推送给接入方:ConcreteConditions,即调用接入方的update()
        dataChange();
    }


    public void dataChange() {
        concreteConditions.update(getTemperature(),getPressure(),getHumidity());
    }
}
