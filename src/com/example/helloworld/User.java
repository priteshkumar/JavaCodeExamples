package com.example.helloworld;

public class User {
    private String username;
    private String email;

    public User(String username, String email) {
        this.username = username;
        this.email = email;
    }

    public void login() {
        System.out.println("logged in " + username);
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void showDashBoard(){
        System.out.println("show user dashboard");
    }
}
