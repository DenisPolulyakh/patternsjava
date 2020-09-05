package com.patterns.java.www.observer;

public class Main {

    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);

        weatherData.setMeasurements(80,65,30.4f);

        com.patterns.java.www.observer.javaimpl.WeatherData weatherData1 = new com.patterns.java.www.observer.javaimpl.WeatherData();
        com.patterns.java.www.observer.javaimpl.CurrentConditionsDisplay currentConditionsDisplay1 = new com.patterns.java.www.observer.javaimpl.CurrentConditionsDisplay(weatherData1);
        weatherData1.setMeasurements(90,70,50.4f);

    }
}
