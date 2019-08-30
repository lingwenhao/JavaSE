package action.observer.observer_h;

import java.util.ArrayList;
import java.util.List;

/**
 * 目标对象接口
 * @author ronin
 * @version V1.0
 * @since 2019/8/30 9:56
 */
public class Subject {

    /**管理所有的观察者*/
    private List<Observer> observers = new ArrayList<Observer>();

    /**
     * 添加观察者
     * @param observer
     */
    public void addObserer(Observer observer){
        if(observer!= null && !observers.contains(observer)){
            observers.add(observer);
        }
    }

    /**
     * 移除观察者
     * @param observer
     */
    public void removeObserer(Observer observer){
        if(observer!= null && !observers.contains(observer)){
            observers.remove(observer);
        }
    }

    /**
     * 通知所有的观察者
     */
    public void notifyObservers(){
        for (Observer observer : observers) {
            //observer.update(observer);
            observer.update(this);
        }
    }
}
