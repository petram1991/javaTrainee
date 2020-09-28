package org.example.les7;

public class BankAccount {
    private int number;
    private int balance;
    private int intrestRate;
    private PersonAccount owner;



    public BankAccount(int id) {
        this.number = id;
    }

    public int withdraw(int amount) {
        if (this.balance - amount > 0) throw new AmountIsToLowException();
        return amount;
    }

    public void deposit(int amount) {
        this.balance = balance + amount;
    }

    @Override
    public String toString() {
        return "Account " + number + " has balance: " + balance;
    }

    public long getAccountNumber() {
        return this.number;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void setOwner(PersonAccount owner) {
        this.owner = owner;
    }
}