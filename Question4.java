package com.company;
/*
Q4.Create an Employee Class with instance variables (String) name, (Integer)age, (String)city and
 get the instance of the Class using constructor reference
 */

interface EmployeeInfo{
    public void getConstructor(String name, int age, String city);
}

class Employee{
    private String name;
    private int age;
    private String city;

    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public String getCity() {
        return city;
    }

    public Employee(String name, int age, String city) {
        this.name = name;
        this.age = age;
        this.city = city;
        System.out.println("Name : "+this.name+" Age : "+this.age+" City "+this.city);
    }

}



public class ProgramQuestions {

    public static void main(String [] args){
        EmployeeInfo e1 = Employee::new;
        e1.getConstructor("Rajdeep" ,21, "Noida");
    }
}

