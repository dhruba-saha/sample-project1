package com.bdtech.javapractice;

public class Fundamental8 {

	public static void main(String[] args) {
	sum();

	Fundamental8 obj= new  Fundamental8();
	 int c =obj.sub();
	
	System.out.println(c);
	
    

	}
	public static void sum() {
		int a=1;
		int b=2;
		int c=a+b;
		System.out.println(c);
	}
	
	public int sub() {
		int a=10;
		int b=20;
		int c=a+b;
		return c;
		
	}

}
