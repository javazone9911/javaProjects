package Methods.methods_with_parameters_and_return_values;

import java.io.FilterOutputStream;

public class UserStory7Main {
    public static void main(String[] args) {
        UserStory7 userStory7=new UserStory7();
        int year=2024;
        boolean result=userStory7.isLeapYear(year);
        System.out.println("The given year is a leap year " + result);

    }
}
