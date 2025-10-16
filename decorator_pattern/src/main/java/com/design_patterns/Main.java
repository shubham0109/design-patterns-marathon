package com.design_patterns;

public class Main {
    public static void main(String[] args) {

        DecoratorPattern decoratorPattern = new DecoratorPattern(10);

        System.out.println("get private var: " + decoratorPattern.num);


    }
}