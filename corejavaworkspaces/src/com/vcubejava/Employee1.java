package com.vcubejava;

public class Employee1 {
	
	
	@Override
	protected void finalize() throws Throwable {
		System.out.println("Garbage Collector Called !!");
	}
	public static void main(String[] args) {
		Employee1 e1= new Employee1();
		System.out.println(e1);
		Employee1 e2 = new Employee1();
		System.out.println(e2);
		e1 = null;
		e2 = null;
		
		System.gc();
		System.out.println("Object e1 is eligible for garbage collection");
		System.out.println("Object e2 is eligible for garbage collection");

		System.out.println(e1);
		System.out.println(e2);
		
	}

}
