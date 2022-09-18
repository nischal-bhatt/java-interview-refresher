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
