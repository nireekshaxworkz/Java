package com.xworkz.internal;

public class Mobile {
    private int size;
    private double price;

    public Mobile(int size,double price){
        this.size=size;
        this.price=price;
    }
    public void service(){
        System.out.println("use the service in mobile");
    }
}
