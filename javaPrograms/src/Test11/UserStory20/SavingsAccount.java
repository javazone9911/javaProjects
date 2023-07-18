package Test11.UserStory20;

public class SavingsAccount extends BankAccount{

    private double interest;

    public SavingsAccount(long accountNumber, double balance, double interest) {
        super(accountNumber, balance);
        this.interest = interest;
    }

    public void deposit(double amount){
        balance+=amount;
    }
    public void withDraw(double amount){
        balance-=amount;
    }
}
