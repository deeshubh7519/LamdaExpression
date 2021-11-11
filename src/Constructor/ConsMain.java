package Constructor;

public class ConsMain {

	public static void main(String[] args) {

		System.out.println("Studing Constructor Reference");

		/*
		 * Provider provider = () -> { return new Student(); };
		 */

		// Constructor Reference
		// ClassName :: new
		Provider provider = Student::new;
		Student student = provider.getStudent();
		student.display();

	}

}
