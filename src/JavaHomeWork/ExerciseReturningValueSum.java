package JavaHomeWork;

public class ExerciseReturningValueSum {
	public static void main(String[] args) {
		ExerciseReturningValueSum object=new  ExerciseReturningValueSum();
		int result=object.sum();
		/*System.out.println(result);
		or,*/
		System.out.println(object.sum());

	}
	public int sum() {
		int a=10;
		int b=20;
		int c=a+b;
		return c;
	}

}
