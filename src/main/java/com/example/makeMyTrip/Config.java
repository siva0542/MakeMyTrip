package com.example.makeMyTrip;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import java.util.Scanner;

@Controller
@ComponentScan("com.example.makeMyTrip")
public class Config {
    @Bean
    public void setRegister(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your name");
        String userNames=sc.nextLine();
        System.out.println("Enter your password");
        String passwords=sc.nextLine();
        System.out.println("Registration Successful");
    }
    @Bean
    public void loginn(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter username");
        String s=sc.nextLine();
        System.out.println("Enter Password");
        String p=sc.nextLine();
        System.out.println("Login successful");
        //Register register=new Register();
       // System.out.println(register.useNames);
    }
}
