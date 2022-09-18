package interview.stuff;

public class FunctionalProgrammingLambdaExpressions {

	public static void main(String[] args) {
		
		FunctionalInterfaceExample a
		=  (x,u) ->  x  + u;
		
		System.out.println(a.add(87,3));
	}
}

@FunctionalInterface
interface FunctionalInterfaceExample
{
	int add(int x,int y);
}
