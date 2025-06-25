package com.example.helloworld;

public class OnlineStore {
    public static void main(String[] args) {
        Product phone = new Electronics("smartphone",2000);
        System.out.println(phone.calculateTax());
        System.out.println(phone.calculateDiscount());
    }
}
