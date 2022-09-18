package interview.stuff;

import java.util.ArrayList;
import java.util.List;

public class Interfaces {

	public static void main(String[] args) {
		Crow crow = new Crow();
		Parrot parrot = new Parrot();
		crow.fly();
		crow.eat();
		crow.makenoise();
		parrot.fly();
		//parrot.eat();
		
		List<Flyable> list = new ArrayList<Flyable>();
		list.add(crow);
		list.add(parrot);
	}
}

class Crow implements Flyable,Eatable {
	// something like an answer to multiple inheritance

	@Override
	public void fly() {
		System.out.println("crow is flying");
		System.out.println(someNumber);
		
	}

	@Override
	public void eat() {
		System.out.println("crow is eating");
		
	}

	@Override
	public void makenoise() {
		System.out.println("crow making noise");
		
	}
	
}


class Parrot implements Flyable {

	@Override
	public void fly() {
		System.out.println("parrot is flying");
		
	}

	@Override
	public void makenoise() {
		// TODO Auto-generated method stub
		
	}
	
}

interface Flyable extends MakeNoiseable{
	public static final float someNumber  = 10;
	public void fly();
}

interface Eatable {
	public void eat();
}

interface MakeNoiseable {
	public void makenoise();
}
