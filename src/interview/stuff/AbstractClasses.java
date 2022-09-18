package interview.stuff;

public class AbstractClasses {

	public static void main(String[] args) {
		
		A a = new A();
		a.abstractMethod();
		a.helloWorld();
		
		B b = new B();
		b.abstractMethod();
		b.helloWorld();
	}
}

class B extends helloExample {

	@Override
	public void abstractMethod() {
		System.out.println("B implementing abstract method");
		
	}
	
}

//encapsulates common functionality
class A extends helloExample {

	@Override
	public void abstractMethod() {
		System.out.println("A implementing abstract method");
		
	}
	
}

abstract class helloExample {
	public void helloWorld() {
		System.out.println("saying hello world");
		this.sayShit();
	}
	
	//interfaces cannot have prive mathods
	private void sayShit()
	{
		System.out.println("saying shit");
	}
	
	public abstract void abstractMethod ();
}