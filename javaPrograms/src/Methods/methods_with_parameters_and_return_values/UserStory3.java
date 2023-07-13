package Methods.methods_with_parameters_and_return_values;

public class UserStory3 {
    // User Story 3: As a user, I want to convert a numerical grade to a letter grade using switch case logic.
    //Explanation:   (method-3)
    //
    //Create a method called "convertToLetterGrade" that takes an integer parameter.
    //Use a switch case statement with the given parameter as the expression.
    //For each case, map the corresponding numerical grade range to a letter grade.
    //Return the letter grade based on the matching case.

    public int convertToLetterGrade(int value1){
        switch (value1) {
            case 1:
                System.out.println("one");
                break;
            case 2:
                System.out.println("Two");
                break;
            case 3:
                System.out.println("Three");
                break;
            case 4:
                System.out.println("FOur");
                break;
            case 5:
                System.out.println("Five");
                break;
            case 6:
                System.out.println("Six");
                break;
            case 7:
                System.out.println("Seven");
                break;
            case 8:
                System.out.println("Eight");
                break;
            case 9:
                System.out.println("Nine");
                break;
            case 10:
                System.out.println("Ten");
                break;
            default:
                System.out.println("invalid number");
        }
        return value1;
    }
}
