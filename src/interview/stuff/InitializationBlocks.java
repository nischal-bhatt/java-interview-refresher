package interview.stuff;

public class InitializationBlocks {

	int i = 10;
	{
		System.out.println("instance initializer");
		i++;
		System.out.println(i);
	}
	static int count = 10;
	//called when class is loaded
	static {
		System.out.println("static block");
		System.out.println(count);
	}
	
	public static void main(String[] args) {
		InitializationBlocks a = new InitializationBlocks();
		InitializationBlocks b = new InitializationBlocks();
		InitializationBlocks c = new InitializationBlocks();
	}
}
