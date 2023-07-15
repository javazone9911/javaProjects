package OopsConcept.SingleInheritence;

public class Employee  {
    int employeeId;
    String employeeName;

    int noOfEmployees;

    public Employee(int employeeId, String employeeName, int noOfEmployees) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.noOfEmployees = noOfEmployees;
    }
    public void employee(){
        System.out.println("The employee name is "+ employeeName);
    }
}
