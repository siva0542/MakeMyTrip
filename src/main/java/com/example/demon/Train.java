package com.example.demon;

public class Train implements  Vehicle{
    private int trainSpeed=70;
    private int time=0;

    public int getDistance() {
        return distance;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    private int distance;
    public int getTime(){
        time=distance/trainSpeed;
        return time;
    }
}
