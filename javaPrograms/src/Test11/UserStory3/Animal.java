package Test11.UserStory3;

abstract class Animal {
    //User Story 3: As a developer, I want to create an abstract Animal class with an abstract method called "sound" that is implemented by specific animal classes such as Dog and Cat.
    //Explanation:
    //Create an abstract Animal class with a method declaration for "sound" that has no implementation.
    //Implement separate Dog and Cat classes that inherit from the Animal class and provide specific implementations for the "sound" method.
    //Use abstraction to define a common behavior (sound) that is implemented differently by different animal types.

    abstract void sound();
}
