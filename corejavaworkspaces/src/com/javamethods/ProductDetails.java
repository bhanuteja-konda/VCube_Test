package com.javamethods;

public class ProductDetails {
	int productId;
	String productName;
	double price;
	ProductDetails(){
		
	}
	ProductDetails(int id,String name,double cost){
		productId=id;
		productName=name;
		price=cost;
	}
	void show() {
		System.out.println("Product ID : "+productId);
		System.out.println("Product Name : "+productName);
		System.out.println("Price : "+price);
	}
	void main(String[] args) {
		ProductDetails p1= new ProductDetails(123,"Bhanu",1235.45);
		p1.show();
	}

}
