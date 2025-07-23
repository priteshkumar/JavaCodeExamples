package com.example.helloworld;

public abstract class Product {
    protected String name;
    protected double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public abstract double calculateTax();

    public abstract double calculateDiscount();
}
