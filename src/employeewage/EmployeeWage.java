package employeewage;

class EmployeeIsPresentAbsent{
	// declar private variable
	private int isPrensent;
	private int wagePerHour = 20;
	private int fullDayHour = 8;
	 
	public void setIsPrensent(int isPrensent) {
		// check random value not less then zero
		if(isPrensent < 0)
			throw new IllegalArgumentException("Random value shoule not negative");
		this.isPrensent = isPrensent;
	}
	
	// check emp is present or absent
	public void employeeIsPresentOrAbsent() {
		//if random value is 1
		if(isPrensent == 1) {
			System.err.println("Employee is present ");	
		}
		//is random value is 0
		else {
			System.out.println("Employee is absent");
		}
	}
	
	// calculate daily employee wage
	public void calculateDailyEmployeeWage() {
		// calculate wage
		int dailyWage = wagePerHour * fullDayHour;
		// print daily wage
		System.err.println("Daily Employee Wage : "+dailyWage);
	}	
}

public class EmployeeWage {
	public static void main(String[] args) {
		// print welcome message
		System.out.println("Welcome to Employee Wage Computation Program");
		// generate random number 0 1
		int empCheck = (int) Math.floor(Math.random()* 10)  % 2;
		// create object of EmployeeIsPresentAbsent 
		EmployeeIsPresentAbsent emp1 = new EmployeeIsPresentAbsent();
		// pass random value
		emp1.setIsPrensent(empCheck);
		//call employeeIsPresentOrAbsent method
		emp1.employeeIsPresentOrAbsent();	
		// call calculateDailyEmpWage
		emp1.calculateDailyEmployeeWage();	
	}
}
