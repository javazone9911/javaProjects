package OopsConcept.SingleInheritence;

public class Car extends Vehicle{
    int noOfSeats;

    public Car(String brand,int noOfSeats) {
        super(brand);
        this.noOfSeats=noOfSeats;
    }

    public void start(){
        System.out.println("car is started");
    }
}
