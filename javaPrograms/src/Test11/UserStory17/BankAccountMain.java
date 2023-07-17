package Test11.UserStory17;

public class BankAccountMain {
    public static void main(String[] args) {
        BankAccount bankAccount=new BankAccount();
        bankAccount.setAccountNumber(26587436521L);
        bankAccount.setBalance(6987456.65);
        System.out.println("The bank account number is "+bankAccount.getAccountNumber());
        System.out.println("The bank balance is "+bankAccount.getBalance());
        bankAccount.deposit(2635.30);
        bankAccount.withdrawMoney(8628.25);

    }
}
