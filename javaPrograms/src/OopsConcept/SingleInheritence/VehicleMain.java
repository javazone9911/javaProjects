package OopsConcept.SingleInheritence;

public class VehicleMain {
    public static void main(String[] args) {
        Car car=new Car("jeep",4);
        System.out.println(car.brand);
        System.out.println(car.noOfSeats);
        car.driving();
        car.start();

    }
}
