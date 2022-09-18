package interview.stuff;

public class FinalKeyWord {

	public static void main(String[] args) {
		MonkeyFour f = new MonkeyFour(88);
		
		FinalMethodOver a = new FinalMethodOver();
		a.printy();
		a.printshit();
	}
}

final class MonkeyTwo { //cannot create subclasses
	
	
}

class MonkeyFour {
	private final int age;

	public MonkeyFour(int age) {
		super();
		this.age = age;
	}

	public int getAge() {
		return age;
	}
	
	//public void setAge(int age)
	//{
	//	this.age = age;
	//}
	
}

//class MonkeyThree extends MonkeyTwo {
	
//}

class FinalMethod{
	
	protected int aloha = 23;
	
	final void printshit()
	{
		System.out.println("this method cannot be overridden");
	}
}

class FinalMethodOver extends FinalMethod {
	
	void printy()
	{
		System.out.println(aloha);
	}
	
	//void printshit()
	//{
		
	//}
}
