package com.example.demon;

public class Bus implements Vehicle{
    private int busSpeed=60;
    private int time;
    private int distance;

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public int getTime(){
        time=distance/busSpeed;
        return time;
    }
}
