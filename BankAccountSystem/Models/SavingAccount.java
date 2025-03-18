package BankAccountSystem.Models;

import BankAccountSystem.Utility.IntrestCalculator;

public class SavingAccount extends Account {
    private static final double INTREST_RATE = 0.07;
    private static final double MIN_BALANCE = 1000.0;

    public SavingAccount(String accountHolderName, String accountHolderContact, double balance, String password) {
        super(accountHolderName, accountHolderContact, balance, password, "Saving", MIN_BALANCE);
    };

    @Override
    public boolean withdraw(double amount, String password) {
        if (!getPassword().equals(password)) {
            System.out.println("Incorrect Password! Transaction Failed.");
            return false;
        }

        if (getBalance() - amount >= MIN_BALANCE) {
            System.out.println("Error: You must maintain a minimum balance of ₹" + MIN_BALANCE);
            return false;
        }

        return super.withdraw(amount, password);
    }

    @Override
    public boolean deposit(double amount) {
        if (super.deposit(IntrestCalculator.generalIntrestCalculator(amount, 12, INTREST_RATE))) {
            return super.deposit(amount);
        }
        return false;
    }

}
