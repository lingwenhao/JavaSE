package com.dragonsoft.action.observer.oberver_a;

/**
 * 当前天气情况:可以理解为气象站自己的网站
 */
public class ConcreteConditions {
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
    public void update(String temperature, String pressure, String humidity) {
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
        display();
    }

    public void display() {
        System.out.println("今日温度:"+temperature);
        System.out.println("今日气压:"+pressure);
        System.out.println("今日湿度:"+humidity);
    }
}
