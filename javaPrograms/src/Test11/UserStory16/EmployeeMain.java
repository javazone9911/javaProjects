package Test11.UserStory16;

public class EmployeeMain {
    public static void main(String[] args) {
        Employee employee=new Employee();
        employee.setDepartment("software");
        employee.setName("kiran");
        employee.setSalary(65000.50);
        System.out.println("Department is "+employee.getDepartment());
        System.out.println("MY name is "+employee.getName());
        System.out.println("My monthly salary is "+employee.getSalary());

    }
}
