package bank;

import java.util.ArrayList;

public class BankCustomers {
    private static ArrayList<BankAccount> accountsList = new ArrayList<>();

    public void addAccount(BankAccount account) {
        accountsList.add(account);
    }

    public void showAllBalances() {
        for (BankAccount account : accountsList) {
            System.out.println("Account Holder Name: " + account.getAccountHolderName());
            System.out.println("Account Number: " + account.getAccountNumber());
            System.out.println("Balance: $" + account.getBalance());
            System.out.println();
        }
    }

    public BankAccount findAccount(String accountNumber) {
        for (BankAccount account : accountsList) {
            if (account.getAccountNumber().equals(accountNumber)) {
                return account;
            }
        }
        System.out.println("Account not found");
        return null;
    }

}
