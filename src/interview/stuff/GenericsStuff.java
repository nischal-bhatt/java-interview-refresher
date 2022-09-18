package interview.stuff;

public class GenericsStuff {

	public static void main(String[] args) {
		
	//	MyGenericsClass<Integer> nn = new MyGenericsClass<>();
		MyGenericsClass<String> st = new MyGenericsClass<>();
		st.setVal("hi");
		System.out.println(st.getVal());
		
		NonGenericClass ng = new NonGenericClass();
		ng.setObj(2);
		
		System.out.println((Integer)ng.getObj());
		//System.out.println((String)ng.getObj());
		//this is why generics is needed
		
		System.out.println(doSomething(2.3));
		System.out.println(doSomething(2));
		
	}
	
	private static <X extends Number > X doSomething(X number)
	{
		return number;
	}
}

class MyGenericsClass<T extends String>
{
	private T val;

	public T getVal() {
		return val;
	}

	public void setVal(T val) {
		this.val = val;
	}
	
	
}

class NonGenericClass {
	private Object obj;

	public Object getObj() {
		return obj;
	}

	public void setObj(Object obj) {
		this.obj = obj;
	}
	
	
}
