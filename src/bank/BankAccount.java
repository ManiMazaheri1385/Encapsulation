package bank;

public abstract class BankAccount {
    final private String accountNumber;
    private String accountHolderName;
    protected double balance;

    public BankAccount(String accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    public abstract void calculateInterest();

    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("You can't deposit negative amount");
        }
        balance += amount;
        System.out.println("Deposited $" + amount + " to your account");
        System.out.println("Your balance is now $" + balance);
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("You can't withdraw negative amount");
        }
        else if (balance < amount) {
            System.out.println("You can't withdraw less than balance");
        }
        balance -= amount;
        System.out.println("$" + amount + " has been withdrawn from your account");
        System.out.println("Your balance is now $" + balance);
    }

    public double getBalance() {
        return balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

}
