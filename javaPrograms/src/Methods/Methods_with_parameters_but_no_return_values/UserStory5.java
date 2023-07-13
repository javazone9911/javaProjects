package Methods.Methods_with_parameters_but_no_return_values;

public class UserStory5 {
    //User Story 5: As a user, I want to calculate the sum of all numbers divisible by a given divisor in a range using a for loop.
    //Explanation:
    //
    //Create a method called "calculateDivisibleSum" that takes three integer parameters: "start", "end", and "divisor".
    //Initialize a variable called "sum" with the value 0.
    //Use a for loop to iterate from the "start" number to the "end" number (inclusive).
    //Inside the loop, check if the current number is divisible by the "divisor".
    //If it is divisible, add the number to the "sum" variable.
    //After the loop, the sum of all numbers divisible by the given divisor will be calculated.

    public void calculateDivisibleSum(int start,int end,int divisor){
        int sum=0;
        for(int i=start;i<=end;i++){
            if(i%divisor==0){
                sum+=i;
            }
        }
        System.out.println("The sum of all numbers divisible by the given divisor = "+ sum);
    }
}
