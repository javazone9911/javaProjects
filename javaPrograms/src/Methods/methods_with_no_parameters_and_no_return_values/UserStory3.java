package Methods.methods_with_no_parameters_and_no_return_values;

public class UserStory3 {
    //User Story 3: As a user, I want to determine the number of days in a given month based on the month number using a switch case statement.
    //Acceptance Criteria:
    //
    //The user should input a number representing a month.
    //The program should use a switch case statement to determine the number of days in the month.
    //The program should display the number of days in the given month.

    public void givenMonth(String month ){
        switch(month){
            case"1":
            System.out.println("jan has 31 days");
            break;
            case"2":
                System.out.println("Feb has 26 days");
                break;
            case"3":
                System.out.println("march has 31 days");
                break;
            case"4":
                System.out.println("April has 31 days");
                break;
            case"5":
                System.out.println("may has 31 days");
                break;
            case"6":
                System.out.println("June has 30 days");
                break;
            case"7":
                System.out.println("July has 31 days");
                break;
            case"8":
                System.out.println("Aug has 31 days");
                break;
            case"9":
                System.out.println("Sep has 30 days");
                break;
            case "10":
                System.out.println("Oct has 31 days");
                break;
            case "11":
                System.out.println("Nov has 31 days");
                break;
            case "12":
                System.out.println("Dec has 31 days");
                break;
            default:
                System.out.println("invalid month number");
        }
    }
}
