package interview.stuff;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatchFinally {

	public static void main(String[] args) {

		Scanner temp = new Scanner(System.in);
		System.out.println("please enter in a number");
		try {
			int x = temp.nextInt();
			System.out.println("the number you entered is " + x);
		} catch (InputMismatchException e) {
			System.out.println("please enter a correct number!");
		}
		try {
			anotherExample();
			System.out.println("things are working normally?");
		} catch (NullPointerException e) {
			System.out.println("caught!");
		} finally {
			System.out.println("do stuff like close connection");
		}

	}

	private static void anotherExample() {
		try {
			method2();
		} catch (NullPointerException e) {
			System.out.println("thrwoing");
			throw e;
		}
	}

	private static void method2() {
		method3();

	}

	private static void method3() {
		String str = null;
		str.toString();

	}
}
