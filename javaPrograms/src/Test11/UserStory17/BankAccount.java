package Test11.UserStory17;

public class BankAccount {
    //User Story 17: As a developer, I want to create a BankAccount class with private attributes such as accountNumber and balance, and public methods to deposit and withdraw money, while ensuring data encapsulation.
    //Explanation:
    //Create a BankAccount class with private attributes such as "accountNumber" and "balance."
    //Implement encapsulation by providing public methods to deposit and withdraw money, while keeping the attributes private.
    //Use the encapsulated methods to perform banking operations such as depositing and withdrawing money, ensuring controlled access to the account data.

    private long accountNumber;
    private double balance;

   public void deposit(double money){
       balance+=money;
       System.out.println(balance);
   }
   public void withdrawMoney(double withdrawMoney){
       balance-=withdrawMoney;
       System.out.println(balance);
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
