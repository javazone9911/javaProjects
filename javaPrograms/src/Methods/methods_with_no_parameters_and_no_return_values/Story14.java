package Methods.methods_with_no_parameters_and_no_return_values;

import java.util.Random;

public class Story14 {
    //User Story 14: As a user, I want to generate a random number between 1 and 10 using a while loop.
    //Explanation:
    //
    //Create a method called "generateRandomNumber" with no parameters.
    //Import the java.util.Random class.
    //Create an instance of the Random class.
    //Initialize a variable called "randomNumber" with the value 0.
    //Use a while loop with a condition that checks if "randomNumber" is equal to 0.
    //Inside the loop, generate a random number between 1 and 10 using the nextInt() method of the Random class.
    //Assign the generated random number to "randomNumber".
    //After the loop, the "randomNumber" variable will hold a random number between 1 and 10.


    public int generateRandomNumber(){
        Random random=new Random();
        int randomNumber=0;
        while (randomNumber==0 ){
            randomNumber=random.nextInt(10)+1;
        }
        return randomNumber;
    }
}
