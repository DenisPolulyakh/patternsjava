package com.patterns.java.www.observer.intf;

/**
 * Интерфейс наблюдателя
 */
public interface Observer {
    public void update(float temp,float himidity, float pressure);
}
