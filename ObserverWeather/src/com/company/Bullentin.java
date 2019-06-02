package com.company;

public class Bullentin implements Observer, DisplayElement{
    private float temprature;
    private float humidity;
    private Subject weather;

    @Override
    public void display() {
        System.out.println("Current conditions: " + temprature + "F degrees and " + humidity);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temprature = temp;
        this.humidity = humidity;
        display();
    }

    public Bullentin(Subject weather){
        this.weather = weather;
        weather.registerObserver(this);
    }
}
