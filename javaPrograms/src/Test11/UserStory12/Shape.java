package Test11.UserStory12;

abstract class Shape {
    //User Story 12: As a developer, I want to create a shape hierarchy where different shapes such as Circle, Square, and Rectangle inherit common attributes and behaviors from a base abstract class called Shape.
    //Explanation:
    //Create an abstract Shape class with common attributes and methods for shapes.
    //Implement separate Circle, Square, and Rectangle classes that inherit from the Shape class and provide specific implementations for the abstract methods.
    //Use inheritance and abstraction to define a common structure and behavior for different shapes.

    abstract void  noOfSides(int sides);
    abstract void  shape(String shape);
    abstract void shapeExample(String looksLike);

}
