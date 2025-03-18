package BankAccountSystem.Models;

import BankAccountSystem.Utility.IntrestCalculator;

public class Account {
    private static long nextAccountNumber = 100001;
    private final String accountNumber;
    private String accountHolderName;
    private String accountHolderContact;
    private double balance;
    private String password;
    private String accountType;

    public Account(String accountHolderName, String accountHolderContact, double initialBalance, String password, String accountType, double minimumBalance) {
        
        if(initialBalance < minimumBalance) {
            throw new IllegalArgumentException("Error: Minimum balance ₹" + minimumBalance + " required to open " + accountType + " Account.");
        }

        this.accountNumber = "INDIANBANK"+String.valueOf(nextAccountNumber++); 
        this.accountHolderName = accountHolderName;
        this.accountHolderContact = accountHolderContact;
        this.balance = initialBalance;
        this.password = password;
        this.accountType = accountType;
    }

    public String getAccountNumber() {
        return accountNumber;
    }
    public String getAccountHolderName() {
        return accountHolderName;
    }
    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }
    public String getAccountHolderContact() {
        return accountHolderContact;
    }
    public void setAccountHolderContact(String accountHolderContact) {
        this.accountHolderContact = accountHolderContact;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getAccountType() {
        return accountType;
    }
    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public double getBalance() {
        return balance;
    }

    public boolean deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("₹" + amount + " deposited successfully. New Balance: ₹" + balance);
            return true;
        } else {
            System.out.println("Invalid deposit amount!");
            return false;
        }
    }

    public boolean withdraw(double amount, String enteredPassword) {
        if (!enteredPassword.equals(password)) {
            System.out.println("Incorrect Password! Transaction Failed.");
            return false;
        }
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("₹" + amount + " withdrawn successfully. Remaining Balance: ₹" + balance);
            return true;
        } else {
            System.out.println("Insufficient balance or Invalid Amount!");
            return false;
        }
    }
}
