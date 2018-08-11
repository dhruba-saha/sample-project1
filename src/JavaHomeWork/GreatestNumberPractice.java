package JavaHomeWork;

public class GreatestNumberPractice {

	public static void main(String[] args) {
		int a=25;
		int b=20;
		int c=12;
		int d=92;
		int e=100;
		
		if(a<b & a<c & a<d & a<e) {
			System.out.println("Greatest number is "+a);
		}
		else if(b<c & b<d & b<e) {
			System.out.println("Greatest number is "+b);
		}
		else if(c<d & c<e) {
			System.out.println("Greatest number is "+c);
		}
		else if(d<e) {
			System.out.println("Greatest number is "+d);
		}
		else {
			System.out.println("Greatest number is "+e);
		}
		
		}
	
      }

/*
 * int num1=100; int num2=97; int num3=300; if(num1>num2 & num1>num3) {
 * System.out.println("the greatest number is"+" "+num1); } else if(num2>num3) {
 * System.out.println("the greatest number is"+" " +num2); } else{
 * System.out.println("the greatest number is"+" " +num3); }
 */
