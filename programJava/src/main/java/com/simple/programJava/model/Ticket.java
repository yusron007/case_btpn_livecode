package com.simple.programJava.model;

public class Ticket {

    private String type;
    private int price;

    public Ticket() {
    }

    public Ticket(String type, int price) {
        this.type = type;
        this.price = price;
    }

    // Getters and Setters
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}

