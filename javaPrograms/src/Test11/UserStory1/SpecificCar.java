package Test11.UserStory1;

public class SpecificCar extends Vehicle{
    String color;
    String brand;

    public SpecificCar(String make, String model, int year, String color, String brand) {
        super(make, model, year);
        this.color = color;
        this.brand = brand;
    }
}
