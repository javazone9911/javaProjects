package Test11.UserStory11;

public class Paypal implements PaymentGateway{
    @Override
    public void declarations() {
        System.out.println("The paypal has both online and offline cash withdraw");
    }
}
