package com.patterns.java.www.observer;

/**
 * Паттерн наблюдатель - поведенческий паттерн
 */
public class Main {

    public static void main(String[] args) {
        // Издатель и два подписчика
        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
        DegreesDisplay degreesDisplay = new DegreesDisplay(weatherData);

        weatherData.setMeasurements(80,65,30.4f);
        // Второй издатель с одним подписчиком подписчиком
        com.patterns.java.www.observer.javaimpl.WeatherData weatherData1 = new com.patterns.java.www.observer.javaimpl.WeatherData();
        com.patterns.java.www.observer.javaimpl.CurrentConditionsDisplay currentConditionsDisplay1 = new com.patterns.java.www.observer.javaimpl.CurrentConditionsDisplay(weatherData1);
        weatherData1.setMeasurements(90,70,50.4f);

    }
}
