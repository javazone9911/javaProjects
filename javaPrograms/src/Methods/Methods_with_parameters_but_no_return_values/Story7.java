package Methods.Methods_with_parameters_but_no_return_values;

public class Story7 {   //  (method-3)
    //User Story 7: As a user, I want to find the sum of all numbers between two given numbers (inclusive) using a while loop.
    //Explanation:
    //
    //Create a method called "calculateSumBetween" that takes two integer parameters: "start" and "end".
    //Initialize a variable called "sum" with the value 0.
    //Initialize a counter variable as the "start" number.
    //Use a while loop with a condition that checks if the counter is less than or equal to the "end" number.
    //Inside the loop, add the current value of the counter to the "sum" variable.
    //Increment the counter by 1 in each iteration.
    //After the loop, the sum of all numbers between the given range will be calculated.

    public int calculateSumBetween(int start,int end){
        int sum=0;
        int counter=start;
        while(counter<=end){
            sum+=counter;
            counter++;
        }

        return sum;
    }

}
