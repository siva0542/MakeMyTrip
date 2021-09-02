package com.example.makeMyTrip;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class Register {
    private String[] userNames=new String[100];
    private String[]  passwords=new String[100];
    public void setRegister(){
        this.userNames=userNames;
        this.passwords=passwords;
    }
}
