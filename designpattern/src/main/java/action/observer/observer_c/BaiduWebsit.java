package action.observer.observer_c;

/**
 * 观察者
 */
public class BaiduWebsit implements Observer{

    //温度
    private String temperature;
    //气压
    private String pressure;
    //湿度
    private String humidity;

    /**
     * 更新
     * @param temperature
     * @param pressure
     * @param humidity
     */
    @Override
    public void update(String temperature, String pressure, String humidity) {
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
        display();
    }

    public void display() {
        System.out.println("=========第二个观察者:百度=============");
        System.out.println("今日温度:"+temperature);
        System.out.println("今日气压:"+pressure);
        System.out.println("今日湿度:"+humidity);
    }
}
