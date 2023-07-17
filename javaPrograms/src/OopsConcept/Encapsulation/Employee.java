package OopsConcept.Encapsulation;

public class Employee {
  private int employeeId;
   private String employeeFirstname;
   private String employeeLastname;
   private String employeeEmail;
   private int employeePhonenumber;
   private String designation;
   private double employeeSalary;
   private String employeeAddress;
   private String employeeJoinedDate;

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeFirstname() {
        return employeeFirstname;
    }

    public void setEmployeeFirstname(String employeeFirstname) {
        this.employeeFirstname = employeeFirstname;
    }

    public String getEmployeeLastname() {
        return employeeLastname;
    }

    public void setEmployeeLastname(String employeeLastname) {
        this.employeeLastname = employeeLastname;
    }

    public String getEmployeeEmail() {
        return employeeEmail;
    }

    public void setEmployeeEmail(String employeeEmail) {
        this.employeeEmail = employeeEmail;
    }

    public int getEmployeePhonenumber() {
        return employeePhonenumber;
    }

    public void setEmployeePhonenumber(int employeePhonenumber) {
        this.employeePhonenumber = employeePhonenumber;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public double getEmployeeSalary() {
        return employeeSalary;
    }

    public void setEmployeeSalary(double employeeSalary) {
        this.employeeSalary = employeeSalary;
    }

    public String getEmployeeAddress() {
        return employeeAddress;
    }

    public void setEmployeeAddress(String employeeAddress) {
        this.employeeAddress = employeeAddress;
    }

    public String getEmployeeJoinedDate() {
        return employeeJoinedDate;
    }

    public void setEmployeeJoinedDate(String employeeJoinedDate) {
        this.employeeJoinedDate = employeeJoinedDate;
    }

    public Employee(int employeeId, String employeeFirstname, String employeeLastname, String employeeEmail, int employeePhonenumber, String designation, double employeeSalary, String employeeAddress, String employeeJoinedDate) {
        this.employeeId = employeeId;
        this.employeeFirstname = employeeFirstname;
        this.employeeLastname = employeeLastname;
        this.employeeEmail = employeeEmail;
        this.employeePhonenumber = employeePhonenumber;
        this.designation = designation;
        this.employeeSalary = employeeSalary;
        this.employeeAddress = employeeAddress;
        this.employeeJoinedDate = employeeJoinedDate;
    }
}
