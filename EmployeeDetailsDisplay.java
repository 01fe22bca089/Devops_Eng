public class EmployeeDetailsDisplay extends BonusDisplay  {


    String employeeName;
    int employeeID;
    static double employeeSalary;


        public EmployeeDetailsDisplay(String employeeName,int employeeID,double employeeSalary){
       this.employeeName = employeeName;
       this.employeeID = employeeID;
       this.employeeSalary = employeeSalary;
        }


        public void displayDetails(){
            System.out.println("\nEmployee Details:");
            System.out.println("Name: " + employeeName);
            System.out.println("ID: " + employeeID);
            System.out.println("Salary:" + employeeSalary);
       }
       public static void main(String[] args) {
            EmployeeDetailsDisplay emp = new EmployeeDetailsDisplay("Sahishnu",1234,45000);
            emp.displayDetails();    
            double x = 8.33;
            System.out.println("bonusSalary: " +bonusSalary(x, employeeSalary));
        }


}
class BonusDisplay{


    static double bonusSalary (double x, double employeeSalary){


        return (employeeSalary+x)/100;


    }
}
