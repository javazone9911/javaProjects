package Methods.methods_with_no_parameters_and_no_return_values;

public class Story17 {
    //User Story 17: As a user, I want to find the sum of all numbers in an array using a for loop.
    //Explanation:
    //
    //Create an integer array with a predetermined set of values.
    //Initialize a variable called "sum" with the value 0.
    //Use a for loop that starts from 0 and iterates up to the length of the array.
    //Inside the loop, add each element of the array to the "sum" variable.
    //After the loop, print the value of "sum."


    public void   user(){
        int[] array={12,52,2,4,116,25};
        int sum=0;
        for(int i=0;i<array.length;i++){
            sum+=array[i];
        }
        System.out.println("The sum of all array numbers is "+sum);
    }

}
