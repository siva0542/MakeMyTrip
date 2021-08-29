package com.example.demon;

public class DebitCardPayment implements Payment {
    private String cardNumber;
    private int month;
    private int year;
    private int balance;
    private int amount;

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
    public boolean paymentStatus(){
        if(balance>amount){
            balance=balance-amount;
            return true;
        }
        else
            return false;
    }
}
