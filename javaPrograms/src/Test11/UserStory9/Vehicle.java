package Test11.UserStory9;

public interface Vehicle {
    //User Story 9: As a developer, I want to create a Vehicle interface with a method called "start" and have Car and Motorcycle classes implement it.
    //Explanation:
    //Create a Vehicle interface with a method declaration for "start" that has no implementation.
    //Implement separate Car and Motorcycle classes that implement the Vehicle interface and provide specific implementations for the "start" method.
    //Use interfaces to define a common behavior (starting the vehicle) that is implemented differently by different vehicle types.

    public void start();
}
