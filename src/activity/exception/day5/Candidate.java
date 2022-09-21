package activity.exception.day5;

public class Candidate {
		String name;
		String gender;
		double expSalary;
		
		Candidate(String name,String gender, double expSalary){
			this.name = name;
			this.gender = gender;
			this.expSalary = expSalary;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getGender() {
			return gender;
		}

		public void setGender(String gender) {
			this.gender = gender;
		}

		public double getexpSalary() {
			return expSalary;
		}
		public void setSalary(double salary) {
			this.expSalary = salary;
		}
		
		void Calculate() throws InvalidSalaryException {
			if (expSalary < 10000) {
				throw new InvalidSalaryException("Salary cannot be less than 10000");
			}else {
				Candidate c = new Candidate(name,gender,expSalary);
			}
			
		}

	}

