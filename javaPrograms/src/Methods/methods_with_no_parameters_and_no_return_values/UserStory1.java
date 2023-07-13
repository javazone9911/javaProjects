package Methods.methods_with_no_parameters_and_no_return_values;

import java.util.Scanner;

public class UserStory1 {
    //User Story 1: As a user, I want to determine the type of a given character (letter, digit, special character) using a switch case statement.
    //Acceptance Criteria:
    //
    //The user should input a single character.
    //The program should use a switch case statement to determine the type of the character.
    //The program should display the character type (e.g., letter, digit, special character).


    public void singleCharacter(char character){
        switch(character){
            case'a':
            case'b':
            case'c':
            case'd':
            case'e':
            case'f':
            case'g':
            case'h':
            case'i':
            case'j':
            case'k':
            case'l':
            case'm':
            case'n':
            case'o':
            case'p':
            case'q':
            case'r':
            case's':
            case't':
            case'u':
            case'v':
            case'w':
            case'x':
            case'y':
            case'z':
                System.out.println("The given character is a letter");
                break;
            case'1':
            case'2':
            case'3':
            case'4':
            case'5':
            case'6':
            case'7':
            case'8':
            case'9':
                System.out.println("THe given character is an digit");
                break;
            default:
                System.out.println("The given character is an special character");
                break;



        }
    }

        }


