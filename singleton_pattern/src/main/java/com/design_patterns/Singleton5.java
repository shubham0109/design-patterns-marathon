package com.design_patterns;

public class Singleton5 {

    private static Singleton5 singleton = new Singleton5();

    private Singleton5(){

    }


    public static Singleton5 getInstance(){
        return singleton;
    }
}
