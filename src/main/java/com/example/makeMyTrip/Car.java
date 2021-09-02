package com.example.makeMyTrip;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class Car implements Vehicle{
    private int carSpeed=90;
    private int time;
    private int distance=450;

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public int getTime(){
        time=distance/carSpeed;
        return time;
    }


}
