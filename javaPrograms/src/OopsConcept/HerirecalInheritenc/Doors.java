package OopsConcept.HerirecalInheritenc;

public class Doors extends Furniture {
    int doorType;
    String color;
    String brand;

    public Doors(int doorType, String color, String brand,double price,String material) {
        super(price,material);
        this.doorType = doorType;
        this.color = color;
        this.brand = brand;
    }

    public void openingDoor(){
        System.out.println("Opening the door");
    }
    public void  closingDoor(){
        System.out.println("closing the door");
    }
}
