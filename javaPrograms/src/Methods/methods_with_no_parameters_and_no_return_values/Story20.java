package Methods.methods_with_no_parameters_and_no_return_values;

public class Story20 {
    //User Story 20: As a user, I want to check if a given number is even or odd and display the result.
    //Explanation:
    //
    //Create a method called "checkEvenOrOdd" that takes an integer parameter and return type void.
    //Use an if statement to check if the given number is divisible by 2.
    //If it is divisible by 2, print "Even" to the console. Otherwise, print "Odd."
    //Call the "checkEvenOrOdd" method to check and display if the number is even or odd.

    public void checkEvenOrOdd(int number){
        if(number%2==0){
            System.out.println("It is a Even number");
        } else {
            System.out.println("It is odd number");
        }

    }
}
