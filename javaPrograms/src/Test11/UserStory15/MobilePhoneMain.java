package Test11.UserStory15;

public class MobilePhoneMain {
    public static void main(String[] args) {
        MobilePhone mobilePhone=new MobilePhone();
        mobilePhone.setBrand("nokia");
        mobilePhone.setModel("nokia-x2");
        System.out.println("The brand name is "+mobilePhone.getBrand());
        System.out.println("The model name is "+mobilePhone.getModel());
    }
}
