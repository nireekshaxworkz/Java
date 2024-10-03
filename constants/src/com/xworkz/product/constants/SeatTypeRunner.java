package com.xworkz.product.constants;

public class SeatTypeRunner {
    public static void main(String[] args) {
        SeatType seatType=SeatType.EXECUTIVE;
        System.out.println("type:"+seatType.getSeatNo());
        System.out.println("running the seat type of executive");
        SeatType seatType1=SeatType.RECLINER;
        System.out.println("type:"+seatType1.getSeatNo());
    }
}
