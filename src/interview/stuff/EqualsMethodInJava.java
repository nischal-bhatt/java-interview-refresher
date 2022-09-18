package interview.stuff;

public class EqualsMethodInJava {

	public static void main(String[] args) {
		Client a = new Client();
		Client b = new Client();
		a.setId(2);
		b.setId(2);
		
		Client c = new Client();
		c.setId(3);
		System.out.println(a == b); //not looking at the contents of the object
		System.out.println(a.equals(b));
		//if you dont override the .equals, then
		// default implementation of .equals is just to see if references of the objects are the same 
		
		System.out.println(a.hashCode());
		System.out.println(b.hashCode());
		System.out.println(c.hashCode());
	}
}

class Client {
	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	
	@Override
	public boolean equals(Object a)
	{
		if (this.id == ((Client)a).getId())
		{
			return true;
		}
		return false;
	}
	
	
	public int hashCode()
	{
		//hashCode distributes objects into groups
		final int prime = 31;
		int result = 1;
		result = prime * result * id;
		return result;
	}
	
	
}
