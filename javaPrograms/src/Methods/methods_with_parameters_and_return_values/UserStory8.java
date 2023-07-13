package Methods.methods_with_parameters_and_return_values;

public class UserStory8 {

    // User Story 8: As a user, I want to find the largest and smallest numbers from a given array using a for loop.
    //Explanation:
    //
    //Create a method called "findMinMaxNumbers" that takes an integer array parameter.
    //Initialize variables "minNumber" and "maxNumber" with the first element of the array.
    //Use a for loop to iterate through the array starting from the second element.
    //Inside the loop, compare each element with the current values of "minNumber" and "maxNumber."
    //If an element is smaller than "minNumber," update the value of "minNumber" with that element.
    //If an element is greater than "maxNumber," update the value of "maxNumber" with that element.
    //After the loop, return the minimum and maximum numbers.


    public int[] findMinMaxNumbers(int[] array) {
        int minNumber = array[0];
        int maxNumber = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < minNumber) {
                minNumber = array[i];
                //   maxNumber=array[i];
            }
          else  if (array[i] > maxNumber) {
                maxNumber = array[i];
            }
        }
        int[] minMaxNumbers = {minNumber, maxNumber};
        return minMaxNumbers;
        //  return minNumber;
        //  return maxNumber;
        //  return minNumber;

    }
}
