package Methods.Methods_with_parameters_but_no_return_values;

public class UserStory4 {
    //User Story 4: As a developer, I want to print the numbers from a given range in reverse order using a for loop.
    //Explanation:
    //
    //Create a method called "printNumbersInReverse" that takes two integer parameters: "start" and "end".
    //Use a for loop to iterate from the "end" number to the "start" number (inclusive) with a step size of -1.
    //Inside the loop, print each number.
    //After the loop, the numbers will be printed in reverse order.


    public void printNumbersInReverse(int start,int end){
        for (int i=end;i>=start;i--){
            System.out.println(i);

        }
    }
}
