package com.vcubejava;

public class Employee {

    static String companyName;
    static String location;

    String employeeName;
    int salary;

    static {
        companyName = "TCS";
        location = "Hyderabad";

        System.out.println("Static Block Executed");
    }

    {
        System.out.println("Instance Block Executed");
    }
    void display() {
    	 System.out.println("\nEmployee 1 Details");
         System.out.println("Company Name : " + companyName);
         System.out.println("Location : " + location);
         System.out.println("Employee Name : " + employeeName);
         System.out.println("Salary : " + salary);
    }

    public static void main(String[] args) {

        Employee e1 = new Employee();
        Employee e2 = new Employee();

        e1.employeeName = "Hannu";
        e1.salary = 2500000;

        e2.employeeName = "Mani Deep";
        e2.salary = 3000000;
        e1.display();
e2.display();
       
    }
}