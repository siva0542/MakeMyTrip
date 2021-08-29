package com.example.demon;

public interface Payment {
    public boolean paymentStatus();

    void setCardNumber(String s);
    void setMonth(int month);
    void setYear(int year);
    void setBalance(int balance);
    void setAmount(int amount);

}
