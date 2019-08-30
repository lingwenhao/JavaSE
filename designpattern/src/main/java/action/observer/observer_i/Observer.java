package action.observer.observer_i;

/**
 * 观察者接口
 * @author ronin
 * @version V1.0
 * @since 2019/8/30 10:55
 */
public interface Observer {

    /**
     * @param subject 目标对象
     * @param observer 观察者
     */
    void update(Subject subject,Observer observer);
}
