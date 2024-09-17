package com.xworkz.internal.abstact;

public class HotelRunner {
    public static void main(String[] args) {
        Hotel hotel=new Hotel() {
            @Override
            public int hashCode() {
                return super.hashCode();
            }
        };
    }
}
