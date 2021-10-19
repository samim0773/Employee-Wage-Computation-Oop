package employeewage;

public class EmployeeWage {
	//main method
	public static void main(String[] args) {
		//create object
		ComputeWageForEachCompany amazon = new ComputeWageForEachCompany("amazon", 20, 2, 10);
		ComputeWageForEachCompany flipkart = new ComputeWageForEachCompany("flipkart", 50, 10, 20);
		amazon.computeWage();
		System.out.println(amazon);
		flipkart.computeWage();
		System.out.println(flipkart);
	}
}

class ComputeWageForEachCompany {

	// constant
	public static final int IS_FULL_TIME = 1;
	public static final int IS_PART_TIME = 2;

	private final String company;
	private final int empRatePerHr;
	private final int numOfWorkingDays;
	private final int maxHrsPerMonth;
	private int totalEmpWage;

	// Wage Computation method
	ComputeWageForEachCompany(String company, int empRatePerHr, int numOfWorkingDays, int maxHrsPerMonth) {
		this.company = company;
		this.empRatePerHr = empRatePerHr;
		this.numOfWorkingDays = numOfWorkingDays;
		this.maxHrsPerMonth = maxHrsPerMonth;
	}

	public void computeWage() {
		// variables
		int empHours = 0;
		int totalWorkingDay = 0;
		int totalEmpHours = 0;

		while (totalEmpHours <= maxHrsPerMonth && totalWorkingDay < numOfWorkingDays) {
			totalWorkingDay++;
			// Generate random value to check employee do work full time, part time or absent
			int empcheck = (int) Math.floor(Math.random() * 10) % 3;

			// Condition statement switch case
			switch (empcheck) {
				case IS_FULL_TIME:
					empHours = 8;
					break;
				case IS_PART_TIME:
					empHours = 4;
					break;
				default:
					empHours = 0;
			}
			// calculate hours
			totalEmpHours += empHours;
			System.out.println("Working day : " + totalWorkingDay + " and Employee Hours : " + empHours);
		}
		totalEmpWage = totalEmpHours * empRatePerHr;
	}
	@Override
	public String toString() {
		return "Total Emp Wage for company " + company + " is " + totalEmpWage;
	}
}
