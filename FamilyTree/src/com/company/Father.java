package com.company;

/*
 * The Rectangle class, subclass of Shape
 */
public class Father extends Grandparent implements IProfession{
    // private String hobby;

    // Constructor
    public Father(String name,int age, String hobby) {
        super(name,age);
        //this.hobby = hobby;
        System.out.println("His hobby is playing " + hobby);
       // getProfession();

    }

    @Override
    public void getProfession(){
        System.out.println("His profession is an engineer.");
    }
    @Override
    public boolean ifHealthy() {
        return true;
    }

}