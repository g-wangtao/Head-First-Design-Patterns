package indi.karl.designpatterns.observer.weather;

/**
 * @ClassName: Observer
 * @author: karl
 * @Description: TODO(观察者接口)
 * @date: 2018/1/25 23:14
 * @see indi.karl.designpatterns.observer
 */
public interface Observer {

    void update(float temp, float humidity, float pressure);

}
