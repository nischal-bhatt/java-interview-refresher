package interview.stuff;

public class JavaQn6 {

	public static void main(String[] args) {
		//System.out.println(23);
		//wrapper classes - gives a primitive an object appearance
		
		Integer a = 23;
		String  x = a.toString();
	    System.out.println(x);
	    
	    Integer num = new Integer(23);
	    Integer num1 = new Integer ("23");
	    
	    System.out.println(num);
	    System.out.println(num1);
	    
	    Integer hundred = Integer.valueOf("100");
	    //might return a cached value - wont guarantee creating a new object
	    System.out.println(hundred);
	    
        Integer nineC = 9; //this is autoboxing
        System.out.println(nineC);
	    
	    
	}
}
