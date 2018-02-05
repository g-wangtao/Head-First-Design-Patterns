package indi.karl.designpatterns.observer.weather;

/**
 * @ClassName: Subject
 * @author: karl
 * @Description: TODO(出版者接口)
 * @date: 2018/1/25 22:38
 * @see indi.karl.designpatterns.observer
 */
public interface Subject {

    void registerObserver(Observer o);

    void removeObserver(Observer o);

    void notifyObservers();
}
