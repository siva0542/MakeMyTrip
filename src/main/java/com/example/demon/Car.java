package com.example.demon;

public class Car implements Vehicle{
    private int carSpeed=80;
    private int time=0;

    public void setTime(int time) {
        this.time = time;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    private int distance;
    public int getTime(){
        time=distance/carSpeed;
        return time;
    }

}
