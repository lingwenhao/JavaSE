package action.observer.observer_i;

import java.util.ArrayList;
import java.util.List;

/**
 * 发布者抽象类
 * @author ronin
 * @version V1.0
 * @since 2019/8/30 10:54
 */
public abstract class Subject {

    /**管理所有的发布者*/
    private List<Observer> observers = new ArrayList<>();

    /**添加观察者*/
    public void addObserver(Observer observer){
        if(observer != null && !observers.contains(observer)){
            observers.add(observer);
        }
    }

    /**
     * 移除观察者
     * @param observer
     */
    public void removeObserver(Observer observer){
        if(observer != null && observers.contains(observer)){
            observers.remove(observer);
        }
    }

    /**
     * @param subject 目标对象
     */
    public void notifyObserver(Subject subject){
        for (Observer observer : observers) {
            observer.update(subject,observer);
        }
    }
}
