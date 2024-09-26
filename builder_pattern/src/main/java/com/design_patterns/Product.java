package com.design_patterns;

import java.math.BigDecimal;

public class Product {

    private int id;
    private String name;
    private BigDecimal price;
    private String color;
    // more attributes

    public static class Builder {

        Product product = new Product();

        public Builder id(int id){
            product.id = id;
            return this;
        }

        public Builder name(String name){
            product.name = name;
            return this;
        }

        public Builder price(BigDecimal price){
            product.price = price;
            return this;
        }

        public Builder color(String color){
            product.color = color;
            return this;
        }

        public Product build(){
            return product;
        }

    }

    // another way of builder pattern - used in lombok
    public static Builder builder(){
        return new Builder();
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }




}
