package Methods.methods_with_no_parameters_and_no_return_values;

import java.util.Scanner;

public class Story16 {
    //User Story 16: As a user, I want to check the day of the week based on a given number using a switch case.
    //Explanation:
    //
    //Take an integer input from the user.
    //Use a switch case statement with the input number as the expression.
    //For each case, map the corresponding number to a day of the week.
    //Print the day of the week based on the matching case.
    //If none of the cases match, print a message indicating an invalid input.

    public void week(){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the number");
        int number=scan.nextInt();
        switch(number){
            case 1:
                System.out.println("it's a monday");
                break;
            case 2:
                System.out.println("it's a Tuesday");
                break;
            case 3:
                System.out.println("it's a Wednesday");
                break;
            case 4:
                System.out.println("it's a Thursday");
                break;
            case 5:
                System.out.println("it's a Friday");
                break;
            case 6:
                System.out.println("it's a Saturday");
                break;
            case 7:
                System.out.println("it's a Sunday");
                break;
            default:
                System.out.println("invalid input");
                break;
        }
    }
}
