package Methods.Methods_with_parameters_but_no_return_values;

public class Notification {

    //  AL-45  As a user, I want to be able to send a notification to other users by invoking the "sendNotification" method and passing the recipient IDs and message content as parameters.

    public void sendNotification(int recipientId,String message_content) {
        System.out.println("The recipientid is " + recipientId + " message contents : " + message_content);

    }
}
