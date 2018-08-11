package com.bdtech.javapractice;

public class Fundamental3 {
	
	int a=10;//instance variable
	int b=20;
	int c=a+b;
	int m=12;
	int n=c+m;
	int x=2;
	int z=(c+n)/x;
	int o=z*c/x;
	
	

	public static void main(String[] args) {
		Fundamental3 obj=new Fundamental3();
		System.out.println(obj.c);
		
		System.out.println(obj.n);
		System.out.println(obj.z);
		System.out.println(obj.o);
		

	}

}
