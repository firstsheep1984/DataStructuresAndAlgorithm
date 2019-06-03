package com.company;

import java.util.ArrayList;

public class Weather implements Subject{
    private ArrayList observers;
    private float temprature;
    private float humidity;
    private float pressure;

    public Weather(){
        observers = new ArrayList();
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        int i = observers.indexOf(o);
        if(i >= 0){
            observers.remove(i);
        }
    }

    @Override
    public void notifyObserver() {
        for (int i = 0; i < observers.size(); i++) {
            Observer observer = (Observer)observers.get(i);
            observer.update(temprature,humidity,pressure);
        }
    }

    public void measurementChanged(){
        notifyObserver();
    }

    public void setMessurements(float temprature, float humidity, float pressure){
        this.temprature = temprature;
        this.humidity = humidity;
        this. pressure = pressure;
        measurementChanged();
    }
}
