package com.example.helloworld;

public abstract class BankAccount {
    protected String type;
    protected int balance;

    public abstract void deposit(int amount);

    public abstract void withdraw(int amount);
}


