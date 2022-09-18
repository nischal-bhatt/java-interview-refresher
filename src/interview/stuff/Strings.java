package interview.stuff;

public class Strings {
	public static void main(String[] args) {

		//string is immutable
		String str3 = "value1";
		str3.concat("value2");
		System.out.println(str3);
		
		String concat = str3.concat("value2");
		System.out.println(concat);
		stringsinmemory();
	}

	private static void stringsinmemory() {
		//System.out.println("hi");
		String str1 = "value";
		
		//this value is stored in string constant pool
		//this is inside the heap memory 
		//
		String str2 = "value";
		
		//both will point to the same in the string constant pool
		
		String str3 = new String("value");
		//above will definitely NOT reuse ! 
		
		//in loops, dun do string concatenation
		//coz we are always creating new objects! 
		
		String s3 = "1";
		String s2 = "2";
		
		for (int i =0; i<100000; i++)
		{
			s3 = s3 + s2;
		}
		//this is not good
		
		StringBuffer s33 = new StringBuffer("value");
		//performance!
		
		String ss = "value2";
		
		for (int i =0; i<1000000; i++)
		{
			s33.append(ss);
		}
		
		//System.out.println(s33);
		
		differencebetweenstringandstringbuffer();
	}

	private static void differencebetweenstringandstringbuffer() {
		//string immutable
		//stringbuffer - represent values that can be modified
		
		StringBuffer a = new StringBuffer("a"); //there , itt can be modified
		
		a.append("234");
		
		System.out.println(a);
		
		differencebetweenstringbuilderandstringbuffer();
		
	}

	private static void differencebetweenstringbuilderandstringbuffer() {
		//stringbuilder is not threadsafe
		utilitymethodsinstring();
		
	}

	private static void utilitymethodsinstring() {
		String str = "abcdefghijkl";
		System.out.println(str.toUpperCase());// returns a new string
		System.out.println(str.concat("nish was here"));
		
	}
}
