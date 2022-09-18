package interview.stuff;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class CollectionsClasses {

	public static void main(String[] args) {
		//collections needed coz array are not dynamic
		//Collection is the base interface
		//Set interface extends Collection
		//List interface also extends Collection
		List<Integer> a = new ArrayList<>();
		a.add(2);
		//Queue extends Collection
		Collection<Integer> a1 = new ArrayList<>();
		//Map does not extend Collection
		Map<String,Integer> a2 = new HashMap<> ();
		doSomethingFurther();
	}

	private static void doSomethingFurther() {
		List<Integer> a = new ArrayList<>();//arraylist implements list interface
		//arraylist is not threadsafe
		//list contains all the methods of the collection interfaces
		System.out.println(a.contains(3));
		
		doanddofurther();
		
		
	}

	private static void doanddofurther() {
		//System.out.println("hi");
		Set<Integer> a = new HashSet<>(); //implements Set
		//does not allow duplication
		a.add(2);
		a.add(2);
		a.add(3);
		
		System.out.println(a);
		doMore();
	}

	private static void doMore() {
		Map<String,Integer> a = new HashMap<>();
		a.put("A", 5);
		a.put("B", 23);
		
		System.out.println(a.get("B"));
	}
}
