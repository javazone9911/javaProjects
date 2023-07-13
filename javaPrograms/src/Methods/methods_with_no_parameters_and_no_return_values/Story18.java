package Methods.methods_with_no_parameters_and_no_return_values;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
/*
 public class Story18 {
    //User Story 18: As a user, I want to display the current date and time on the console.
    //Explanation:
    //
    //Create a method called "displayCurrentDateTime" with no parameters and return type void.
    //Inside the method, use the LocalDateTime class to get the current date and time.
    //Format the date and time as a string.
    //Print the formatted date and time to the console.
    //Call the "displayCurrentDateTime" method to display the current date and time.


    public void displayCurrentDateTime(){
        LocalDateTime now =LocalDateTime.now();
        DateTimeFormatter formatter=DateTimeFormatter.ofPattern("yyyy-mm-dd HH-mm-ss");
        String formatettedDateTime = now.format(formatter);
        System.out.println("The current date and time is "+ formatettedDateTime);


    }
}            */




    import  java.time.LocalDateTime;
    import  java.time.format.DateTimeFormatter;


    public class Story18 {

        public void displayCurrentDateTime(){
            LocalDateTime now = LocalDateTime.now();
            DateTimeFormatter formatter=DateTimeFormatter.ofPattern("dd-MM-yyyy hh-mm-ss");
            String formattedDateTime=now.format(formatter);
            System.out.println("The current date and time is "+ formattedDateTime);
        }
    }