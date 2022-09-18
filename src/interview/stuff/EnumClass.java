package interview.stuff;

public class EnumClass {

	public static void main(String[] args) {
		System.out.println(Season.valueOf(2));
		
		Season r= Season.FALL;
		System.out.println(r.getCode());
	}
}

enum Season {
	WINTER(1), SPRING(2), SUMMER(3), FALL(800);
	
	private int code;
	
	Season (int code)
	{
		this.code = code;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}
	
	public static Season valueOf(int code)
	{
		for (Season s : Season.values())
		{
			if (s.getCode() == code)
			{
				return s;
			}
		}
		
		throw new RuntimeException("value not found!");
	}
	
	
	
}
