package OopsConcept.MultilevelInherience;

public class Wholesale extends  Distributors{
    String wholesaleSupply;
    String wholesaleScale;

    public Wholesale(String veryLargeSupplyDistribution, String distributionScale, String wholesaleSupply, String wholesaleScale) {
        super(veryLargeSupplyDistribution, distributionScale);
        this.wholesaleSupply = wholesaleSupply;
        this.wholesaleScale = wholesaleScale;
    }

}
