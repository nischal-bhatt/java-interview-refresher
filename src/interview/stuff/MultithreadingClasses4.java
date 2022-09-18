package interview.stuff;

public class MultithreadingClasses4 {

	//new - start method not called yet
	//runnable - eligible to run but not run yet
	//running
	//blocked - sleep method
	//terminated
	
	static int i = 0;

	//thread safe
	//internally, this uses synchronized
	//static AtomicInteger i = new AtomicInteger(0);
	
	public static void main(String[] args) {

		
		Thread t1 = new Thread() {
			public void run() {

				for (int k = 0; k < 10000; k++) {
					i++;
				}

			}
		};

		Thread t2 = new Thread() {
			public void run() {

				for (int k = 0; k < 10000; k++) {
					i++;
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
