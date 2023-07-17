package OopsConcept.SingleInheritence;

public class Vehicle {

    String brand;
    public void driving(){
        System.out.println("Driving the "+brand);
    }

    public void start(){
        System.out.println("vehicle is started");
    }

    public Vehicle(String brand) {
        this.brand = brand;
    }
}
