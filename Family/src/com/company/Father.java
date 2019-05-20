package com.company;

/*
 * The Rectangle class, subclass of Shape
 */
public class Father extends Grandparent {
    // Private member variables
    private String gender;


    // Constructor
    public Father(int age, String gender) {
        super(age);
        this.gender = gender;

    }

    @Override
    public String toString() {
        return "Father[gender=" + gender + "," + super.toString() + "]";
    }

    // Override the inherited getArea() to provide the proper implementation
    /*@Override
    public double getArea() {
        return length*width;
    }*/
}