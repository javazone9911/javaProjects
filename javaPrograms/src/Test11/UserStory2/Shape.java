package Test11.UserStory2;

public class Shape {


  //  User Story 2: As a developer, I want to design a shape hierarchy where different shapes such as Circle, Square, and Rectangle inherit common attributes and behaviors from a base Shape class.
  //  Explanation:
  //  Create a Shape class with common attributes and behaviors for shapes.
  //     Implement separate Circle, Square, and Rectangle classes that inherit from the Shape class.
  //  Use inheritance to define specific attributes and behaviors for each shape while reusing the common ones.


    int noOfSides;
    String shape;

    public Shape(int noOfSides, String shape) {
        this.noOfSides = noOfSides;
        this.shape = shape;
    }
}
