package Methods.methods_with_parameters_and_return_values;

public class UserStory9 {

    //User Story 9: As a user, I want to calculate the average of all even numbers from 1 to a given number using a for loop.
    //Explanation:
    //
    //Create a method called "calculateEvenAverage" that takes an integer parameter.
    //Initialize variables "sum" and "count" with the values 0.
    //Use a for loop to iterate from 1 to the given number (inclusive).
    //Inside the loop, check if the current number is even.
    //If it is even, add the number to the "sum" variable and increment the "count" variable.
    //After the loop, calculate the average by dividing the "sum" by the "count."
    //Return the calculated average.

    public double calculateEvenAverage(int number){
        int sum=0;
        int count=0;
        for(int i=1;i<=number;i++){
            if(i%2==0){
                sum+=i;
                count++;
            }
        }


        return (double) sum/count;
    }
}
