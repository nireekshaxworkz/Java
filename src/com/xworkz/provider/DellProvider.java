package com.xworkz.provider;

public class DellProvider extends Provider{
    public int size;
    public double cost;
    public DellProvider(int size,double cost){
        super();
        this.size=size;
        this.cost=cost;
    }

    @Override
    public void service() {
        System.out.println("========");
        service();
    }
}
