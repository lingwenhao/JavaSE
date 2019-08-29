package action.observer.observer_a;

/**
 * 观察者接口
 * @author ronin
 * @version V1.0
 * @since 2019/8/29 11:39
 */
public interface Observer {

    /**
     * 更新
     * @param temperature
     * @param humidity
     * @param pressure
     */
    public void update(float temperature, float humidity, float pressure);
}
