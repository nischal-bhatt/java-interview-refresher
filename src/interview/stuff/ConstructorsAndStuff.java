package interview.stuff;

public class ConstructorsAndStuff {

	public static void main(String[] args) {
		Person peter = new Person("peter");
		System.out.println(peter.getName());
		System.out.println();
		Person tom = new Person();
		System.out.println(tom.getName());
		System.out.println();
		Person nischal = new Person("nish",35);
		System.out.println(nischal.getName());
		System.out.println(nischal.getAge());
	}
	
	
}

class Person extends Alien{
	
	private String name;
	private int age;
	public Person(String name)
	{
		this(name,88); //calling another constructor from same class
		this.name = name;
		
	}
	
	public Person(String name, int age)
	{
		super(name);
		this.name = name;
		this.age = age;
	}
	
	public Person () {
		System.out.println("default constructor");
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	
	
	
}

class Alien {
	public Alien () {
		System.out.println("alient default consturtor");
	}
	
	public Alien(String abc) {
		System.out.println("yyoyoyoyo");
	}
}
