package com.company;

import java.util.*;

public class Main {

    static List<Person> personArrayList = new ArrayList<>();

    static void feedlist(){
        Person p1 = new Person(1, "Jim", "Liu");
        Person p2 = new Person(2, "Ling", "yan");
        Person p3 = new Person(3, "Lily", "Rose");
        Person p4 = new Person(4, "Johnny", "Depp");
        Person p5 = new Person(5, "Rose", "Depp");
        personArrayList = Arrays.asList(p1, p2, p3, p4, p5);
    }
    static void differentSort(){
        feedlist();
        // sort id by comparable
        Collections.sort(personArrayList);

        // sort by inner class - name/ family/ id
        Collections.sort(personArrayList, new Person.nameCompare());
        Collections.sort(personArrayList, new Person.familyCompare());
        Collections.sort(personArrayList, new Person.idCompare());

        // sort by anonymous inner class - name/ family/ id
        Collections.sort(personArrayList, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });

        Collections.sort(personArrayList, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getFamily().compareTo(o2.getFamily());
            }
        });

        Collections.sort(personArrayList, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getId() - (o2.getId());
            }
        });

        // sort by lambda - name/ family/ id
        personArrayList.sort(Comparator.comparing(e -> e.getName()));
        personArrayList.sort(Comparator.comparing(e -> e.getFamily()));
        personArrayList.sort(Comparator.comparing(e -> e.getId()));


        // sort by lambda
        Collections.sort(personArrayList, (o1,o2) -> {return o1.getFamily().compareTo(o2.getFamily());});
        Collections.sort(personArrayList, (o1,o2) -> {return o1.getName().compareTo(o2.getName());});
        Collections.sort(personArrayList, (o1,o2) -> {return o1.getId()-(o2.getId());});
    }
    public Main(){
        differentSort();
        System.out.println(personArrayList);
    }

    public static void main(String[] args) {
        new Main();




    }
}
