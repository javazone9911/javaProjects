package Test11.UserStory6;

public class Student {
    //User Story 6: As a developer, I want to create a Student class with private attributes such as name and age, and public methods to get and set these attributes.
    //Explanation:
    //Create a Student class with private attributes such as "name" and "age."
    //Implement encapsulation by providing public methods (getters and setters) to access and modify the private attributes.
    //Use the getters and setters to retrieve and update the student's name and age, ensuring controlled access to the class attributes.

    private String name;
    private int age;

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
}
