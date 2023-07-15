package OopsConcept.HerirecalInheritenc;

public class TotalAccount {
    public static void main(String[] args) {

        MainClassAccount mainClassAccount=new MainClassAccount("Records allocated");
        System.out.println(mainClassAccount.totalRecords + " is records allocated." );

        MoneyMarketAccount moneyMarketAccount=new MoneyMarketAccount("Excellent","very demanding","higher deposit");
        System.out.println(moneyMarketAccount.higherInterestRate+ " "+ moneyMarketAccount.higherBalanceDeposit+" " + moneyMarketAccount.totalRecords + " " + moneyMarketAccount.higherBalanceDeposit );

        CheckingAccount checkingAccount=new CheckingAccount("20k withdrawn","still thinking" ,"still making");
        System.out.println(checkingAccount.makingPurchases + " " + checkingAccount.withdrawCash + " " + checkingAccount.totalRecords +" " + checkingAccount.makingPurchases);

        SavingsAccount savingsAccount=new SavingsAccount("currently nill","100rupees only","very good");
        System.out.println(savingsAccount.totalRecords + " " + savingsAccount.lowerInterest + " " + savingsAccount.easyFunds) ;
    }
}
