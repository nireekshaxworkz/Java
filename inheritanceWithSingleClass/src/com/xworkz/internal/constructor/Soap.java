package com.xworkz.internal.constructor;

public class Soap {
    private String brand;
    private double price;
    private String color;

    public Soap(String brand,double price){
        System.out.println("created soap using string and double constructor");
        this.brand=brand;
        this.price=price;
    }
    public  Soap(String color){
        System.out.println("created soap using string constructor");
        this.color=color;
    }
}
