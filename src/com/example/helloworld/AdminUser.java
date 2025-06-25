package com.example.helloworld;

public class AdminUser extends User {
    public AdminUser(String username, String email) {
        super(username, email);
    }

    public void manageProducts() {
        System.out.println(this.getUsername() + " manages products");
    }

    public static void main(String[] args) {
        AdminUser admin = new AdminUser("mavix", "mavix@test.com");
        admin.login();
        admin.manageProducts();
    }

    @Override
    public void showDashBoard() {
        System.out.println("admin user " + this.getUsername() + " dashboard");
    }
}
