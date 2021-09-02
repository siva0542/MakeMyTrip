package com.example.makeMyTrip;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import java.util.Scanner;

@Controller
@ComponentScan("com.example.makeMyTrip")
public class Config {
    @Bean
   @Scope(value="prototype")
    public Register setRegister(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your name");
        String userName=sc.nextLine();
        System.out.println("Enter your password");
        String password=sc.nextLine();
        System.out.println("Registration Successful");
        return new Register(userName,password);
    }
    @Bean
   @Scope(value="prototype")
    public Login setLogin(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter username");
        String s=sc.nextLine();
        System.out.println("Enter Password");
        String p=sc.nextLine();
        System.out.println("Login successful");
        return new Login(s,p);
    }
}
