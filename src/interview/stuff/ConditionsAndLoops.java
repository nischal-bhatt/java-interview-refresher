package interview.stuff;

public class ConditionsAndLoops {

	public static void main(String[] args) {
		
		int num = 5;
		
		if (num < 0)
		{
			num = num + 10;
			num++;
		}//always use braces
		
		System.out.println(num);
		switchstuff();
	}

	private static void switchstuff() {
		int number  =2 ;
		System.out.println("printing....");
		switch(number)
		{
		case 1:
			System.out.println(1);
			break;
		case 2:
			System.out.println(2);
			break;
		case 3: 
			System.out.println(3);
			break;
		default:
				System.out.println("none");
		}
		
		loopsExample();
		
	}

	private static void loopsExample() {
		
		int[] numbers = {1,2,3,4,5};
		
		for (int number : numbers ) //enhanced for loop
		{
			System.out.println(number);
		}
		
		for (int i =0; i< numbers.length; i ++)
		{
			System.out.println(numbers[i]);
		}
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		
		
		outer: //putting labels on loops
		for (int j = 0; j < 2 ; j++)
		{
			inner:
			for (int k = 0; k <10; k++)
			{
				System.out.println(j + " " + k);
				if (k==5)
				{
					break outer;
				}
			}
		}
	}
}
