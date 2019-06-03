package com.company;

public class Employee  {
    private String name;
    private String family;
    private int salary;
    private Boolean isMarried;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public Boolean getMarried() {
        return isMarried;
    }

    public void setMarried(Boolean married) {
        isMarried = married;
    }

    public Employee(String name, String family, int salary, Boolean isMarried) {
        this.name = name;
        this.family = family;
        this.salary = salary;
        this.isMarried = isMarried;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", family='" + family + '\'' +
                ", salary=" + salary +
                ", isMarried=" + isMarried +
                '}';
    }

  /*  @Override
    public int compareTo(Employee o) {
        return  o.getSalary().compareTo(this.getSalary());
    }
*/
  /*  @Override
    public int compare(Employee o1, Employee o2) {
        return 0;
    }
    */

}
