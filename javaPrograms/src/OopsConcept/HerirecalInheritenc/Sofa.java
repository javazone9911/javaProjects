package OopsConcept.HerirecalInheritenc;

public class Sofa extends  Furniture{
    int noOfLegs;
    String color;
    String cusions;

    public Sofa(double price, String material, int noOfLegs, String color, String cusions) {
        super(price, material);
        this.noOfLegs = noOfLegs;
        this.color = color;
        this.cusions = cusions;
    }

    public void sit(){
        System.out.println("sitting on the sofa");
    }
}
