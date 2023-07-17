package OopsConcept.Abstraction;

public class Android extends MobilePhone {
    @Override
    void call(String number) {
        System.out.println("calling "+ number + " from androidNumber");
    }

    @Override
    void sendMessage(String number, String message) {
        System.out.println("sending message  " + message + " to "+ number);
    }

    @Override
    void notification(String application, String notification) {
        System.out.println("getting notification  "+ notification + "from "+ application);

    }
}
