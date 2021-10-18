package employeewage;

class AddPartTimeEmployee {

	// initialize variable and assign value
	int is_Full_Time = 1;
	int is_Part_Time = 2;
	int Emp_Rate_Per_Hour = 20;
	int emp_Hour = 0;
    public void calculateWage() {
    	// take the random value
    	int checkEmp = (int) Math.floor(Math.random() * 10) % 3;
    	// check the condition emp is present or not
    	if(checkEmp==is_Full_Time)
    	{
    		emp_Hour = 8;
    		System.out.println("Employee is Full time");
    	}
    	// part time 2
    	else if(checkEmp==is_Part_Time)
    	{
    		emp_Hour = 4;
    		System.out.println("Employee is Part Time");
    	}
    	else System.out.println("Emplyee is Absent");
    	// calculate emp wage
    	int empWage = emp_Hour * Emp_Rate_Per_Hour;
    	// print emp wage
    	System.out.println("Employee Wage is : "+empWage);
    }
}
public class EmployeeWage {
	public static void main(String[] args) {
		// print welcome message
		System.out.println("Welcome to Employee Wage Computation Program");
		AddPartTimeEmployee emp1 = new AddPartTimeEmployee();
		emp1.calculateWage();
	}
}
