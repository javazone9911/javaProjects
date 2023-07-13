package Methods.methods_with_parameters_and_return_values;

public class UserStory5 {

    // User Story 5: As a developer, I want to calculate the sum of squares of all even numbers from 1 to a given number using a while loop.
    //Explanation:   (method-3)
    //
    //Create a method called "calculateSumOfSquares" that takes an integer parameter.
    //Initialize a variable called "sum" with the value 0.
    //Initialize a counter variable as 1.
    //Use a while loop with a condition that checks if the counter is less than or equal to the given number.
    //Inside the loop, check if the counter is an even number.
    //If it is even, add the square of the counter to the "sum" variable.
    //Increment the counter by 1 in each iteration.
    //After the loop, return the value of "sum."

    public int calculateSumOfSquares(int value){
        int sum=0;
        int counter=1;
        while (counter<=value) {
            if(counter%2==0) {
                sum+=counter*counter;


            }
            counter++;

        }
        System.out.println(sum);
        return sum;
    }

}
