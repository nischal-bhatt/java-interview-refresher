package interview.stuff;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MultithreadingClasses6 {

	static int i = 0;
	static Lock lock = new ReentrantLock();
	
	public static void main(String[] args) {
		
		
		Thread t1 = new Thread(new Runnable() {

			@Override
			public void run() {
				for (int k =0; k<10000; k++)
				{
					incrementNumber();
				}
				
			}
			
		});
		
		
		Thread t2 = new Thread(new Runnable() {

			@Override
			public void run() {
				for (int k =0; k<10000; k++)
				{
					incrementNumber();
				}
				
			}
			
		});
	
		t1.start();
		t2.start();
		
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(i);
		
	}
	
	private static /*synchronized*/ void incrementNumber()
	{
		
	
		//synchronized(lock)
		//{
		i++;
		//}
		
	
	}
}
