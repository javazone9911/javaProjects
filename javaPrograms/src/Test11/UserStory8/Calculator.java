package Test11.UserStory8;

public interface Calculator {
    //User Story 8: As a developer, I want to create a Calculator interface with methods for addition, subtraction, multiplication, and division, and have different calculator classes implement this interface.
    //Explanation:
    //Create a Calculator interface with method declarations for addition, subtraction, multiplication, and division.
    //Implement separate Calculator classes (e.g., BasicCalculator, ScientificCalculator) that implement the Calculator interface and provide specific implementations for each method.
    //Use interfaces to define a common set of operations that can be implemented by different calculator classes.



    int addition(int x,int y);
    int subtraction(int x,int y);
    int multiplication(int x,int y);
    int division(int x,int y);



}
