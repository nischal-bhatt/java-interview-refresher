package interview.stuff;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class MultithreadingClasses5 {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		
		ExecutorService executorService1 = Executors.newScheduledThreadPool(10);
		
		Future future =  executorService1.submit(new Runnable() {
			
			public void run()
			{
				System.out.println("hi");
			}
		});
		
		System.out.println(future.get());
		
		Future future1 = executorService1.submit(new Callable<Object>() {

			@Override
			public Object call() throws Exception {
				return "heya";
			}
			
		});
		
		String x = (String)future1.get();
	System.out.println(x);
		
	}
}
