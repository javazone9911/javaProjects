package Methods.methods_with_no_parameters_and_no_return_values;

import java.util.Scanner;

public class Story13 {
    //User Story 13: As a user, I want to display a menu of options and prompt the user for a choice using switch case logic.
    //Explanation:
    //
    //Create a method called "displayMenu" with no parameters.
    //Print a menu of options.
    //Prompt the user to enter a choice.
    //Use a switch case statement with the entered choice as the expression.
    //Implement cases for each menu option and perform the desired actions.
    //After the switch case statement, the chosen option will be executed.


    public void displayMenu(){
     //   String[] menuOfOptions={"option-1","option-2","option-3","option-4"};
        System.out.println("Menu of Options");
        System.out.println("option-1");
        System.out.println("option-2");
        System.out.println("option-3");
        System.out.println("option-4");
        Scanner scan=new Scanner(System.in);
        System.out.println("ENter the choice");
        String choice=scan.nextLine();
        switch (choice){
            case"1":
                System.out.println("Give me coffee");
                break;
            case"2":
                System.out.println("Give me Tea");
                break;
            case"3":
                System.out.println("Give me A break");
                break;
            case"4":
                System.out.println("Give me A ice-cream");
                break;
            default:
                System.out.println("invalid input");
                break;
        }


    }
}
