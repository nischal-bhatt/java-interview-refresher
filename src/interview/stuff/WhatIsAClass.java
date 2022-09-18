package interview.stuff;

public class WhatIsAClass {
	public static void main(String[] args) {

		CricketScorer a = new CricketScorer();
		//object is an instance of a class
		a.four();
		a.four();
		a.six();
		a.printScore();
		
		CricketScorer b = new CricketScorer();
		b.four();
		b.four();
		b.six();
		b.six();
		b.six();
		b.printScore(); //state is 26
		
		b.four();
		b.six();
		b.printScore(); //state is 36 
		//behaviour --> methods
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(a.hashCode());
		// in your defined class, hashCode is not there - coz it comes from superclas Object class-inheritance
	    System.out.println(new classExample());
	    //not implementing the toString -- it uses default which is defined in object class
	}
}

class classExample 
{
	private int a;

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	@Override
	public String toString() {
		return "classExample [a=" + a + "]";
	}//this will create multiple strings - performance overhead
	
	
	/*
	public String toString()
	{
		return "nish";
	}
	*/
}

class CricketScorer{ //class is a template from which many objects can be created
	private int score; //class defines state and behaviour!
	                   //state of object is the values its variables have at that point in time
	public void four()
	{
		this.score = this.score + 4;
	}
	
	public void six()
	{
		this.score = this.score + 6;
	}
	
	public void printScore()
	{
		System.out.println("score is " + this.score);
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}
	
	//toString is a method in the superclass of every object - The object class
	public String toString()
	{
		return "printing stuff about " + this.getScore();
	}
	
	
}
