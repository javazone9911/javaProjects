package Test11.UserStory11;

public class CreditCard implements PaymentGateway{
    @Override
    public void declarations() {
        System.out.println("The creditcard is only for hardcash.");
    }
}
