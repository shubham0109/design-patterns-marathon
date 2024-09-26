package com.design_patterns;

import lombok.Builder;

@Builder
public class User {

    private int id;
    private String firstName;
    private String lastName;
    private int age;

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                '}';
    }
}
