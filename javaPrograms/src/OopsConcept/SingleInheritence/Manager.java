package OopsConcept.SingleInheritence;

public class Manager extends Employee{
    String department;

    public Manager(int employeeId, String employeeName, int noOfEmployees, String department) {
        super(employeeId, employeeName, noOfEmployees);
        this.department = department;
    }


}
