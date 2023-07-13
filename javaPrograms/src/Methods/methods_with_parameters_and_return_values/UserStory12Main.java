package Methods.methods_with_parameters_and_return_values;

public class UserStory12Main {
    public static void main(String[] args) {
        UserStory12 userStory12=new UserStory12();
        String creditCardNumber="4111111111111111";
        boolean isValid= userStory12.validateCreditCardNumber(creditCardNumber);
        System.out.println("The creditCardNumber is "+ creditCardNumber + " is valid="+ isValid);
    }
}
