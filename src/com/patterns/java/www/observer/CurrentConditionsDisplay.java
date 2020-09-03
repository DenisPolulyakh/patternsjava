package com.patterns.java.www.observer;

import com.patterns.java.www.observer.intf.DisplayElement;
import com.patterns.java.www.observer.intf.Observer;
import com.patterns.java.www.observer.intf.Subject;

public class CurrentConditionsDisplay implements Observer, DisplayElement {

    private float temperature;
    private float humidity;
    private Subject weatherData;

    public CurrentConditionsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Current conditions: "+temperature +" F degrees and "+ humidity + "% humidity");
    }

    @Override
    public void update(float temperature, float himidity, float pressure) {
        this.temperature=temperature;
        this.humidity=himidity;
        display();

    }
}
