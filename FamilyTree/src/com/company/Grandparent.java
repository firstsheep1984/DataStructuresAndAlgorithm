package com.company;

public class Grandparent extends Person  implements IProfession{


    // Constructor
    public Grandparent (String name, int age) {

        super(name,age);
        getProfession();
        String condition = ifHealthy()?"good":"bad";
        System.out.println("His health is " + condition);
    }

    @Override
    public boolean ifHealthy() {
        return false;
    }

    @Override
    public void getProfession() {
        System.out.println("His profession is a teacher.");
    }


}
