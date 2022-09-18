package interview.stuff;

import java.util.Arrays;
import java.util.List;

public class FunctionalProgramming {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1,3,4,6,2,7);
		
		int sum = 0;
		
		for (int number: numbers )
		{
			if (number % 2 != 0)
			{
				sum = sum + number;
				//sum has a state!
			}
		}
		
		System.out.println(sum);
		functionalProgrammingExample(numbers);
	}
   //the whole below code is done without having any state
	//avoids mutable data
	private static void functionalProgrammingExample(List<Integer> numbers) {
		int sum = numbers.stream()
				.filter(number -> (number %2 != 0)) //intermediate
				.reduce(0, Integer::sum); //terminal
		//sum has no state!
		
		System.out.println(sum);
		anotherExample();
		
	}
	private static void anotherExample() {
		Arrays.stream(new String[] {
				"Ram","Robert","Rahim"
		}).filter(s -> s.startsWith("Ro"))
		.map(String::toLowerCase)//intermediate operations return back a stream
		//.map(r -> r.charAt(2))
		.sorted()
		//.forEach(System.out::println);
		.forEach(ord -> System.out.println(ord));
		
		
	}
}
