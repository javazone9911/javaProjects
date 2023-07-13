package Methods.methods_with_parameters_and_return_values;

public class Array1 {

    ////User Story 6: As a user, I want to find the maximum number from an array of integers using a for loop.
    //    //Explanation:
    //    //
    //    //Create a method called "findMaxNumber" that takes an integer array parameter.
    //    //Initialize a variable called "maxNumber" with the first element of the array.
    //    //Use a for loop to iterate through the array starting from the second element.
    //    //Inside the loop, compare each element with the current value of "maxNumber."
    //    //If an element is greater than "maxNumber," update the value of "maxNumber" with that element.
    //    //After the loop, return the value of "maxNumber."


    public int findMaxNumber(int[] array){
        int maxNumber=array[0];
        for(int i=1;i<array.length;i++){
            if (array[i]>maxNumber){
                maxNumber=array[i];
            }
        }
        return maxNumber;
    }
}
