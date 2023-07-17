package Test11.UserStory10;

public class Person {
    //User Story 10: As a developer, I want to create a Person class with private attributes such as name and age, and public methods to display the person's details.
    //Explanation:
    //Create a Person class with private attributes such as "name" and "age."
    //Implement encapsulation by providing public methods to display the person's name and age, while keeping the attributes private.
    //Use the encapsulated methods to retrieve and display the person's details in a controlled manner.


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

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
