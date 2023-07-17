package OopsConcept.Abstraction;

public class MobilePhoneMain {
    public static void main(String[] args) {
        MobilePhone mobilePhone=new Android();
        mobilePhone.notification("youtube","video");
        mobilePhone.call("9968745248");
        mobilePhone.sendMessage("9998877552","hello");
        MobilePhone mobilePhone1=new Iphone();
        mobilePhone1.sendMessage("12345","welcome to my world");
        mobilePhone1.call("56789");
        mobilePhone1.notification("yahoo","validity is expired");



    }
}
