package OopsConcept.Encapsulation;

public class AadharCardMain {
    public static void main(String[] args) {

        AadharCard aadharCard=new AadharCard(256387451532l,"vinod babu"," kadapa");
    /*    aadharCard.setAadharCardid(265874152563l);
        aadharCard.setAadharName("Ashok kumar");
        aadharCard.setAadharAddress("kurnool");  */
        System.out.println("My aadharCard id "+ aadharCard.getAadharCardid());
        System.out.println("My aadharName  "+ aadharCard.getAadharName());
        System.out.println("My aadharAddress  "+ aadharCard.getAadharAddress());


    }
}
