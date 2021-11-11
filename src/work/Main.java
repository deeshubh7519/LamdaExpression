package work;

public class Main {

	public static void main(String[] args) {

		System.out.println("System Starts.....!!");

		// We Can Use Parent Class Also
		// This Is 1 st Way
		/*
		 * MyInteface myinter = new MyInterfaceImpl(); myinter.sayHello();
		 */

		// This Is 2nd Way
		// Create anonymous class here(The Class Without Having Name)
		/*
		 * MyInteface m1 = new MyInteface() {
		 * 
		 * @Override public void sayHello() {
		 * System.out.println("This Is First anonymous Class.....");
		 * System.out.println();
		 * System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		 * System.out.println(); } }; m1.sayHello();
		 * 
		 * MyInteface m2 = new MyInteface() {
		 * 
		 * @Override public void sayHello() {
		 * System.out.println("This Is Second anonymous Class....."); } };
		 * m2.sayHello();
		 */

		// This Is 3rd Way
		// Create Lamda Expression
		MyInteface m1 = () -> System.out.println("This IS First Time i am using lamda Expression");

		m1.sayHello();

		MyInteface m2 = () -> System.out.println("This IS Second Time i am using lamda Expression");

		m2.sayHello();

		System.out.println();
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++");
		System.out.println();

		// Passing Parameter We Use Lamda Expression
		// Use Like This And....1)
		/*
		 * SumInterface sum1 = (int a, int b) -> { return a + b; };
		 */

		// Use like This......2)
		/*
		 * SumInterface sum = new SumInterface() {
		 * 
		 * @Override public int sum(int a, int b) {
		 * 
		 * return (a + b); } }; System.out.println(sum.sum(2, 10));
		 */

		SumInterface sum1 = (a, b) -> a + b;

		System.out.println(sum1.sum(2, 10));

		// System.out.println(sum1.sum(6, 6));

		System.out.println();
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++");
		System.out.println();

		LengthInterface li = str -> str.length();

		System.out.println("Length Of The String Is... " + li.getLength("Deepak Patil"));

		System.out.println();
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++");
		System.out.println();

		// Anonymous Class which has no name
		MathInterface mi1 = new MathInterface() {

			@Override
			public int getSqure(int a) {

				return (a * a);
			}
		};

		System.out.println("Squre Of The Value Is......: " + mi1.getSqure(10));

		System.out.println();
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++");
		System.out.println();

		MathInterface mi2 = (a) -> (a * a);

		System.out.println("Squre Of The Value Is......: " + mi2.getSqure(3));
	}

}
