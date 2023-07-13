package Methods.methods_with_parameters_and_return_values;

public class UserStory2 {

    //User Story 2: As a user, I want to find the sum of all numbers from 1 to a given number using a while loop.
    //Explanation:   (method-3)
    //
    //Create a method called "calculateSum" that takes an integer parameter.
    //Initialize a variable called "sum" with the value 0.
    //Use a while loop with a condition that checks if a counter variable (initialized as 1) is less than or equal to the given number.
    //Inside the loop, add the value of the counter to the "sum" variable and increment the counter.
    //After the loop, return the value of "sum."


    public int calculateSum(int value1){
        int sum=0; int i=1;
        while (i<=value1) {
            sum+=i;
            i++;

        }
        return sum;
    }
}
