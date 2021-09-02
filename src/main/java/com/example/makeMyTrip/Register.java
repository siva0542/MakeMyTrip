package com.example.makeMyTrip;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
@Component
@Primary
public class Register {
    private String userName;
    private String password;
    private Register register;

    public Register(String userName, String password) {
        this.userName=userName;
        this.password=password;
    }
}
