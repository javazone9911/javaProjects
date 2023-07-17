package Test11.UserStory1;

public class Vehicle {
    //User Story 1: As a developer, I want to create a Vehicle class with attributes such as make, model, and year, and have specific car and motorcycle classes inherit from it.
    //Explanation:
    //Create a Vehicle class with attributes such as "make," "model," and "year."
    //Implement separate Car and Motorcycle classes that inherit from the Vehicle class, inheriting the attributes and behavior of the Vehicle class.
    //Use inheritance to reuse common attributes and methods across different types of vehicles.

    String make;
    String model;
    int year;

    public Vehicle(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }
}
