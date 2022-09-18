package interview.stuff;

class A1 implements Runnable {

	@Override
	public void run() {
		System.out.println("printing A");
		
	}
	
}

class B1 implements Runnable {

	@Override
	public void run() {
		System.out.println("printing B");
		
	}
	
}

public class MultithreadingClasses {

	public static void main(String[] args) {
		
		Thread t1 = new Thread(new A1());
		Thread t2 = new Thread(new B1());
		
		t1.start();
		t2.start();
		
	
		
	}
}
