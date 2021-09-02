package com.example.makeMyTrip;

import org.springframework.stereotype.Component;

@Component
public class Login{
    private String s;
    private String p;
    private Login login;
    public Login(String s,String p){
        this.s = s;
        this.p = p;
    }
}
