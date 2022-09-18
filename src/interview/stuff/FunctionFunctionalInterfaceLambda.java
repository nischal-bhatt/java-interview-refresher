package interview.stuff;

import java.util.function.Consumer;
import java.util.function.Function;

public class FunctionFunctionalInterfaceLambda {

	public static void main(String[] args) {
		Function<Integer,String> a = (x) -> "hello".substring(x);
		
		System.out.println(a.apply(2));
		
		
		Consumer<String> com = (rrr) -> System.out.println(rrr + " is a bad movei"); 
	
		
		com.accept("titanic");
		com.accept("scorpion king");
	
	}
}
