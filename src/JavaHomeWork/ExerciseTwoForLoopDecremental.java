package JavaHomeWork;

public class ExerciseTwoForLoopDecremental {
	public static void main(String[] args) {
		for (int c = 5; c >=0; c--) {
			for (int d = 0; d < c; d++) {
				System.out.print("*");
			}
			System.out.println("*");
		}

	}
}