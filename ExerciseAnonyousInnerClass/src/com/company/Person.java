package com.company;

import java.util.Comparator;

public class Person implements Comparable<Person> {
    private int id;

    public int getId() {
        return id;
    }

    private String name;

    public String getName() {
        return name;
    }

    private String family;
    public String getFamily() {
        return family;
    }



    Person(int id, String name, String family){
        this.id = id;
        this.name = name;
        this. family = family;
    }


    @Override
    public int compareTo(Person o) {
        return this.getId()- o.getId();
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", family='" + family + '\'' +
                '}';
    }
   /* public static <E extends Comparator<E>> E familyCompare(E o1, E o2) {
        if (o1.compare(o2) > 0)
            return o1;
        else
            return o2;
    }*/
   public static class nameCompare implements Comparator<Person>{


       @Override
       public int compare(Person o1, Person o2) {
           return o1.getName().compareTo(o2.getName());
       }
   }

    public static  class familyCompare implements Comparator<Person>{


        @Override
        public int compare(Person o1, Person o2) {
            return o1.getFamily().compareTo(o2.getFamily());
        }
    }
    public static class idCompare implements Comparator<Person>{


        @Override
        public int compare(Person o1, Person o2) {
            return o1.getId()-(o2.getId());
        }
    }
    /* public static <E extends Comparator<E>> E familyCompare(){

    }
    public static int nameCompare(){

    }*/

}
