package com.javamethods;

public class Employee {
	int empID;
	String empName;
	double salary;
	public Employee() {}
	public Employee(int empID, String empName, double salary) {
		this.empID = empID;
		this.empName = empName;
		this.salary = salary;
	}
	Employee(Employee emp,String s){
		this.empID =emp.empID;
		this.empName = s;
		this.salary = emp.salary;
	}
	void display() {
		System.out.println("ID : "+empID);
		System.out.println("Name  : "+empName);
		System.out.println("Salary : "+salary);
	}
	void incrementSalary(double amount){
		this.salary=salary +amount;
	}
	void main(String[] args) {
		Employee emp1= new Employee(101,"Krishna",50000.0);
		Employee emp2 = new Employee(emp1,"Ravi");
		double amount = 10000.00;
		System.out.println("Employee 1");
		emp1.display();
		emp2.incrementSalary(amount);
		System.out.println("Employee 2");
		emp2.display();
	}

}
