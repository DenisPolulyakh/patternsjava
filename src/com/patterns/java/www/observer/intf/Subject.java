package com.patterns.java.www.observer.intf;

/**
 * Интерфейс субъекта
 */
public interface Subject {
    public void registerObserver(Observer o);
    public void removeObserver(Observer o);
    public void notifyObservers();

}

