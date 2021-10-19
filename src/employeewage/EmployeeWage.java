package employeewage;
class EmpWageOfAllCompanies{
	
	//constant
    public static final int IS_FULL_TIME = 1;
    public static final int IS_PART_TIME = 2;
    private int numOfCompanies = 0;
    private CompanyEmpWage[] companyEmpWage;
    
    //Wage Computation method
    public EmpWageOfAllCompanies(){
    	companyEmpWage = new CompanyEmpWage[5];
    }
    
    void addCompany(String company,int empRatePerHr,int numOfWorkingDays,int maxHrsPerMonth) {
    	companyEmpWage[numOfCompanies] = new CompanyEmpWage(company, empRatePerHr, numOfWorkingDays, maxHrsPerMonth);
        numOfCompanies++;
    }
    
    void computeWage(){
    	for(int i = 0; i < numOfCompanies; i++){
            companyEmpWage[i].setTotalEmpWage(this.computeWage(companyEmpWage[i]));
            System.out.println(companyEmpWage[i]);
        }
    }
    
    private int computeWage(CompanyEmpWage CompanyWage){
    	
    	//variables
        int empHours = 0;
        int totalWorkingDay = 0;
        int totalEmpHours = 0;
        while (totalEmpHours <= CompanyWage.maxHrsPerMonth && totalWorkingDay < CompanyWage.numOfWorkingDays){
        	totalWorkingDay++;
            //Generate random value to check employee do work full time, part time or absent
            int empcheck = (int)Math.floor(Math.random()*10) % 3;
            //Condition statement switch case
            switch(empcheck){
                    case IS_FULL_TIME:
                            empHours = 8;
                            break;
                    case IS_PART_TIME:
                            empHours = 4;
                            break;
                    default:
                            empHours = 0;
            }
            //calculate hours
            totalEmpHours += empHours;
            System.out.println("Working day : " + totalWorkingDay + " and Employee Hours : " + empHours);
        }
        return totalEmpHours * CompanyWage.empRatePerHr;
    }
	
}
class CompanyEmpWage{
	 public final String company;
	 public final int empRatePerHr;
	 public final int numOfWorkingDays;
	 public final int maxHrsPerMonth;
	 public int totalEmpWage;
	 
	 public CompanyEmpWage(String company, int empRatePerHr, int numOfWorkingDays, int maxHrsPerMonth) {
		 this.company = company;
	     this.empRatePerHr = empRatePerHr;
	     this.numOfWorkingDays = numOfWorkingDays;
	     this.maxHrsPerMonth = maxHrsPerMonth;
	 }
	 
	 public void setTotalEmpWage(int totalEmpWage) {
		 this.totalEmpWage = totalEmpWage;
	 }
	 
	 @Override
	 public String toString(){
		 return "Total Emp Wage for company "+ company + " is "+ totalEmpWage;
	 }
}
public class EmployeeWage {
	//main method
    public static void main(String args[]){
    	// create object
        EmpWageOfAllCompanies empWageBuilder = new EmpWageOfAllCompanies();
        empWageBuilder.addCompany("amazon", 20, 2, 10);
        empWageBuilder.addCompany("flipkart", 20, 2, 10);
        empWageBuilder.computeWage();
    }
	
}