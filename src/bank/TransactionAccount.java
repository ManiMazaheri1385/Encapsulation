package bank;

public class TransactionAccount extends BankAccount {
    private final double overDraftLimit = 500;

    public TransactionAccount(String accountNumber, String accountHolderName, double balance) {
        super(accountNumber, accountHolderName, balance);
    }

    @Override
    public void calculateInterest() {
        System.out.println("There is no interest available for transaction account.");
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("You can't withdraw negative or zero amount.");
            return;
        }
        else if (balance + overDraftLimit < amount) {
            System.out.println("You can't withdraw less than balance plus overdraft limit.");
            return;
        }
        balance -= amount;
        System.out.println("$" + amount + " has been withdrawn from " + getAccountHolderName() + " account.");
        System.out.println(getAccountHolderName() + " balance is now $" + balance);
    }

}
