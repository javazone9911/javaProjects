package OopsConcept.HerirecalInheritenc;

import OopsConcept.SingleInheritence.MainClass;

public class SavingsAccount extends MainClassAccount {

    String lowerInterest;
    String easyFunds;

    public SavingsAccount(String totalRecords, String lowerInterest, String easyFunds) {
        super(totalRecords);
        this.lowerInterest = lowerInterest;
        this.easyFunds = easyFunds;
    }
}


