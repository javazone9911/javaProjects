package Methods.methods_with_parameters_and_return_values;

public class Sum {

    // User Story 1: As a developer, I want to create a method that takes two integers as parameters and returns their sum.
    //Explanation:
    //
    //Create a method called "sum" that accepts two integer parameters.
    //Inside the method, add the two parameters and store the result in a variable called "totalSum."
    //Use the "return" keyword to return the value of "totalSum."


    public int sum(int values1,int values2) {
        int totalsum=0;
            totalsum=values1+values2;
        return totalsum;
    }
}
