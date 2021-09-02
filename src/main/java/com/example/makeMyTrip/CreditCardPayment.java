package com.example.makeMyTrip;

import org.springframework.stereotype.Component;

import java.util.Scanner;
@Component
public class CreditCardPayment implements Payment{
    private int cardNumber=9160;
    private int balance=4000;
    private int amount=400;
    private int cardNo;
    private int pin;
    private int pins=1234;

    public void paymentDetails(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Card Number");
        int cardNo=sc.nextInt();
        System.out.println("Enter pin");
        int pin=sc.nextInt();
        System.out.println("Please Wait......\nYour transaction is prossesing");
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
