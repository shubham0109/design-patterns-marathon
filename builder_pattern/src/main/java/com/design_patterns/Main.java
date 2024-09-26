package com.design_patterns;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {

        System.out.println("Builder Pattern!");

        Product p1 = new Product.Builder()
                .id(5)
                .name("p1")
                .price(BigDecimal.valueOf(56.90))
                .color("red")
                .build();

        System.out.println("p1: " + p1.toString());

        //lombok works this way
        Product p2 = Product.builder()
                .id(6)
                .name("p2")
                .price(BigDecimal.valueOf(45))
                .build();

        System.out.println("p2: " + p2.toString());

        User u1 = User.builder()
                        .firstName("shubham")
                        .build();

        System.out.println("u1: " + u1.toString());


    }
}