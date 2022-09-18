package interview.stuff;

public class DefaultAccessClass {

	Modifiers a = new Modifiers ();
	//Modifiers is visible only inside the package
	//default access is package access
	
	private int age;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public void print()
	{
		//can 
		System.out.println(age);
	}
}
