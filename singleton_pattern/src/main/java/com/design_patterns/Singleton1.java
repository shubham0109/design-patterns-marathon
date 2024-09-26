package com.design_patterns;

public class Singleton1 {

    private static Singleton1 singleton = null;

    private Singleton1(){

    }

    // not thread safe
    public static Singleton1 getInstance(){

        if (singleton == null){
            singleton = new Singleton1();
        }

        return singleton;

    }


}
