package Test11.UserStory7;

public class BankAccount {
    //User Story 7: As a developer, I want to create a BankAccount class with private attributes such as accountNumber and balance, and public methods to deposit, withdraw, and check the balance.
    //Explanation:
    //Create a BankAccount class with private attributes such as "accountNumber" and "balance."
    //Implement encapsulation by providing public methods to deposit, withdraw, and check the balance, while keeping the attributes private.
    //Use the encapsulated methods to perform banking operations such as depositing money, withdrawing money, and checking the account balance.

    private long accountNumber;
    private double balance;

    public void deposit(){
        System.out.println("deposit your money");
    }
    public void withdraw(){
        System.out.println("withdraw your money");
    }
    public void checkTheBalance(){
        System.out.println("Please check your balance");
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
