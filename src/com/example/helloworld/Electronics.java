package com.example.helloworld;

public class Electronics extends Product {

    public Electronics(String name, double price) {
        super(name, price);
    }

    @Override
    public double calculateTax() {
        return this.price * 0.1;
    }

    @Override
    public double calculateDiscount() {
        return this.price * 0.15;
    }
}
