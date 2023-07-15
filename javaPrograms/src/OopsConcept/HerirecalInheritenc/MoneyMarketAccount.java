package OopsConcept.HerirecalInheritenc;

public class MoneyMarketAccount extends MainClassAccount{
    String higherInterestRate;
    String higherBalanceDeposit;

    public MoneyMarketAccount(String totalRecords, String higherInterestRate, String higherBalanceDeposit) {
        super(totalRecords);
        this.higherInterestRate = higherInterestRate;
        this.higherBalanceDeposit = higherBalanceDeposit;
    }
}

