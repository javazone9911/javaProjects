package OopsConcept.HerirecalInheritenc;

public class MainTest {
    public static void main(String[] args) {
        Chair chair=new Chair(4,"brown",150,"copper","Ashoka");
        System.out.println(chair.noOfLegs + " " + chair.brand+ " " + chair.color +" " + chair.price + " " + chair.material);
        chair.sit();



    }
}
