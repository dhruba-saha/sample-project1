package ForLoopExcerciseSolution;

public class FactorialNumber {

	public static void main(String[] args) {
		int i, fact=1;
		int finalNumber=5;
		for(i=1;i<=finalNumber;i++) {
			fact=fact*i;
		}
		System.out.println("Factorial Number of 5= "+fact);

	}

}
