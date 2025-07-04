package com.example.helloworld.corejava.generics;

class Box<T>{
    private T t;
    public void setT(T t){
        this.t = t;
    }
    public T get(){
        return this.t;
    }
}

public class GenericDemo1 {
    public static void main(String[] args) {
        Box<Integer> box1 = new Box<Integer>();
        box1.setT(10);
        System.out.println(box1.get());
        Box<String> box2 = new Box<String>();
        box2.setT("hello");
        System.out.println(box2.get());
    }
}
