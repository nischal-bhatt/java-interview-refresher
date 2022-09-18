package interview.stuff;

import java.util.concurrent.atomic.AtomicInteger;

public class MultithreadingClasses2 {

	//static int i = 0;

	//thread safe
	//internally, this uses synchronized
	static AtomicInteger i = new AtomicInteger(0);
	
	public static void main(String[] args) {

		i.set(0);
		Thread t1 = new Thread() {
			public void run() {

				for (int k = 0; k < 10000; k++) {
					i.addAndGet(1);
				}

			}
		};

		Thread t2 = new Thread() {
			public void run() {

				for (int k = 0; k < 10000; k++) {
					i.addAndGet(1);
				}

			}
		};
		t1.start();
		t2.start();

		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("printing final value of i");
		System.out.println(i);

	}
}
