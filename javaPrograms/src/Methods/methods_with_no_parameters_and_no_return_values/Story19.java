package Methods.methods_with_no_parameters_and_no_return_values;

import java.util.Random;
public class Story19 {
    //User Story 19: As a user, I want to generate a random number between 1 and 10 and display it.
    //Explanation:
    //
    //Create a method called "generateRandomNumber" with no parameters and return type void.
    //Use the Random class to generate a random number between 1 and 10.
    //Print the generated random number to the console.
    //Call the "generateRandomNumber" method to generate and display the random number.

    public void generateRandomNumber(){
        Random random=new Random();
        int randomNumber=random.nextInt(10)+1;
        System.out.println("The random number between 1 and 10 = " + randomNumber);


        }
    }


