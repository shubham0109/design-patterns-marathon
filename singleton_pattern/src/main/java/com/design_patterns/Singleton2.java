package com.design_patterns;


public class Singleton2 {

    private static Singleton2 singleton2 = null;

    private Singleton2(){
    }

    // this puts a lock over the whole function, not recommended
    public static synchronized Singleton2 getInstance(){
        if (singleton2 == null){
            singleton2 = new Singleton2();
        }
        return singleton2;
    }

}
