package com.xworkz.provider;

public class BookingMyShowMovieBookingProvider extends BookingProvider {
    public boolean ticketBooking;
    public double ticketPrice;

    public BookingMyShowMovieBookingProvider(boolean ticketBooking,double ticketPrice){
        super();
        this.ticketBooking=ticketBooking;
        this.ticketPrice=ticketPrice;
    }
    public void totalHalls(){
        System.out.println("movie totalHalls in BookingMyShowBookingProvider");
    }
}
