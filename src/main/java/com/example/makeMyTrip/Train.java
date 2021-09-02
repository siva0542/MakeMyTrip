package com.example.makeMyTrip;

import org.springframework.stereotype.Component;

import java.util.Set;
@Component
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
