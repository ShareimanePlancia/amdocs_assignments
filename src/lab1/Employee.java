package lab1;

public class Employee implements Comparable <Employee>{
	private String name;
	private int years;

	public Employee(String name, int years ){
	
	this.name = name;
	this.years = years;
	
	}

	public String getName() {
		return name;
	}

	public int getYears() {
		return years;
	}
	
	@Override
	public String toString() {
		return "Employee Name = " + name + ", Years of Experience= " + years + " ]";
	}
	
	@Override
	public int compareTo(Employee e) {
		if(this.years != e.getYears()) {
			return this.years - e.getYears();
		}
		return this.name.compareTo(e.getName());
	}
	
	
}