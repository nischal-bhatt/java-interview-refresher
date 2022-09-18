package interview.stuff;

import java.util.ArrayList;
import java.util.List;

public class InheritanceWhatItIS {

	public static void main(String[] args) {
		Actor a = new Hero();
		((Hero)a).fight();
		a.act();	
		
		Actor b = new Comedian();
		((Comedian)b).performComedy();
		b.act();
		//there is a common ground between the classes
		
		List<Actor> list =new ArrayList<>();
		list.add(a);
		list.add(b);
		Actor a1 = new Hero();
		list.add(a1);
		System.out.println();
		System.out.println();
		System.out.println();
		printoutspecificstuff(list);
	}

	private static void printoutspecificstuff(List<Actor> list) {
		
		for (int i =0; i<list.size(); i++)
		{
			if (list.get(i) instanceof Hero)
			{
				((Hero)list.get(i)).fight();
				list.get(i).act();
				
			}
			
			if (list.get(i) instanceof Comedian)
			{
				((Comedian)list.get(i)).performComedy();
				list.get(i).act();
			}
		}
		
	}
	
}

class Actor {
	public void act()
	{
		System.out.println("act");
	}
}

class Hero extends Actor {
	public void fight() {
		System.out.println("fight");
	}
}

class Comedian extends Actor {
	public void performComedy()
	{
		System.out.println("comedian!");
	}
}
