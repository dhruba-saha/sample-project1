package ForLoopExcerciseSolution;

public class NonStaticmethod {

	public static void main(String[] args) {
	NonStaticMethodExample object=new NonStaticMethodExample();
	object.sum();
	object.sub();
	}
	public static viod sum() {
		int a=20;
		int b=10;
		int c=a+b;
		System.out.println(c);
	}
	public static void sub() {
		int a=20;
		int b=10;
		int c=a-b;
		System.out.println(c);
	}
	

}
