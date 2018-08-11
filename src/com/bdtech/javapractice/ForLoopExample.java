package com.bdtech.javapractice;

public class ForLoopExample {

	public static void main(String[] args) {
	int num=100 ;
		if(num<60) {
			System.out.println("fail");
			}else if(num>=60 && num<70){
				System.out.println("grade d");
			}else if (num>=70 && num<75) {
				System.out.println("grade c");
			}else if (num>=75 && num<80) {
				System.out.println("grade b");
			}else if (num>=80 && num <90 ) {
				System.out.println("grade a");
			}else if(num>=95 && num<100) {
				System.out.println("grade a+");
			}else {
				System.out.println("invalid");
			}
		
		/*
		int num=40;
		switch(num) {
		case 20: System.out.println("20");
		case 30: System.out.println("30");
		case 40: System.out.println("40");
		default: System.out.println("not in 20,30 or 40");
		}
		for(int i=2;i<=12; i++) {
			System.out.println(i);
		}
		int i=5;
		while(i<=15){
			System.out.println(i);
			i++;
		}
		int i=8;
		do {
			System.out.println(i);
			i++;
		}while (i<=22);
		int num1=10, num2=20, num3=30;
	int Total=(num1+num2+num3);{ 
			System.out.println("Total is= "+Total);
		}
		double i=0.04, i2=0.02;
		double sum = i+i2; {
			System.out.println("sum is="+sum);
		}
		int x=100, x1=20;//x= 100 miles driven, x1=20 gallon gas used
		int y=x/x1; //y means MPG, MPG=miles driven(x)/gallons of gas used(x1) {
		System.out.println("MPG (y) is="+y);
		}*/
		int num1=25, num2=78, num3=87;
		if (num1>=num2 || num1>=num3){
			System.out.println("num1 is="+num1);
		}else if (num2>=num3){
			System.out.println("num2 is="+num2);
		}else if (num3>=num1){
			System.out.println("num3");
		}else {
			System.out.println("invalid");
		}
		
	 }

}	
	
	
