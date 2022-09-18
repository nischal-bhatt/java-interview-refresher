package interview.stuff;

import java.util.Arrays;

public class ArraysClasses {

	public static void main(String[] args) {
		int marks2[] = new int[5];
		
		System.out.println(marks2[2]);
		
		for (int mark : marks2)
		{
			System.out.println(mark);
		}
		
		System.out.println(marks2);
		System.out.println(marks2.toString());
		System.out.println(Arrays.toString(marks2));
		
		int[][]marks3 = {{1,2,3,},{4,5,6}};
		System.out.println(Arrays.toString(marks3));
		System.out.println(Arrays.deepToString(marks3));
		
		System.out.println(marks2.equals(marks3));
		
		int marks4[] = new int[5];
		marks4[0] =8;
		marks2[0] = 8;
		
		System.out.println(Arrays.equals(marks2, marks4));
	}
}
