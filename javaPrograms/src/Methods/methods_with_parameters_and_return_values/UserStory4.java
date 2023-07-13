package Methods.methods_with_parameters_and_return_values;

 public class UserStory4 {
     //User Story 4: As a user, I want to check if a given number is prime or not using a boolean method with a for loop.
     //Explanation:   (method-3)
     //
     //Create a method called "isPrime" that takes an integer parameter.
     //Use a for loop to iterate from 2 to the square root of the given number (inclusive).
     //Inside the loop, check if the given number is divisible by any number within the loop.
     //If the given number is divisible by any number, return false.
     //After the loop, return true if the given number is not divisible by any number.



     public boolean isPrime(int primeNumber){
         for(int i=2;i<=Math.sqrt(primeNumber);i++){
             if (primeNumber%i==0){
                 return false;
             }
         }
         return true;
     }
 }