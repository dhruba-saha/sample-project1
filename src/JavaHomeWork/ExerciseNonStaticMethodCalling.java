package JavaHomeWork;

public class ExerciseNonStaticMethodCalling {

	public static void main(String[] args) {
		ExerciseNonStaticMethodCalling object=new ExerciseNonStaticMethodCalling();
		object.takeAndPrintInfo("Dhruba Saha", 25,"Executive Officer" );
	}
		
	public void takeAndPrintInfo(String name, int age, String jobtitle) {

		System.out.println(name);
		System.out.println(age);
		System.out.println(jobtitle);
		
	}

}
