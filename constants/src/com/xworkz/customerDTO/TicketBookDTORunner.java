package com.xworkz.customerDTO;

public class TicketBookDTORunner {
    public static void main(String[] args) {
        TicketBookDTO ticketBookDTO=new TicketBookDTO("kgf","sujatha takies","offline","recliner");
        System.out.println("movieName:"+ticketBookDTO.getMovieName());
        System.out.println("theaterName:"+ticketBookDTO.getTheaterName());
        System.out.println("ticketType:"+ticketBookDTO.getTicketType());
        System.out.println("seatType:"+ticketBookDTO.getSeatType());
    }
}
