package com.example.makeMyTrip;

import org.springframework.stereotype.Component;

import java.util.Map;
@Component
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
