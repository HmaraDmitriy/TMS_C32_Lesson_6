package com.teachmeskills_lesson6b;

public class TransferService {

    public void deposit(CreditCard card, double amount) {
        if (amount <= 0) {
            System.out.println("Error: Deposit must be greater than 0.");
            return;
        }
        card.updateBalance(amount);
        System.out.println("Deposited " + amount + " to card " + card.getAccountNumber());
    }

    public void withdraw(CreditCard card, double amount) {
        if (amount <= 0) {
            System.out.println("Error: Withdrawal amount must be greater than 0.");
            return;
        }
        if (amount > card.getBalance()) {
            System.out.println("Error: Insufficient funds on card " + card.getAccountNumber());
            return;
        }
        card.updateBalance(-amount);
        System.out.println("Withdrawn " + amount + " from card " + card.getAccountNumber());
    }

}
