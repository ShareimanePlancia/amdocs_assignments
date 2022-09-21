package activity;

public class EmployeeFactory {
	
	public EmployeeInter getEmployeeInterface(String employeeType, double basicPay) {
		if(employeeType == null) {
			return null;
		}
		if(employeeType.equalsIgnoreCase("Permanent Employee")) {
			return new PermanetEmployee(basicPay) ;
		}
		else if(employeeType.equalsIgnoreCase("Contractual Employee")) {
			return new ContractualEmployee(basicPay);
	}
		return null;

	}
}