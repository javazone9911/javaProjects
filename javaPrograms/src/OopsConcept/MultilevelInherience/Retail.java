package OopsConcept.MultilevelInherience;

public class Retail extends Wholesale{
    String retailSupply;
    String retailScale;

    public Retail(String veryLargeSupplyDistribution, String distributionScale, String wholesaleSupply, String wholesaleScale, String retailSupply, String retailScale) {
        super(veryLargeSupplyDistribution, distributionScale, wholesaleSupply, wholesaleScale);
        this.retailSupply = retailSupply;
        this.retailScale = retailScale;
    }
}
