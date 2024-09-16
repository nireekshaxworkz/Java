package com.xworkz.provider;

public class BookingProvider extends Provider {
    public String name;
    public String ceoName;
    public BookingProvider(String name,String ceoName){
        super();
        this.name=name;
        this.ceoName=ceoName;
    }

    public BookingProvider() {
        System.out.println("===========");
    }

    @Override
    public String toString() {
        return "BookingProvider{" +
                "name='" + name + '\'' +
                ", ceoName='" + ceoName + '\'' +
                '}';
    }

    @Override
    public void service() {
        System.out.println("=========");
        return;
    }
}
