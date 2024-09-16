package com.xworkz.provider;

public class MovieBookingProvider extends BookingProvider{   //inheritance
    public String movieName;
    public double ticketPrice;

    public MovieBookingProvider(String movieName,double ticketPrice){
        super();//chaining
        this.movieName=movieName;
        this.ticketPrice=ticketPrice;
    }
    @Override
    public boolean equals(Object obj){
        System.out.println("=========");
        return equals(obj);
    }

    public void book(){
        System.out.println("ticket booking in bookingProvider");
    }
    public void cancel(){
        System.out.println("ticket cancel in bookingProvider");
    }

}
