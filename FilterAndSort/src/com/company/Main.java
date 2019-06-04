package com.company;

import java.util.*;


public class Main {

    static List<Employee> employeeList = new ArrayList<Employee>();

    static void feedList() {
        Employee e1 = new Employee("Smith", "John", 22000, true);
        Employee e2 = new Employee("Lynn", "Joe", 25800, true);
        Employee e3 = new Employee("Lily", "Papi", 2600, true);
        Employee e4 = new Employee("Lucy", "Jiang", 28500, true);
        Employee e5 = new Employee("Rose", "Zhou", 27500, false);
        Employee e6 = new Employee("Yolanda", "Jerry", 32000, true);
        Employee e7 = new Employee("Melisa", "Zhao", 255500, true);
        Employee e8 = new Employee("Yuan", "Wang", 25000, true);

        employeeList = Arrays.asList(e1, e2, e3, e4, e5, e6, e7, e8);

    }

    static void filter() {

       /* 1. anonymous inner class
       Collections.sort(employeeList, new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return o1.getSalary() - o2.getSalary();
            }
        });
*/
        // 2. lambda expression
        Collections.sort(employeeList, (Employee e1, Employee e2) -> {
            return e2.getSalary() - e1.getSalary();
        });

        // 3. Java 8
        employeeList.stream().sorted((e1,e2) -> {
            return e2.getSalary() - e1.getSalary();});

        // 1. iterator
        Iterator<Employee> itr = employeeList.iterator();
        while (itr.hasNext()) {

            Employee e = itr.next();
            if (e.getSalary() > 3000 && e.getMarried()) {
                System.out.println(e);
                //  this will cause error
                //  itr.remove();
            }
        }
        // 2. Java 8
        employeeList.stream().filter(e -> e.getSalary()>3000 && e.getMarried());

    }

    public Main() {
        feedList();
        filter();

        // System.out.println(employeeList);
    }

    public static void main(String[] args) {
        // write your code here
        new Main();
    }
}
