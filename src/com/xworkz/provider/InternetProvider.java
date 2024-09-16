package com.xworkz.provider;

public class InternetProvider extends Provider{
    public int size;
    public int density;
    public InternetProvider(int size,int density){
        super();
        this.size=size;
        this.density=density;
    }

    @Override
    public void service() {
        System.out.println("=======");
        service();
    }
}
