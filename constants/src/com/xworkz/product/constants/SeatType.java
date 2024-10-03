package com.xworkz.product.constants;

public enum SeatType {
    RECLINER(13),PREMIUM(50),EXECUTIVE(45);
    private int seatNo;
    SeatType(int seatNo){
        this.seatNo=seatNo;
    }

    public int getSeatNo() {
        return seatNo;
    }

    public void setSeatNo(int seatNo) {
        this.seatNo = seatNo;
    }
}
