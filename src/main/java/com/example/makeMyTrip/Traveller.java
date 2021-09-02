package com.example.makeMyTrip;

import org.springframework.stereotype.Component;

@Component
public class Traveller {
    private String username;
    private String email;
    private String creditCard;
    private String password;
    private int id;

    public String getEmail() {
        return email;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setCreditCard(String creditCard) {
        this.creditCard = creditCard;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCreditCard() {
        return creditCard;
    }

    public String getPassword() {
        return password;
    }

    public int getId() {
        return id;
    }


    public String getUsername() {
        return username;
    }
}
