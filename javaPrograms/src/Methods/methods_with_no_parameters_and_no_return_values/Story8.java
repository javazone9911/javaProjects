package Methods.methods_with_no_parameters_and_no_return_values;

import java.util.Scanner;

public class Story8 {
    //User Story 8: As a developer, I want to implement a simple menu system that allows a user to choose options using a switch case.
    //Explanation:
    //
    //Create a method called "showMenu" that displays a menu of options to the user.
    //Prompt the user to enter a choice using the Scanner class.
    //Use a switch case statement with the user's choice as the expression.
    //For each case, perform the corresponding action based on the selected option.
    //If none of the cases match, print an error message for an invalid choice.


        public void showMenu(){
            Scanner scan=new Scanner(System.in);
            String[] menuOptions={"option-1","option-2","option-3","option-4","Exit-5"};
            int choice;

            do {
                // Display the menu
                for (int i=0;i< menuOptions.length;i++){
                    System.out.println(menuOptions[i]);
                }
                System.out.println("Enter your choice");
                choice=scan.nextInt();

                switch(choice){
                    case 1:
                        System.out.println("You selected coffee");
                        break;
                    case 2:
                        System.out.println("you selected Tea");
                        break;
                    case 3:
                        System.out.println("You selected ice-cream");
                        break;
                    case 4:
                        System.out.println("Have a nice day! ");
                        break;
                    case 5:
                        System.out.println("Exiting");
                        break;
                    default:
                        System.out.println("invalid option");
                        break;
                }

            } while (choice!=5);


        }
    }

