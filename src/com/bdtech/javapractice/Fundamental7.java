package com.bdtech.javapractice;

public class Fundamental7 {
	
	static int a=10;
	static int b=20;
	static int m=2;
	static int n=4;

	public static void main(String[] args) {
		
	   int x=2;
	   int y=4;
	   int z=y/x;
	   System.out.println("Value of z ="+z);
	   
		sum();
		sub();
		Multiplication();
		

	}
	public static void sum() {
		int c=a+b;
		System.out.println("value of c="+c);
	}
	public static void sub() {
		int x=b-a;
		System.out.println("value of x=" +x);
	}
	public static void Multiplication() {
		int j= m*n;
		System.out.println("value of J=" +j);
	}

}
