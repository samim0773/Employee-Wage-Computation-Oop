package employeewage;

public class EmployeeWage {
	//declared global variables
    public static final int IS_FUll_TIME = 1;
    public static final int IS_PART_TIME = 2;

    private  String company = "";
    private  int empWagePerHr = 0;
    private  int workingDayPerMonth = 0;
    private  int maxHrsInMonth = 0;
    private  int totalEmpWage;	


    //parameterized constructor calling
    public	EmpWageComputation(String company, int empWagePerHr, int workingDayPerMonth, int maxHrInMonth) {
    	this.company = company;
    	this.empWagePerHr = empWagePerHr;
    	this.workingDayPerMonth = workingDayPerMonth;
   	    this.maxHrsInMonth = maxHrInMonth;
    }
    //method: employee wage calculation	
    public void empWageComputation(){   	
    	//variables initialization
    	int empHrs = 0, totalEmpHrs = 0, totalWorkingDays = 1;   
    	//check total emp hour not more than 100 and total days not more than 20
    	while (totalEmpHrs <= maxHrsInMonth && totalWorkingDays <= workingDayPerMonth){ 		
           //random number for employee check 
           int emp_Check  = (int) Math.floor(Math.random() * 10) % 3 ;
        
           //switch case to select emp full time, part time or absent
    	   switch (emp_Check){
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
    	   //calculate total emp hours
           totalEmpHrs += empHrs;
           System.out.println("Day : "+ totalWorkingDays +" Emp Hrs : "+empHrs);

           //day increment by 1 every iteration
           totalWorkingDays++ ;
        }
        // calculate total emp wage
    	totalEmpWage = totalEmpHrs * empWagePerHr;
}

    //to string method for displaying purpose
    public String toString() {
    	return "[Total Emp Wage for: "+company+" is: " + totalEmpWage + "]";
    }

	public static void main(String[] args){
		System.out.println("Welcome to Employee Wage Computation");
		
		//initialize object with parameter
        EmpWageComputation amazon = new EmpWageComputation("Amazon", 25, 5, 25);
        EmpWageComputation flipkart = new EmpWageComputation("flipkart", 20, 5, 30);  
        amazon.empWageComputation();  //Method calling
        System.out.println(amazon);   //displaying amazon object
        flipkart.empWageComputation();    //Method calling
        System.out.println(flipkart);     //displaying flipkart object
    } 
}
