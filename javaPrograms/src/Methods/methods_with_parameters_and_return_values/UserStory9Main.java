package Methods.methods_with_parameters_and_return_values;

public class UserStory9Main {
    public static void main(String[] args) {
        UserStory9 userStory9=new UserStory9();
        int number=6;
        double result= userStory9.calculateEvenAverage(number);
        System.out.println("The average of sum of given numbers is "+result);
    }
}
