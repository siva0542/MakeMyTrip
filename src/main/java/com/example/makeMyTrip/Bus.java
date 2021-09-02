package com.example.makeMyTrip;

import java.util.Map;

public class Bus implements Vehicle{
    private int busSpeed=60;
    private int time;
    private int distance=1000;

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public int getTime(){
        time=distance/busSpeed;
        return time;
    }
}
