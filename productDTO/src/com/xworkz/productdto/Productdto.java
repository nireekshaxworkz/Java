package com.xworkz.productdto;

import java.io.Serializable;

public class Productdto implements Serializable,Comparable<Productdto> {
    private int id;
    private String name;
    private String vendor;
    private double cost;

    Productdto(int id,String name,String vendor,double cost){
        this.id=id;
        this.name=name;
        this.vendor=vendor;
        this.cost=cost;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getVendor() {
        return vendor;
    }
    public double getCost() {
        return cost;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setVendor(String vendor) {
        this.vendor = vendor;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    @Override
    public int compareTo(Productdto o) {
        return 0;
    }
}
