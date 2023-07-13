package Methods.methods_with_parameters_and_return_values;

public class UserStory12 {
    //User Story 12: As a developer, I want to validate a credit card number using the Luhn algorithm and return a boolean value.
    //Explanation:
    //
    //Create a method called "validateCreditCardNumber" that takes a string parameter.
    //Remove any spaces or dashes from the string using the replaceAll() method.
    //Convert the string to an array of characters using the toCharArray() method.
    //Initialize a variable called "sum" with the value 0.
    //Use a for loop to iterate through each character in the array from right to left.
    //Inside the loop, convert the character to an integer using the Character.getNumericValue() method.
    //If the current index is odd, double the value of the digit.
    //If the doubled value is greater than 9, subtract 9 from it.
    //Add the value of the digit to the "sum" variable.
    //After the loop, check if the "sum" is divisible by 10.
    //If it is, return true. Otherwise, return false.

    public boolean validateCreditCardNumber(String creditCardNumber){
        String noSpaceCreditCardNumber=creditCardNumber.replace(" ","");
         char[] creditCardDigits = noSpaceCreditCardNumber.toCharArray();
         int sum=0;
         for(int i=creditCardDigits.length -1;i>0;i-- ){
             int digits= Character.getNumericValue(creditCardDigits[i]) ;
             if(i%2==0){
                 digits *= 2;

             if (digits>9){
                 digits -=9;
             }


             }
             sum+=digits;

        }

        return sum%10==0;
    }
}
