package JavaHomeWork;

public class ExerciseLowestNumber {

	public static void main(String[] args) {
		int a=25;
		int b=77;
		int c=96;
		int d=125;
		int e=2;
		if(a<b & a<c & a<d & a<e) {
		System.out.println("The Lowest number is"+"="+a);
		}
		if(b<c & b<d & b<e) {
			System.out.println("The Lowest number is"+"="+b);
		}
		if(c<d & c<e) {
			System.out.println("The Lowest number is"+"="+c);
		}
		else if(d<e) {
			System.out.println("The Lowest number is"+"="+e);
		}
		else{
			System.out.println("The Lowest number is"+"="+e);
		}
		
		
		

	}

}
