package interview.stuff;

public class MethodOverloadingAndOverriding {

	public static void main(String[] args) {
		
		printer a = new printer();
		a.printerabc(2);
		a.printerabc("heya");
		
		printer r = new printer();
		r.overriddenmethod();
		
		r = new printz();
		r.overriddenmethod();
	}
}

class printer 
{
	public void printerabc(Integer a)
	{
		System.out.println("printing integer");
	}
	
	public void printerabc(String a)
	{
		System.out.println("printing string");
	}
	
	public void overriddenmethod()
	{
		System.out.println("printing nothing but shit");
	}
}

class printz extends printer  implements abc,cdf  { //cannot extend more than 1 class
	
	public void overriddenmethod()
	{
		System.out.println("yoyo");
	}

	@Override
	public void doSomeShit() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void doSomeShitcdf() {
		// TODO Auto-generated method stub
		
	}
}

interface abc {
	public void doSomeShit();
}

interface cdf {
	public void doSomeShitcdf();
}


