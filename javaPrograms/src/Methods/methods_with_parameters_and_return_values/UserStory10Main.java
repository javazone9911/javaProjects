package Methods.methods_with_parameters_and_return_values;

public class UserStory10Main {
    public static void main(String[] args) {
        UserStory10 userStory10=new UserStory10();
        int number=9;
        int sum=userStory10.calculateOddSum(number);
        System.out.println("THe sum of given odd numbers is "+ sum);
    }
}
