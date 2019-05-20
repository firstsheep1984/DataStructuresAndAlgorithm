package com.company;

public class Car implements IAuto {
    private int speed;
    private String color;
    private int numberOfDoors;
    private String make;

    public Car(String c, int nod, String m)
    {
        color = c;
        numberOfDoors = nod;
        make = m;
    }

    public String getColor(){
        return color;
    }

    public int getNumberOfDoors(){
        return numberOfDoors;
    }

    public String getMake(){
        return make;
    }

    @Override
    public void accelerate(int s) {
        speed += s;
    }

    @Override
    public void decelerate(int s) {
        speed -= s;
    }

    @Override
    public int getSpeed() {
        return speed;
    }
}