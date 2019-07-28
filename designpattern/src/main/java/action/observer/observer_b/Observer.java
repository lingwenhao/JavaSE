package action.observer.observer_b;

/**
 * 订阅者接口:由具体观察者实现
 */
public interface Observer {
    void update(String temperature, String pressure, String humidity);
}
