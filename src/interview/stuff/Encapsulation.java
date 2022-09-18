package interview.stuff;

public class Encapsulation {
	public static void main(String[] args) {

		CricketScoreKeeper a = new CricketScoreKeeper();
		a.setScore(23);
		System.out.println(a.getScore());
		a.score4();
		System.out.println(a.getScore());
	}
}

class CricketScoreKeeper {
	private int score;

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score + 99;
		//this logic is encapsulated
		//logic of how to do the setting is moved to this class
	}
	
	public void score4()
	{
		this.score = score /*+*/ + 4;
	}
	
	
	
}
