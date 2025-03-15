import bank.*;

public class Main {
    public static void main(String[] args) {
        BankCustomers melli = new BankCustomers();

        SavingAccount firstSavingAccount = new SavingAccount("6037", "Steve Jobs", 800_000);
        SavingAccount secondSavingAccount = new SavingAccount("6038", "Bill Gates", 500_000);
        SavingAccount thirdSavingAccount = new SavingAccount("6039", "Elon Musk", 1_000_000);

        TransactionAccount firstTransactionAccount = new TransactionAccount("6040", "Jeff Bezos", 700_000);
        TransactionAccount secondTransactionAccount = new TransactionAccount("6041", "Mark Zuckerberg", 300_000);
        TransactionAccount thirdTransactionAccount = new TransactionAccount("6042", "Pavel Durov", 100_000);

        melli.addAccount(firstSavingAccount);
        melli.addAccount(secondSavingAccount);
        melli.addAccount(thirdSavingAccount);

        melli.addAccount(firstTransactionAccount);
        melli.addAccount(secondTransactionAccount);
        melli.addAccount(thirdTransactionAccount);

        System.out.println("========================================");
        BankAccount firstFoundAccount = melli.findAccount("6037");
        System.out.println();
        BankAccount secondFoundAccount = melli.findAccount("6043");
        System.out.println("========================================");

        System.out.println();

        System.out.println("****************************************");
        System.out.println(thirdSavingAccount.getAccountHolderName() + " Balance: $" + thirdSavingAccount.getBalance());
        thirdSavingAccount.deposit(500_000);
        System.out.println();
        secondTransactionAccount.deposit(-1_000_000);
        System.out.println("****************************************");

        System.out.println();

        System.out.println("----------------------------------------");
        firstSavingAccount.calculateInterest();
        System.out.println();
        firstTransactionAccount.calculateInterest();
        System.out.println("----------------------------------------");

        System.out.println();

        System.out.println("########################################");
        firstSavingAccount.withdraw(300_000);
        System.out.println();
        secondSavingAccount.withdraw(2_000_000);
        System.out.println();
        thirdSavingAccount.withdraw(-500_000);
        System.out.println();
        firstTransactionAccount.withdraw(80_000);
        System.out.println();
        secondTransactionAccount.withdraw(6_000_000);
        System.out.println();
        thirdTransactionAccount.withdraw(-100);
        System.out.println("########################################");

        System.out.println();

        System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
        System.out.println("Account details:");
        System.out.println();
        melli.showAllBalances();
    }
}