package com.vcubejava;

public class WrapperObjects {
	Integer i= 10;
	int pm = Integer.valueOf(50);
	String num="12345";
	public static void main(String[] args) {
		WrapperObjects w= new WrapperObjects();
		System.out.println("The integer value is from primitive to Wrapper object : "+ w.i);
		System.out.println("The integer value is from Wrapper object to primitive : "+w.pm);
		int convnum = Integer.parseInt(w.num);
		double dconv = Double.parseDouble(w.num);
		float fconv = Float.parseFloat(w.num);
		System.out.println("The String is converted into Integer : "+convnum);
		System.out.println("The String is converted into Double : "+dconv);
		System.out.println("The String is converted into Float : "+fconv);
	}

}
