package Methods.Methods_with_parameters_but_no_return_values;

public class UserStory6 {
    //User Story 6: As a developer, I want to implement a simple calculator that performs addition, subtraction, multiplication, or division based on a user's choice using a switch case.
    //Explanation:
    //
    //Create a method called "performOperation" that takes three parameters: two integers "a" and "b", and a character "operator".
    //Use a switch case statement with the "operator" as the expression.
    //For each case, perform the corresponding operation (+ for addition, - for subtraction, * for multiplication, / for division).
    //Print the result of the operation.
    //If none of the cases match, print an error message for an invalid operator.

    public void performOperation(int a,int b,char operator){
        switch(operator){
            case '+':
                System.out.println("The addition of a and b is "+ (a + b));
                break;
            case '-':
                System.out.println("The subtraction of a and b is "+ (a-b));
                break;
            case '*':
                System.out.println("The multiplication of a and b is "+ (a * b));
                break;
            case '/':
                System.out.println("The division of a and b is "+ (a/b));
                break;
            default:
                System.out.println("invalid operation");
                break;
        }
    }
}
