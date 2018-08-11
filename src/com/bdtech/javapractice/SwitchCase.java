package com.bdtech.javapractice;
import java.util.Scanner;

import org.omg.Messaging.SyncScopeHelper;
public class SwitchCase {
	public static void main(String[] args) {
		
		Scanner cannon=new Scanner(System.in);
		System.out.println("press 4 for addition");
		System.out.println("press 5 for deletion");
		System.out.println("press 6 for multiplication");
		System.out.println("press 7 for division");
		
		System.out.println("\n");

		System.out.println("please enter your choice:");
		int choice=cannon.nextInt();
		System.out.println("please enter first number:");
		int num1=cannon.nextInt();
		System.out.println("please enter second number:");
		int num2=cannon.nextInt();
		
		switch(choice){
		case 4: 
			System.out.println("addition will execute");
			int result=num1+num2;
			System.out.println("addition result:"+ result);
		break;
		case 5:
			System.out.println("deletion will execute");
			int sub=num1-num2;
			System.out.println("deletion result:"+sub);
			
		break;
		case 6:
			System.out.println("multiplication will execute");
			int mult=num1*num2;
			System.out.println("multiplicaiton result:"+mult);
		break;
		case 7:
			System.out.println("division will execute");
			int div=num1/num2;
			System.out.println("division result:"+div);
		default:
			System.out.println("please enter your choice from 4,5,6 and 7");
			break;
		
		}
	}
}
