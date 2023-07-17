package Test11.UserStory14;

public interface Shape {
    //User Story 14: As a developer, I want to create a Shape interface with methods for calculating area and perimeter, and have Circle and Rectangle classes implement it.
    //Explanation:
    //Create a Shape interface with method declarations for calculating the area and perimeter of shapes.
    //Implement separate Circle and Rectangle classes that implement the Shape interface and provide specific implementations for the area and perimeter calculations.
    //Use interfaces to define a common set of operations for shape calculations that can be implemented by different shape classes.

    public void calculatingTheArea(int x,int y);
    public void perimeterOfShapes(int x,int y);

}
