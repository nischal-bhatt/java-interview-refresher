package interview.stuff;

import java.util.concurrent.CopyOnWriteArrayList;

public class ConcurrentCollections {

	public static void main(String[] args) {
		//synchronized collections - implemented using synchronized
		//concurrent collections ? - improves performance. no synchronized keyword
		//synchronized collections - vector as an example
		//concurrent  - locks and copy on write
		
		CopyOnWriteArrayList<Integer> a = new CopyOnWriteArrayList<>();
		//some operations do not need to be synchronized! 
		//so that intrinsic lock on the entire object is not needed
		//coz it uses locks
		a.add(3);
		a.add(3);
		System.out.println(a);
		domoreandmore();
	}

	private static void domoreandmore() {
		
	}
}
