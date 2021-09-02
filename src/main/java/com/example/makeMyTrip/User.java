package com.example.makeMyTrip;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Scanner;

@Component
public class User {
    public String[] source={"hyderabad","coimbatore","chintamani","banglore","chennai"};
    public String[] destination={"hyderabad","coimbatore","chintamani","banglore","chennai"};
    public void selectSourceAndDestination(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter source");
        String s=sc.nextLine();
        System.out.println("Enter destination");
        String d=sc.nextLine();
        int j=8,k=8;
        for(int i=0;i<4;i++) {
            if(s.equals(source[i]))
                j=8;
            else
                j=9;
            if(d.equals(destination[i]))
                k=8;
            else
                k=9;
        }
            if (j==8 && k==8){
                System.out.println("Vehicle available");
                selectVehicle();
            }
            else
                System.out.println("Vehicle Unavailable");
        }
        public void selectVehicle(){
            System.out.println("Select the vehicle type");
            System.out.println("1.Car\n2.Bus\n3.Train");
        }
}
