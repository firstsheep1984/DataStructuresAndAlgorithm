package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Truck toyota = new Truck();
        boolean or = toyota.getOffRoad();
        or = true;
        if(or)
            System.out.println("OffRoad is True");
        else
            System.out.println("OffRoad is False");

        Car mazda = new Car("red", 4, "Mazda");
        mazda.accelerate(20);
        mazda.decelerate(10);

        System.out.println(mazda.getSpeed());
        System.out.println("My car is a: " + mazda.getMake() + " with " + mazda.getNumberOfDoors() + " doors, of the color " + mazda.getColor());
    }
}
