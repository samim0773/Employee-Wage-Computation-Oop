package employeewage;

public class EmployeeWage {
	// declared global variables
	public static final int IS_FUll_TIME = 1;
	public static final int IS_PART_TIME = 2;

	// method: employee wage calculation
	public static void empWageComputation(String company, int empWagePerHr, int workingDayPerMonth, int maxHrsInMonth) {
		// variables initialization
		int empHrs = 0, totalEmpHrs = 0, totalWorkingDays = 1;

		// check total emp hour not more than 100 and total days not more than 20
		while (totalEmpHrs <= maxHrsInMonth && totalWorkingDays <= workingDayPerMonth) {

			// random number for employee check
			int emp_Check = (int) Math.floor(Math.random() * 10) % 3;

			// switch case to select emp full time, part time or absent
			switch (emp_Check) {
				case IS_FUll_TIME:
					System.out.println("Employee is present Full Time");
					empHrs = 8;
					break;

				case IS_PART_TIME:
					System.out.println("Employee is present Part Time");
					empHrs = 4;
					break;

				default:
					System.out.println("Employee is Absent");
					empHrs = 0;
			}
			
			// calculate total emp hours
			totalEmpHrs += empHrs;
			System.out.println("Day : " + totalWorkingDays + " Emp Hrs : " + empHrs);

			// day increment by 1 every iteration
			totalWorkingDays++;
		}

		// calculate total emp wage
		int totalEmpWage = totalEmpHrs * empWagePerHr;
		System.out.println("Total Emp Wage For Company:-->" + company + " is:" + totalEmpWage);

	}

	public static void main(String[] args) {

		System.out.println("Welcome to Employee Wage Computation");

		// method call
		empWageComputation("Amazon", 25, 5, 25);
		empWageComputation("Flipkart", 20, 5, 30);
	}

}
