package ForLoopExcerciseSolution;

public class FindOutParticularNumber {

	public static void main(String[] args) {
		int a = 3;
		int c=5;
		int d=2;
		for (int b = 1; b <= 100; b++) {
			if (b % a == 0) {
				System.out.println(b);
			}
		}
		System.out.println("***************************");
		
		for (int b = 1; b <= 100; b++) {
			if (b % c == 0) {
				System.out.println(b);
			}

		}
		System.out.println("***************************");
		for(int b=1; b<=100; b++) {
			if(b%a==0 && b%c==0) {
				System.out.println(b);
				
			}
			
		}
		System.out.println("***************************");
		for(int b=1; b<=100; b++) {
			if(b%a==0 & b%c==0 & b%d==0) {
				System.out.println(b);
				
			}
			
		}


	}

}
