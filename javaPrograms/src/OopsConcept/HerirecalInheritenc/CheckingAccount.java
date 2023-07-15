package OopsConcept.HerirecalInheritenc;

import OopsConcept.SingleInheritence.MainClass;

public class CheckingAccount extends MainClassAccount {

    String withdrawCash;
    String makingPurchases;

    public CheckingAccount(String totalRecords, String withdrawCash, String makingPurchases) {
        super(totalRecords);
        this.withdrawCash = withdrawCash;
        this.makingPurchases = makingPurchases;
    }
}


