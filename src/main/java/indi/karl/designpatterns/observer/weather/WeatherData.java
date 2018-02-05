package indi.karl.designpatterns.observer.weather;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName: WeatherData
 * @author: karl
 * @Description: TODO(天气数据类)
 * @date: 2018/1/25 23:00
 * @see indi.karl.designpatterns.observer
 */
public class WeatherData implements Subject {

    private List<Observer> observers;

    private float temperature;

    private float humidity;

    private float pressure;

    public WeatherData() {
        observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        int i = observers.indexOf(o);
        if (i >= 0) observers.remove(i);
    }

    @Override
    public void notifyObservers() {
        for (Observer o : observers) {
            o.update(temperature, humidity, pressure);
        }
    }

    public void measurementsChanged() {
        notifyObservers();
    }

    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }

    public void getTemperature() {
    }

    public void getHumidity() {
    }

    public void getPressure() {
    }


}
