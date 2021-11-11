package work;

public class ThreadDemo {

	public static void main(String[] args) {

		// First Thread Thread - Deepak

		Runnable thread1 = () -> {
			// This Is Body Of The Thread
			// Stuff
			for (int i = 1; i < 10; i++) {

				System.out.println("Value Of I is... " + i);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		};

		Thread t1 = new Thread(thread1);
		t1.setName("Deepak");
		t1.start();

		Runnable thread2 = () -> {

			try {

				for (int i = 1; i <= 10; i++) {
					System.out.println(i * 2);
					Thread.sleep(2000);
				}
			} catch (InterruptedException e2) {
				// TODO: handle exception
			}
		};

		Thread t2 = new Thread(thread2);
		t2.start();
	}

}
