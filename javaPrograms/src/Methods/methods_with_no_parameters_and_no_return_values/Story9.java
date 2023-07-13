package Methods.methods_with_no_parameters_and_no_return_values;

import java.util.Scanner;

public class Story9 {
    //User Story 9: As a user, I want to print the multiplication table of a given number up to 10 using a for loop.
    //Explanation:
    //
    //Create a method called "printMultiplicationTable" with no parameters.
    //Prompt the user to enter a number.
    //Use a for loop to iterate from 1 to 10 (inclusive).
    //Inside the loop, calculate the product of the entered number and the loop index.
    //Print the equation and the calculated product.
    //After the loop, the multiplication table up to 10 for the entered number will be printed.


    public void printMultiplicationTable(){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the number");
        int number=scan.nextInt();
        for(int i=1;i<=10;i++){
          //  product*=i;
            System.out.println(number + "*" + i + "=" +  number *i);
        }
    }
}
