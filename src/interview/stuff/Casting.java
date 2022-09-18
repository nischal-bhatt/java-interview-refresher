package interview.stuff;

public class Casting {

	public static void main(String[] args) {
		int value = 100;
		float f = value;// implicit casting
		System.out.println(f);
		explicitcasting();
	}

	private static void explicitcasting() {
		float number1 = 25678.256f;
		int num2 = (int)number1;
		System.out.println(num2);
		
	}
}
