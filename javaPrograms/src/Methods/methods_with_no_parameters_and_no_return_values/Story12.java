package Methods.methods_with_no_parameters_and_no_return_values;

public class Story12 {
    //User Story 12: As a user, I want to print the even numbers from 2 to 20 using a while loop.
    //Explanation:
    //
    //Create a method called "printEvenNumbers" with no parameters.
    //Initialize a variable called "number" with the value 2.
    //Use a while loop with a condition that checks if "number" is less than or equal to 20.
    //Inside the loop, print the current value of "number".
    //Increment the "number" by 2 in each iteration to ensure only even numbers are printed.
    //After the loop, the even numbers from 2 to 20 will be printed.


    public void printEvenNumbers(){
        int number=2;
        while (number<=20){
            System.out.println(number);
            number+=2;
        }

    }
}
