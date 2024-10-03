package com.xworkz.product.constants;

public enum TicketType {
    ONLINE(150),OFFLINE(280);
    private int cost;

    TicketType(int cost) {
        this.cost = cost;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }
}
