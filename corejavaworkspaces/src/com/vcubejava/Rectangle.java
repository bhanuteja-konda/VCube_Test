package com.vcubejava;

public class Rectangle {
	void calculateArea() {
		int length=10;
		int breadth=20;
		int area = length*breadth;
		int perimeter = 2*(length+breadth);
		System.out.println("Area of the Rectangle is "+area);
		System.out.println("Perimeter of the Rectangle is "+perimeter);
	}
	public static void main(String[] args) {
		Rectangle r = new Rectangle();
		r.calculateArea();

	}

}
