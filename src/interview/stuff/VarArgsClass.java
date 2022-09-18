package interview.stuff;

public class VarArgsClass {

	public static void main(String[] args) {
		
		System.out.println(sum(2,7,8,9,1));
	}
	
	private static int sum(int... numbers)
	{
		int sum = 0;
		
		for (int i =0; i<numbers.length; i++)
		{
			sum = sum + numbers[i];
		}
		
		return sum;
	}
}
