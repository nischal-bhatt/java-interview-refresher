package interview.stuff;

public class WhatIsInnerClass {

	public static void main(String[] args) {
		OuterClass a = new OuterClass();
		a.exampleMethod1();
		
		OuterClass.StaticInnerClass.doSomeStuff();
		
		OuterClass.InnerClass b = a.new InnerClass();
		b.setInnerclassvariable(23);
		System.out.println(b.getInnerclassvariable());
		
		OuterClass.StaticInnerClass rr = new OuterClass.StaticInnerClass();
	    rr.doSomeStuff();
	}
}

class OuterClass {

	private int outerClassInstanceVariable=29;

	public class InnerClass {

		private int innerclassvariable;

		public int getInnerclassvariable() {
			return innerclassvariable+outerClassInstanceVariable;
		}

		public void setInnerclassvariable(int innerclassvariable) {
			this.innerclassvariable = innerclassvariable;
		}
		
		
	}
	
	public void printinginnerclassstuff()
	{
		//System.out.println(innerclassvariable);
	}

	public static class StaticInnerClass {

		public static void doSomeStuff()
		{
			System.out.println("uo");
			
		}
	}

	public void exampleMethod1() {
		int localVariable;
		final int finalVariable = 5;

		class MethodLocalInnerClass {
			public void method() {
				System.out.println(outerClassInstanceVariable);
				System.out.println(finalVariable);
			}
		}

		MethodLocalInnerClass m1 = new MethodLocalInnerClass();
		m1.method();
	}

	public class InnerClass2 {

	}

	public static class StaticNestedClass {

	}

	public void exampleMethod() {
		class MethodLocalInnerClass {

		}
	}
}
