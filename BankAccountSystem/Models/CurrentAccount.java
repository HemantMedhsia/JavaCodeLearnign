package BankAccountSystem.Models;

import BankAccountSystem.Utility.IntrestCalculator;

public class CurrentAccount extends Account {
    private static final double INTREST_RATE = 0.04;
    private static final int MIN_BALANCE = 2000;

    public CurrentAccount(String accountHolderName, String accountHolderContact, double balance, String password) {
        super(accountHolderName, accountHolderContact, balance, password, "Current", MIN_BALANCE);
    }

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
