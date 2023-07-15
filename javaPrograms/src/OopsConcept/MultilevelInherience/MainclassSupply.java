package OopsConcept.MultilevelInherience;

public class MainclassSupply {
    public static void main(String[] args) {
        Distributors distributors=new Distributors("very bulk quality","very large circle");
        System.out.println(distributors.distributionScale + " " + distributors.veryLargeSupplyDistribution + " " );

        Wholesale wholesale=new Wholesale("very bulk quality","very large circle","very large","medium scale");
        System.out.println(wholesale.veryLargeSupplyDistribution + " " + wholesale.distributionScale + " " + wholesale.wholesaleSupply + " " + wholesale.wholesaleScale + " ");


    }
}
