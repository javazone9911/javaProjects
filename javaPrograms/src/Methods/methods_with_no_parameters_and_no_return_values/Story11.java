package Methods.methods_with_no_parameters_and_no_return_values;

public class Story11 {
    //User Story 11: As a user, I want to display the uppercase alphabets using a for loop and ASCII values.
    //Explanation:
    //
    //Create a method called "displayUppercaseAlphabets" with no parameters.
    //Use a for loop to iterate from the ASCII value of 'A' (65) to the ASCII value of 'Z' (90).
    //Inside the loop, convert the current ASCII value to a character and print it.
    //After the loop, the uppercase alphabets will be displayed.

    public void displayUppercaseAlphabets(){

        for(int i=65;i<=90;i++){
            char character=(char) i;
            System.out.println(character);


        }
    }


}
