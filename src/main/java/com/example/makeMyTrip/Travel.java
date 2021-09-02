package com.example.makeMyTrip;

public class Travel {
    private String startingPoint;

    public String getStartingPoint() {
        return startingPoint;
    }

    public void setStartingPoint(String startingPoint) {
        this.startingPoint = startingPoint;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    private String destination;
    private int date;

    public String getAvailability(){
        return "Yes";
    }
}
