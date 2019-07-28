package action.observer.observer_b;


import java.util.List;

/**
 * 发布者接口:由具体发布者实现,让WeatherData实现
 */
public interface Subject {
    /**
     * 注册观察者
     * @param object
     */
    void regist(Observer object);

    /**
     * 移除观察者
     * @param object
     */
    void remove(Observer object);

    /**
     * 通知所有的观察者
     */
    void notifyObservers();

    /**
     * 获取所有的观察者
     */
    List<Observer> getObervers();

}
