package lab.exercises.phonebook;

public class Phonebook {
	String name;
    String numbers;
	
	public Phonebook() {
		
	}
	
	public Phonebook(String name, String numbers) {
		super();
		this.name = name;
		this.numbers = numbers;
	}
	
	public String getName() {
		return name;
	}

	public String getNumbers() {
		return numbers;
	}


	@Override
	public String toString() {
		return "PhoneBook [name=" + name + ", number=" + numbers + "]";
	}

}
