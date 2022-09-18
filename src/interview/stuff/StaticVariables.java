package interview.stuff;

public class StaticVariables {
	public static void main(String[] args) {
		AnimalABC.count = 23; 
		
		AnimalABC a = new AnimalABC();
		a.count=999;
		AnimalABC b = new AnimalABC();
		b.age = 99;
		AnimalABC c = new AnimalABC();
		
		System.out.println(a.count);
		System.out.println(a.age);
		System.out.println(b.count);
		System.out.println(b.age);
		System.out.println(c.count);
		System.out.println(c.age);
		
		AnimalABC.printCount();
		
	}

}

class AnimalABC {
	static int count; //there is only 1 variable shared among all.
	int age;
	
	public static void printCount()
	{
		System.out.println(count);
		//System.out.println(age); -- cannot access member level variables
	}
	
}
