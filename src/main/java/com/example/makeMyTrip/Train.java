package com.example.makeMyTrip;

import java.util.Set;

public class Train implements  Vehicle{
    private int trainSpeed=70;
    private int time=0;

    public void setDistance(int distance) {
        this.distance = distance;
    }

    private int distance=600;
    public int getTime(){
        time=distance/trainSpeed;
        return time;
    }
}
