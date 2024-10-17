package com.teachmeskills_lesson6b;

public class CreditCard {
     String accountNumber;
     double balance;

    public CreditCard(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    public double getBalance() {
        return balance;
    }

    public void updateBalance(double amount) {
        this.balance += amount;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void printInfo() {
        System.out.println("Card: " + accountNumber + ", Balance: " + balance);
    }
}