package interview.stuff;

public class ProtectedModifierAccessExample {

	public static void main(String[] args) {
		
		Monkey123 a = new Monkey123();
		a.printage();
		
	}
}

class AnimalThree {
	protected int age=98;
}

class Monkey123 extends AnimalThree {
	
	public void printage ()
	{
		System.out.println(age);
	}
}

// private only in same class
// default same package
// protected same package + subclasses
// public everywhere

class Hehe {
	AnimalThree lol = new AnimalThree();
	
	public void changeAge()
	{
	lol.age = 23; //still can! coz same package!
	}
}
