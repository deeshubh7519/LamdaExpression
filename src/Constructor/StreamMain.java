package Constructor;

import java.util.List;

public class StreamMain {

	public static void main(String[] args) {

		List<Integer> integers = List.of(14, 15, 15, 16, 1, 81, 81, 5, 5, 45);

		System.out.println(integers);

		// This Is 1st way
		/*
		 * integers.stream().forEach(e -> {
		 * 
		 * System.out.println(e); });
		 */

		// This Is 2nd Way
		integers.stream().forEach(System.out::println);
	}
}
