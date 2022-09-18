package interview.stuff;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CustomExceptionsClass {

	public static void main(String[] args) {
		
		//callmethod1(); //dont need try catch
		try {
			callmethod2();
		} catch (OwnException e) {
			// TODO Auto-generated catch block
			System.out.println("handling");
			e.printStackTrace();
		}
		
		anotherAnother();
	}

	private static void anotherAnother() {
		
		try(BufferedReader r = new BufferedReader(new FileReader("xxx")))
		{
			System.out.println("hi");
		}catch (IOException e)
		{
			e.printStackTrace();
			System.out.println("bye");
		}
		
	}

	private static void callmethod2() throws OwnException{
		
		throw new OwnException();
		
	}

	private static void callmethod1() {
		throw new OwnException2();
		
	}
}


class OwnException extends Exception {
	
	
}

class OwnException2 extends RuntimeException {
	
}
