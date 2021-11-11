package Reference;


public class RefDemo {

	public static void main(String[] args) {

		System.out.println("Learning Method Reference...!!");

		// Method reference is a alternative of Lamda Expression		
		
		// Note:
		// One Imp. Thing is that....method aargument and interface contaning
		// method
		// aargument should be same

		// Provide The Implementation OF WorkInterface
		// Lamda Expression
		WorkInterface workInterface = () -> {
			System.out.println("This IS doTask New Method");
		};
		workInterface.doTask();

		WorkInterface workInterface1 = new WorkInterface() {

			@Override
			public void doTask() {
				System.out.println("This Is anonymous Class Area");
			}
		};
		workInterface1.doTask();

		// 1) This IS static Method Reference
		// className :: methodName
		WorkInterface workInterface2 = Stuff::doStuff;// <======Note:This Method Aargumnt is Same as a....
		workInterface2.doTask();// <======this method

		Runnable runnable = Stuff::threadTask;
		Thread t1 = new Thread(runnable);
		t1.start();

		// 2) This Is Non Static Method Reference
		// first create object of class :: methodName
		Stuff s1 = new Stuff();
		Runnable runnable2 = s1::printNumber;
		Thread t2 = new Thread(runnable2);
		t2.start();

	}

}
