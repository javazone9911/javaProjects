package Test11.UserStory16;

public class Employee {
    //User Story 16: As a developer, I want to create an Employee class with private attributes such as name, salary, and department, and public methods to get and set these attributes.
    //Explanation:
    //Create an Employee class with private attributes such as "name," "salary," and "department."
    //Implement encapsulation by providing public methods (getters and setters) to access and modify the private attributes.
    //Use the getters and setters to retrieve and update the employee's name, salary, and department, ensuring controlled access to the class attributes.

    private String name;
    private double salary;
    private String department;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
