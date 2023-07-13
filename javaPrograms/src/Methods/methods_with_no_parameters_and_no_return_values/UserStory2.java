package Methods.methods_with_no_parameters_and_no_return_values;

public class UserStory2 {
    //User Story 2: As a user, I want to calculate the discount percentage based on the user's membership level (Gold, Silver, Bronze) using a switch case statement.
    //Acceptance Criteria:
    //
    //The user should input their membership level.
    //The program should use a switch case statement to determine the corresponding discount percentage.
    //The program should display the discount percentage based on the membership level.

    public void membership(String level){
        switch(level){
            case"gold level":
                System.out.println("The user get 60% discount due to gold level membership");
                break;
            case"silver level":
                System.out.println("The user get 45% discount due to silver level membership");
                break;
            case"bronge level":
                System.out.println("The user get 30% discount due to bronze level membership");
                break;
            default:
                System.out.println("invalid level entry");
                break;


        }
    }
}
