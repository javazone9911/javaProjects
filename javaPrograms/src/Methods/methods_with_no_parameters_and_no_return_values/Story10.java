package Methods.methods_with_no_parameters_and_no_return_values;

public class Story10 {
    //User Story 10: As a user, I want to display the days of the week using a switch case logic inside a for loop.
    //Explanation:
    //
    //Create a method called "displayDaysOfWeek" with no parameters.
    //Use a for loop to iterate from 1 to 7 (inclusive).
    //Inside the loop, use a switch case statement with the loop index as the expression.
    //For each case, map the loop index to the corresponding day of the week.
    //Print the day of the week for each case.
    //After the loop, the days of the week will be displayed.

    public void displayDaysOfWeek(){
        for(int i=1;i<=7;i++){
            switch(i){
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
                    System.out.println("Invalid input");
                    break;
            }
        }
    }
}
