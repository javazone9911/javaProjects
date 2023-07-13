package Methods.methods_with_parameters_and_return_values;

public class UserStory7 {

    //User Story 7: As a user, I want to check if a given year is a leap year using a boolean method.
    //Explanation:
    //
    //Create a method called "isLeapYear" that takes an integer parameter.
    //Use an if statement to check the conditions for a leap year.
    //If the given year is divisible by 4 and not divisible by 100 (unless it is divisible by 400), return true.
    //Otherwise, return false.

    public boolean isLeapYear(int year){
        if(year % 4 == 0){
            if(year % 100 ==0) {
                return year % 400==0;
            } else {
                return true;
            }
        } else {
            return false;
        }
    }
}
