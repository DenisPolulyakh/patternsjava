package com.patterns.java.www.observer;

import com.patterns.java.www.observer.intf.Observer;
import com.patterns.java.www.observer.intf.Subject;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject {
    private List<Observer> observers;
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData() {
        this.observers = new ArrayList();
    }

    /**
     * Метод добавление наблюдателя
     * подписка
     *
     * @param o - наблюдатель
     */
    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    /**
     * Метод удаление наблюдателя
     * отписка
     *
     * @param o - наблюдатель
     */

    @Override
    public void removeObserver(Observer o) {
        int index = observers.indexOf(o);
        if (index >= 0) {
            observers.remove(index);
        }
    }

    /**
     * Оповещение наблюдателей об изменении сотосяния через
     *
     */

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(temperature, humidity, pressure);
        }
    }

    public void measurementsChanged(){
        notifyObservers();
    }

    public void setMeasurements(float temperature,float humidity,float pressure){
        this.temperature=temperature;
        this.humidity=humidity;
        this.pressure=pressure;
        measurementsChanged();
    }
}
