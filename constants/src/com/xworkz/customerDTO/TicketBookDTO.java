package com.xworkz.customerDTO;

public class TicketBookDTO {
    private String movieName;
    private String theaterName;
    private String ticketType;
    private String seatType;

    public TicketBookDTO() {
    }
    public TicketBookDTO(String movieName,String theaterName,String ticketType,String seatType) {
        this.movieName = movieName;
        this.theaterName=theaterName;
        this.ticketType=ticketType;
        this.seatType=seatType;
    }

    public String getMovieName() {
        return movieName;
    }

    public String getTheaterName() {
        return theaterName;
    }

    public String getTicketType() {
        return ticketType;
    }

    public String getSeatType() {
        return seatType;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public void setTheaterName(String theaterName) {
        this.theaterName = theaterName;
    }

    public void setTicketType(String ticketType) {
        this.ticketType = ticketType;
    }

    public void setSeatType(String seatType) {
        this.seatType = seatType;
    }
}
