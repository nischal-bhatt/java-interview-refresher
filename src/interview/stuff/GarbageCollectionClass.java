package interview.stuff;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class GarbageCollectionClass {

	public static void main(String[] args) {
		method();
		//after the below method finishes,
		//reference variable calendar is no longer valid
		//hence, there are now no longer any references to the new object created on the heap 
		//jvm recognizes this and removes the object from heap - this is garbage collection! 
		
		//when is garbage collection run ?
		//whenever jvm wants
		//when it thinks it needs more memory
		
	}

	private static void method() {
		Calendar calender = new GregorianCalendar(2000,10,30);
		System.out.println(calender);
		
	}
}
