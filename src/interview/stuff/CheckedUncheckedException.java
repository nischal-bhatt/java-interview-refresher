package interview.stuff;

public class CheckedUncheckedException {

	public static void main(String[] args) throws Exception {
		String x = null;
		//x.toString(); // unchecked exception

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// extends Exception --> it will be a checked exception
			// TODO Auto-generated catch block
			System.out.println("this is a checked exception");
		}

		//try {
			AnotherMethod();
		//} catch (Exception e) {
		//	System.out.println(e.getMessage());
		 //if you dont handle it, main must throw

		anotherMethod3(); //no need to worry since the exception is unchecked
	}

	private static void anotherMethod3() {

		System.out.println("throwing");
		throw new NullPointerException();

	}

	private static void AnotherMethod() throws Exception {

		throw new Exception("hey");

	}
}
