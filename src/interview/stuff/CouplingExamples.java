package interview.stuff;

public class CouplingExamples {

	public static void main(String[] args) {
		
	}
}

class HouseCoupling {
	
	private PersonCoupling person = new PersonCoupling();

	//this is tight coupling
	public PersonCoupling getPerson() {
		return person;
	}

	public void setPerson(PersonCoupling person) {
		this.person = person;
	}
	
	
	
}

class PersonCoupling {
	String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	
}
