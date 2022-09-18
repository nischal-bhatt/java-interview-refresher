package interview.stuff;

public class AssertionsExample {

	public static void main(String[] args) {
		System.out.println(computeSimpleInterest(23,25));
	}

	private static int computeSimpleInterest(int a, int b) {
		assert(a > 100);
		return 200;

	}

}
