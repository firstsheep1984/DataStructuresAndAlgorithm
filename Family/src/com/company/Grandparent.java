package com.company;

public class Grandparent {
    // Private member variable
    private int age;

    // Constructor
    public Grandparent (int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Grandparent[age=" + age + "]";
    }

    // All family members must have a method called getArea().
    public double getArea() {
        // We have a problem here!
        // We need to return some value to compile the program.
        System.err.println("Shape unknown! Cannot compute area!");
        return 0;
    }
}
