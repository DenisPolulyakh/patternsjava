package com.patterns.java.www.observer;

import com.patterns.java.www.observer.intf.DisplayElement;
import com.patterns.java.www.observer.intf.Observer;
import com.patterns.java.www.observer.intf.Subject;

public class DegreesDisplay implements Observer, DisplayElement {

    private float temperature;
    private Subject weatherData;

    public DegreesDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Temperature : "+temperature +" F degrees");
    }

    /**
     * Этот наблюдатель отображает только температуру
     * @param temperature температура
     * @param himidity влажность - не используется
     * @param pressure давление - не используется
     */
    @Override
    public void update(float temperature, float himidity, float pressure) {
        this.temperature=temperature;
        display();

    }
}
