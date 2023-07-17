package OopsConcept.HerirecalInheritenc;

public class Chair extends Furniture {
    int noOfLegs;
    String color;
    String brand;

    public Chair(int noOfLegs, String color,double price,String material,String brand) {
        super(price,material);
        this.noOfLegs = noOfLegs;
        this.color = color;
        this.brand=brand;

    }
        public void sit(){
            System.out.println("sitting on the chair");
        }
    }


