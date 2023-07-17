package Test11.UserStory1;

public class Motorcycle extends Vehicle{
    int twoWheeler;

    public Motorcycle(String make, String model, int year, int twoWheeler) {
        super(make, model, year);
        this.twoWheeler = twoWheeler;
    }
}
