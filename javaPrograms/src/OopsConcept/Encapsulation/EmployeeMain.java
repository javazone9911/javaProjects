package OopsConcept.Encapsulation;

public class EmployeeMain {
    public static void main(String[] args) {
        Employee employee=new Employee(2152,"sunil","raju","sunilRaju123@gmail.com",
                97955959, "software",100000, "hyd","12-12-12");
     /*   employee.setEmployeeAddress("kurnool");
        employee.setEmployeeId(1);
        employee.setEmployeeFirstname("kiran");
        employee.setEmployeeLastname("kumar");
        employee.setEmployeeEmail("kirankumar123@gmail.com");
        employee.setEmployeePhoneNumber(48528);
        employee.setEmployeeSalary(2452.23);
        employee.setDesignation("software");
        employee.setEmployeeJoinedDate("25-05-2023");  */
        System.out.println("My employeeId is "+employee.getEmployeeId());
        System.out.println("My name is "+employee.getEmployeeFirstname()+ " "+employee.getEmployeeLastname());
        System.out.println("My address is "+employee.getEmployeeAddress());
        System.out.println("My email is "+employee.getEmployeeEmail());
        System.out.println("My phoneNumber is "+employee.getEmployeePhonenumber());
        System.out.println("My salary is "+employee.getEmployeeSalary());
        System.out.println("My designation is "+employee.getDesignation());
        System.out.println("My joinedDate is "+employee.getEmployeeJoinedDate());


    }

}
