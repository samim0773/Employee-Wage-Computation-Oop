package employeewage;
class CalculateWageTillCondition {
	// global constant variable
	public static final int is_Part_Time = 1;
	public static final int is_Full_Time = 2;
	public static final int emp_Rate_Per_Hour = 20;
	public static final int num_Of_Working_Days = 2;
	public static final int max_Hour_In_Month = 10;

	public void calculateWage() {
		int empHrs = 0, totalEmpHrs = 0, totalWorkingDays = 0;
		// check total emp hour is less than 100 and total working day less than 20
		while (totalEmpHrs <= max_Hour_In_Month && totalWorkingDays < num_Of_Working_Days) {
			// increment total working day
			totalWorkingDays++;
			// generat random number 0 1 2
			int empCheck = (int) Math.floor(Math.random() * 10) % 3;
			// check condition
			switch (empCheck) {
			// full time = 2
			case is_Full_Time:
				empHrs = 8;
				break;
			// part time = 1
			case is_Part_Time:
				empHrs = 4;
				break;
			// absent = 0
			default:
				empHrs = 0;
			}
			// calculate total emp hour
			totalEmpHrs += empHrs;
			// print total working day
			System.out.println("Day :" + totalWorkingDays + " Emp Hr: " + empHrs);
		}
		// calculate emp wage
		int totalEmpWage = totalEmpHrs * emp_Rate_Per_Hour;
		// print emp wage
		System.out.println("Total Emp Wage :" + totalEmpWage);
	}
}

public class EmployeeWage {
	public static void main(String[] args) {
		// print welcome message
		System.out.println("Welcome to Employee Wage Computation Program");
		// create object
		CalculateWageTillCondition emp1 = new CalculateWageTillCondition();
		// call method
		emp1.calculateWage();
	}
}
