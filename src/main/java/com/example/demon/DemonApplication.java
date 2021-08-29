package com.example.demon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Scanner;

@SpringBootApplication
public class DemonApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemonApplication.class, args);
		ApplicationContext cont=new ClassPathXmlApplicationContext("bean.xml");

		//Scanner sc=new Scanner(System.in);

		User reg=(User)cont.getBean("register");

		/*reg.setUsername(sc.next());
		reg.setId(sc.nextInt());
		reg.setCreditCard(sc.next());
		reg.setPassword(sc.next());*/

		System.out.println(reg.getUsername());
		System.out.println(reg.getCreditCard());
		System.out.println(reg.getId());
		System.out.println(reg.getPassword());

		User login=(User)cont.getBean("login");

		System.out.println(login.getEmail());
		System.out.println(login.getPassword());

		User forgot=(User) cont.getBean("forgotPassword");

		System.out.println(forgot.getEmail());
		forgot.setPassword("12345678");

		System.out.println(forgot.getPassword());

		Vehicle bus=(Bus) cont.getBean("bus");

		bus.setDistance(250);
		System.out.println(bus.getTime());

		Vehicle car=(Car) cont.getBean("car");

		car.setDistance(200);
		System.out.println(car.getTime());

		Vehicle train=(Train) cont.getBean("train");

		train.setDistance(300);
		System.out.println(train.getTime());

		Payment debitCardPayment= (DebitCardPayment) cont.getBean("debitCardPayment");
		debitCardPayment.setCardNumber("12345");
		debitCardPayment.setMonth(9);
		debitCardPayment.setYear(24);
		debitCardPayment.setAmount(300);
		debitCardPayment.setBalance(5000);
		if(debitCardPayment.paymentStatus())
			System.out.println("SUCCESS");
		else
			System.out.println("PaymentFailed");

		Payment creditCardPayment= (CreditCardPayment) cont.getBean("creditCardPayment");
		creditCardPayment.setCardNumber("12345");
		creditCardPayment.setMonth(9);
		creditCardPayment.setYear(24);
		creditCardPayment.setAmount(300);
		creditCardPayment.setBalance(5000);
		if(creditCardPayment.paymentStatus())
			System.out.println("SUCCESS");
		else
			System.out.println("PaymentFailed");

		Travel travel=(Travel) cont.getBean("travel");
		travel.setStartingPoint("Benguluru");
		travel.setDestination("Chennai");
		travel.setDate(31);

		System.out.println(travel.getAvailability());


	}

}
