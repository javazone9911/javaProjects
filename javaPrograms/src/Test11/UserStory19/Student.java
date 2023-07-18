package Test11.UserStory19;

public class Student {
    //User Story 19: As a developer, I want to create a Student class with private attributes such as name, age, and grade, and public methods to get and set these attributes.
    //Explanation:
    //Create a Student class with private attributes such as "name," "age," and "grade."
    //Implement encapsulation by providing public methods (getters and setters) to access and modify the private attributes.
    //Use the getters and setters to retrieve and update the student's name, age, and grade, ensuring controlled access to the class attributes.

    private String name;
    private int age;
    private String grade;

 /*   public Student(String name, int age, String grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }   */

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }
}
