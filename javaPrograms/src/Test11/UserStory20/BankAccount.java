package Test11.UserStory20;

public class BankAccount {
    //User Story 20: As a developer, I want to create a BankAccount class with private attributes such as accountNumber and balance, and public methods to deposit and withdraw money, while enforcing method overriding for withdrawal logic in specific account types.
    //Explanation:
    //Create a BankAccount class with private attributes such as "accountNumber" and "balance."
    //Implement encapsulation by providing public methods to deposit and withdraw money, while keeping the attributes private.
    //Use method overriding to allow specific account types (e.g., SavingsAccount, CheckingAccount) to provide their own implementation for the withdraw method, allowing for different withdrawal logic based on account type.

    private long accountNumber;
    private double balance;

    public BankAccount(long accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    public void deposit(double amount){
        balance+=amount;
    }
    public void withDraw(double amount){
        balance-=amount;
    }
}
