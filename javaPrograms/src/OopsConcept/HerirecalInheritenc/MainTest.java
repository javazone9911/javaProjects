package OopsConcept.HerirecalInheritenc;

public class MainTest {
    public static void main(String[] args) {
        Chair chair=new Chair(4,"brown",150,"copper","Ashoka");
        System.out.println(chair.noOfLegs + " " + chair.brand+ " " + chair.color +" " + chair.price + " " + chair.material);
        chair.sit();
        Doors doors=new Doors(2,"black","colgate",33.42,"wood");
        System.out.println(doors.doorType+" "+ doors.color+ " " + doors.brand+ " "+ doors.price+" "+doors.material);
        doors.closingDoor();
        doors.openingDoor();



    }
}
