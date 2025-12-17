package com.behavioral.observer.weather.observable;
// Concrete Observable (Subject)
// WeatherStation - the concrete observable class that holds weather data

import java.util.ArrayList;

public class WeatherStation implements WeatherObservable{

    // List of observers registered for updates
    private final List<WeatherObserver> observers;
    // Observable Data
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherStation() {
        observers = new ArrayList<>();
    }

    @Override
    public void addObserver(WeatherObserver observer) {
        
    }

    @Override
    public void removeObserver(WeatherObserver observer) {

    }

    @Override
    public void notifyObservers() {

    }

    @Override
    public void setWeatherReadings(float temperature, float humidity, float pressure) {

    }
}
