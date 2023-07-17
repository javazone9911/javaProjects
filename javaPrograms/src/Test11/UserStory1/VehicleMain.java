package Test11.UserStory1;

public class VehicleMain {
    public static void main(String[] args) {
        Vehicle vehicle=new Vehicle("Tata","honda",2019);
        System.out.println(vehicle.make+" is manufacturer. "+vehicle.model+" is modelName "+vehicle.year+ " is exhibited.");
    }
}
