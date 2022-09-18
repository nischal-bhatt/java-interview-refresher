package interview.stuff;

import java.util.Comparator;

public class AnonymousInnerClasses {

	public static void main(String[] args) {
		
		Comparator<String> comparator = new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				return o2.compareTo(o1);
			}
			
		};
		
		System.out.println(comparator.compare("hi", "nischal"));
		System.out.println(comparator.compare("nischal", "hi"));
	
	
	    AnimalHell first = new AnimalHell();
	    AnimalHell second = new AnimalHell();
	    first.setAge(23);
	    second.setAge(78);
	    
	  System.out.println(  first.compare(null,second));
	    System.out.println(second.compare(null, first));
	
	    //subclass of AnimalHell!
	    AnimalHell abc = new AnimalHell() {
	    	void bark() {
	    		System.out.println("abc barking");
	    	}
	    };
	    
	    abc.bark();
	    
	}
}

class AnimalHell implements Comparator<AnimalHell>{
	
	private int age;
	
	
	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	void bark()
	{
		System.out.println("hi");
	}

	@Override
	public int compare(AnimalHell o1, AnimalHell o2) {
		if (this.getAge() > o2.getAge())
		{
			return 1;
		}else {
			return 0;
		}
	}
}
