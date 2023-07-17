package Test11.UserStory7;

public class BankAccountMain {
    public static void main(String[] args) {
        BankAccount bankAccount=new BankAccount();
        bankAccount.setAccountNumber(2365147928523l);
        bankAccount.setBalance(96885298552.25);
        bankAccount.deposit();
        bankAccount.withdraw();
        bankAccount.checkTheBalance();
        System.out.println("The account number is "+bankAccount.getAccountNumber());
        System.out.println("The balance is "+bankAccount.getBalance());
    }
}
