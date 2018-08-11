package JavaHomeWork;

public class ExerciseReturningValueSub {

	public static void main(String[] args) {
		ExerciseReturningValueSub object=new ExerciseReturningValueSub();
		int result=object.sub();
		//System.out.println(result);
		// or,
		 System.out.println(object.sub());
		
		}
		
		
	public int sub() {
		int a=50;
		int b=10;
		int c=a-b;
		return c;
	}

}
