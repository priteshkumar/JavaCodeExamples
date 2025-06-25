package com.example.helloworld.designpatterns;

class User {
    private String firstname;
    private String lastName;
    private int age;

    @Override
    public String toString() {
        return "User{" +
                "firstname='" + firstname + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                '}';
    }

    private User(Builder builder) {
        this.firstname = builder.firstName;
        this.lastName = builder.lastName;
        this.age = builder.age;
    }

    static class Builder {
        private String firstName;
        private String lastName;
        private int age;

        Builder firstName(String firstname) {
            this.firstName = firstname;
            return this;
        }

        Builder lastName(String lastname) {
            this.lastName = lastname;
            return this;
        }

        Builder age(int age) {
            this.age = age;
            return this;
        }

        User build() {
            return new User(this);
        }
    }
}

public class BuilderPatternDemo {
    public static void main(String[] args) {
        User user =
                new User.Builder().
                        firstName("mark").
                        lastName("smith").
                        age(29).
                        build();
        System.out.println(user.toString());

    }
}
