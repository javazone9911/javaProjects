package Test11.UserStory11;

public class PaymentGatewayMain {
    public static void main(String[] args) {
        PaymentGateway paymentGateway=new CreditCard();
        paymentGateway.declarations();
        PaymentGateway paymentGateway1=new Paypal();
        paymentGateway1.declarations();

    }
}
