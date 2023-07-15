package OopsConcept.SingleInheritence;

public class MainClass {
    public static void main(String[] args) {
        Manager manager =new Manager(23,"vishnu kumar",45,"sales department");
        System.out.println(manager.employeeId+" This is my id" + manager.employeeName + " Is my name " + manager.noOfEmployees + " members" + manager.department + " is my department.");
        manager.employee();
    }
}
