package com.example.helloworld.corejava.singleton;

public class BasicSingleTon {
    private static BasicSingleTon basicSingleTon;
    private BasicSingleTon(){

    }

    public static BasicSingleTon getInstance(){
        if(basicSingleTon == null){
            basicSingleTon = new BasicSingleTon();
        }
        return basicSingleTon;
    }
    public static void main(String[] args){
        BasicSingleTon basicSingleTon = BasicSingleTon.getInstance();
    }

}
