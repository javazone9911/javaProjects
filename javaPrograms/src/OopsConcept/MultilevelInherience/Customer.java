package OopsConcept.MultilevelInherience;

public class Customer extends Retail{
    String customerId;
    String customerName;

    public Customer(String veryLargeSupplyDistribution, String distributionScale, String wholesaleSupply, String wholesaleScale, String retailSupply, String retailScale, String customerId, String customerName) {
        super(veryLargeSupplyDistribution, distributionScale, wholesaleSupply, wholesaleScale, retailSupply, retailScale);
        this.customerId = customerId;
        this.customerName = customerName;
    }
}
