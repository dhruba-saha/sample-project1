package com.bdtech.javapractice;

public class HomeWork1 {

	public static void main(String[] args) {
		for(int a=2;a<=12; a++) {
			System.out.println(a);
		}
		int b=5;
		while(b<=15){
			System.out.println(b);
			b++;
		}
		
		int c=8;
		do {
			System.out.println(c);
			c++;
		}while (c<=22);
		
		int num1=10, num2=20, num3=30;
	int Total=(num1+num2+num3);{ 
			System.out.println("Total is= "+Total);
		}
	
		double i1=0.04, i2=0.02;
		double sum = i1+i2; {
			System.out.println("sum is="+sum);
		}
		int x=100, x1=20;//x= 100 miles driven, x1=20 gallon gas used
		int y=x/x1; //y means MPG, MPG=miles driven(x)/gallons of gas used(x1)
		{
		System.out.println("MPG (y) is="+y);
		}
   }
}

