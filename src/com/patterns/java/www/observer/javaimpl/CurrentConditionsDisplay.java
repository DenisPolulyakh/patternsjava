package com.patterns.java.www.observer.javaimpl;

import com.patterns.java.www.observer.intf.DisplayElement;

import java.util.Observable;
import java.util.Observer;

public class CurrentConditionsDisplay implements Observer, DisplayElement {

    private Observable observable;
    private float temperature;
    private float humidity;

    public CurrentConditionsDisplay(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Current conditions: " + temperature + " F degrees and " + humidity + "% humidity");
    }

    @Override
    public void update(Observable o, Object arg) {

        if (o instanceof com.patterns.java.www.observer.javaimpl.WeatherData) {
            com.patterns.java.www.observer.javaimpl.WeatherData weatherData = (com.patterns.java.www.observer.javaimpl.WeatherData) o;
            this.temperature = weatherData.getTemperature();
            this.humidity = weatherData.getHumidity();
            display();
        }

    }
}
