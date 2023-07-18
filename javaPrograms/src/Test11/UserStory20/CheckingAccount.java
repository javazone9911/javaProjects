package Test11.UserStory20;

public class CheckingAccount extends BankAccount{

    private double fine;
    public CheckingAccount(long accountNumber, double balance,double fine) {
        super(accountNumber, balance);
        this.fine=fine;
    }

    public void deposit(double amount){
        balance+=amount;
    }
    public void withDraw(double amount){
        balance-=amount;
    }
}
