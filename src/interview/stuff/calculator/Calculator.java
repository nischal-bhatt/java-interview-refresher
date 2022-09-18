package interview.stuff.calculator;

public class Calculator {

	public static void main(String[] args) {
		Calc calc = new Calc();
		calc.start();
		synchronized(calc) {
			try {
				calc.wait();
				//main method waits for other thread to complete
			}catch (InterruptedException e)
			{
				e.printStackTrace();
			}
		}
		System.out.println(calc.sum);
	}
	
}

class Calc extends Thread {
	long sum;
	
	public void run()
	{
		synchronized(this) {
			for (int i =0; i<1000000; i++)
			{
				sum += i;
			}
			notify();
		}
	}
}


/*
 * java new features
 * java 5
 * 1. generics
 * 2. enhanced for
 * 3. autoboxing
 * 4. varargs
 * 5. static import
 * 6. concurrent collections
 * 7. locks 
 * 
 * java 7
 * 1. diamond operator
 * 2. try with resources 
 * 3. multiple catches
 * 4.
 * 5.
 * 6.
 * 7.
 * 
 * 
 * java 8 
 * 1.lambda
 * 2.streams
 * 3.
 * 4.
 * 5.
 * 6.
 * 7.
 */
