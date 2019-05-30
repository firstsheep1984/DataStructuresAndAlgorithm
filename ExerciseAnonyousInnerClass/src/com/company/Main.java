package com.company;

import java.util.*;

public class Main {


    public static void main(String[] args) {
	// write your code here
        Person p1 = new Person(1, "Jim", "Liu");
        Person p2 = new Person(2, "Ling", "yan");
        Person p3 = new Person(3, "Lily", "Rose");
        Person p4 = new Person(4, "Johnny", "Depp");
        Person p5 = new Person(5, "Rose", "Depp");

        List<Person> personArrayList = Arrays.asList(p1,p2,p3,p4,p5);
        // sort id by comparable
        Collections.sort(personArrayList);
        System.out.println(personArrayList);
        // sort by inner class - name/ family/ id
       Collections.sort(personArrayList, new Person.nameCompare());
        System.out.println(personArrayList);
        Collections.sort(personArrayList, new Person.familyCompare());
        System.out.println(personArrayList);
        Collections.sort(personArrayList, new Person.idCompare());
        System.out.println(personArrayList);
        // sort by anonymous inner class - name/ family/ id
        Collections.sort(personArrayList, new Comparator<Person>(){
         @Override
            public int compare(Person o1, Person o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
        System.out.println(personArrayList);
        Collections.sort(personArrayList, new Comparator<Person>(){
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getFamily().compareTo(o2.getFamily());
            }
        });
        System.out.println(personArrayList);
        Collections.sort(personArrayList, new Comparator<Person>(){
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getId()-(o2.getId());
            }
        });
        System.out.println(personArrayList);
        // sort by lambda - name/ family/ id
         personArrayList.sort(Comparator.comparing(e -> e.getName()));
        System.out.println(personArrayList);
        personArrayList.sort(Comparator.comparing(e -> e.getFamily()));
        System.out.println(personArrayList);
        personArrayList.sort(Comparator.comparing(e -> e.getId()));
        System.out.println(personArrayList);
    }
}
