package com.xworkz.provider;

public class Lenovoprovider extends Provider{
    public int size;
    public double cost;
    public Lenovoprovider(int size,double cost){
        super();
        this.size=size;
        this.cost=cost;
    }

    @Override
    public void service() {
        System.out.println("=======");
    }
    public void profit(){
        System.out.println("getting profit in lenovoProvider");
    }
}
