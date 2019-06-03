package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import static java.util.stream.Collectors.toList;

public class Main {

    static List<Employee> employeeList = new ArrayList<Employee>();

    static void  feedList(){
        Employee e1 = new Employee("Smith", "John", 22000, true);
        Employee e2 = new Employee("Lynn", "Joe", 25800, true);
        Employee e3 = new Employee("Lily", "Papi", 2600, true);
        Employee e4 = new Employee("Lucy", "Jiang", 28500, true);
        Employee e5 = new Employee("Rose", "Zhou", 27500, false);
        Employee e6 = new Employee("Yolanda", "Jerry", 32000, true);
        Employee e7 = new Employee("Melisa", "Zhao", 255500, true);
        Employee e8 = new Employee("Yuan", "Wang", 25000, true);

        employeeList = Arrays.asList(e1,e2,e3,e4,e5,e6,e7,e8);

    }
    static void filter(){


    /*    Iterator<Employee> itr = employeeList.iterator();
        while (itr.hasNext()){
            if(itr.next().getSalary()<=3000){
                itr.remove();
            }
        }
*/
        employeeList = employeeList.stream().filter(e -> e.getSalary() > 3000).collect(toList());
    }
    static void sort(){
        employeeList = employeeList.stream()
                .sorted((p1, p2) -> p2.getSalary()-(p1.getSalary())).collect(toList());
    }
    public Main(){
        feedList();
        filter();
        sort();
        System.out.println(employeeList);
    }
    public static void main(String[] args) {
	// write your code here
        new Main();
    }
}
