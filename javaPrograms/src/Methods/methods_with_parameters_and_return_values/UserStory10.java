package Methods.methods_with_parameters_and_return_values;

public class UserStory10 {

    // User Story 10: As a user, I want to calculate the sum of all odd numbers from 1 to a given number using a while loop.
    //Explanation:
    //
    //Create a method called "calculateOddSum" that takes an integer parameter.
    //Initialize variables "sum" and "count" with the values 0.
    //Use a while loop with a condition that checks if the current number is less than or equal to the given number.
    //Inside the loop, check if the current number is odd.
    //If it is odd, add the number to the "sum" variable and increment the "count" variable.
    //Increment the current number by 1 in each iteration.
    //After the loop, return the calculated sum.

    public int calculateOddSum(int number){
        int sum=0;
        int count=0;
        int i=1;
        while (i<=number){
            if(i%3==0){
                sum+=i;
                count++;

            }
            i++;
        }
        return sum;
    }
}
