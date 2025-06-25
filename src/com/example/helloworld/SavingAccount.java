package com.example.helloworld;

public class SavingAccount extends BankAccount{

    public SavingAccount(){
        this.type = "saving";
    }

    @Override
    public void deposit(int amount) {
        this.balance += amount;
        System.out.println("deposit money into " + this.type);
    }

    @Override
    public void withdraw(int amount) {
        this.balance -= amount;
        System.out.println("withdraw money");
    }

    public static void main(String[] args) {
        SavingAccount ac = new SavingAccount();
        ac.deposit(1000);
        ac.withdraw(500);
        System.out.println(ac.balance);
    }
}
