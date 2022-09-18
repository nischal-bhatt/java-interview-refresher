package interview.stuff;

import java.util.ArrayList;
import java.util.List;

public class Polymorphism {

	public static void main(String[] args) {
		
		Animal a = new Dog();
		Animal b = new Cat();
		Animal c = new Cat();
		
		List<Animal> list = new ArrayList<Animal>();
		
		
		list.add(a);
		list.add(b);
		list.add(c);
		
		printList(list);
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		anotherExample();
		
	}

	private static void anotherExample() {
		AnimalTwo ss = new DogTwo();
		AnimalTwo rr = new CatTwo();
		
		List<AnimalTwo> aaa = new ArrayList<>();
		
		aaa.add(ss);
		aaa.add(rr);
		
		printListTwo(aaa);
		
	}

	private static void printListTwo(List<AnimalTwo> aaa) {
		// run time polymorphism
		for (int i =0; i<aaa.size(); i++)
		{
			aaa.get(i).shout();
		}
		
	}

	private static void printList(List<Animal> list) {
		
		
		for (int i =0; i<list.size() ; i ++)
		{
			if (list.get(i) instanceof Dog)
			{
				((Dog)list.get(i)).bark();
			}
			
			if (list.get(i) instanceof Cat)
			{
				((Cat)list.get(i)).meow();
			}
		}
		
	}
}

class AnimalTwo {
	public void shout()
	{
		System.out.println("dont know");
	}
}

class DogTwo extends AnimalTwo {
	public void shout()
	{
		System.out.println(" bow wow");
	}
}

class CatTwo extends AnimalTwo {
	public void shout()
	{
		System.out.println(" meeeeeeeeeeeeeeeeeo2");
	}
}

abstract class Animal {
	public void eat() 
	{
		System.out.println("im eating");
	}
}

class Dog extends Animal {
	public void bark()
	{
		System.out.println("dog is barking");
	}
}

class Cat extends Animal {
	public void meow () 
	{
		System.out.println("cat is meowing");
	}
}
