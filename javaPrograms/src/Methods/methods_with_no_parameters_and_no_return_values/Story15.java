package Methods.methods_with_no_parameters_and_no_return_values;

import java.util.Scanner;

public class Story15 {
    //User Story 15: As a user, I want to check if a given number is prime using a for loop and if statements.
    //Explanation:
    //
    //Take an integer input from the user.
    //Use a for loop that starts from 2 and iterates up to the square root of the input number.
    //Inside the loop, check if the input number is divisible by any number within the loop.
    //If the input number is divisible by any number, print a message indicating that it is not prime.
    //If the loop completes without finding any divisors, print a message indicating that the input number is prime.

    public boolean  prime(){
        Scanner scan=new Scanner(System.in);
        System.out.println("ENter the number");
        int number=scan.nextInt();
        for (int i=2;i<=Math.sqrt(number);i++){
            if(number%i==0){
                System.out.println("It is not a prime number");
                return false;
            }

        }
        System.out.println("It is a prime number");
        return true;


        }

    }

