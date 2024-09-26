package com.design_patterns;

public class Singleton4 {

    private Singleton4(){

    }

    public static final class SingletonHolder {
        public static final Singleton4 singleton4 = new Singleton4();
    }

    public static Singleton4 getInstance(){
        return SingletonHolder.singleton4;
    }

}
