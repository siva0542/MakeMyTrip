package com.example.makeMyTrip;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Scanner;

@SpringBootApplication
public class MakeMyTripApplication {
	public static void main(String[] args) {
		//SpringApplication.run(MakeMyTripApplication.class, args);

		System.out.println("Welcome to MakeMyTrip Portal.....\n\n");
		System.out.println("Please select any one option:\n1.Register\n2.Login\n3.exit");
		Scanner sc=new Scanner(System.in);
		int choice=sc.nextInt();
		SpringApplication.run(MakeMyTripApplication.class, args);
		ApplicationContext context=new AnnotationConfigApplicationContext(Config.class);
		switch (choice){
			case 1: Register register=(Register) context.getBean("register");
			        register.setRegister();
			        User user=(User) context.getBean("user");
			        user.selectSourceAndDestination();
				int ch=sc.nextInt();
				switch (ch){
					case 1:
						Vehicle car=(Car) context.getBean("car");
						System.out.println("This is the average time to reach your destination without any traffic");
						System.out.println(car.getTime());
						System.out.println("Please press k to book this car");
						String d=sc.next();
						if(d.equals("k")){
							System.out.println("Select the type of card for payment");
							System.out.println("1.Credit Card\n2.Debit Card");
							int a=sc.nextInt();
							switch (a){
								case 1:Payment payment=(CreditCardPayment) context.getBean("creditCardPayment");
									payment.paymentDetails();
									if(payment.paymentStatus()){
										System.out.println("Your request for booking a car is accepted and one of our driver will contact you soon....\nHave a nice ride");
									}
									else{
										System.out.println("Oops....\n your payment has been failed....");
									}
									break;
								case 2:Payment payment1=(DebitCardPayment) context.getBean("debitCardPayment");
									payment1.paymentDetails();
									if(payment1.paymentStatus()){
										System.out.println("Your request for booking a car is accepted and one of our driver will contact you....\nHave a nice ride");
									}
									else{
										System.out.println("Oops....\n your payment has been failed....");
									}
									break;
								default:System.out.println("OOps! You had choosen a wrong option");
							}
						}
						break;
					case 2:Vehicle bus=(Bus) context.getBean("bus");
						System.out.println("This is the average time to reach your destination without any traffic");
						System.out.println(bus.getTime());
						System.out.println("Please press k to book this bus");
						String e=sc.next();
						if(e.equals("k")) {
							System.out.println("Select the type of card for payment");
							System.out.println("1.Credit Card\n2.Debit Card");
							int a = sc.nextInt();
							switch (a) {
								case 1:
									Payment payment = (CreditCardPayment) context.getBean("creditCardPayment");
									payment.paymentDetails();
									if(payment.paymentStatus()){
										System.out.println("Your request for booking a seat on bus is accepted and our Agent will contact you....\nHave a nice ride");
									}
									else{
										System.out.println("Oops....\n your payment has been failed....");
									}
									break;
								case 2:
									Payment payment1 = (DebitCardPayment) context.getBean("debitCardPayment");
									payment1.paymentDetails();
									if(payment1.paymentStatus()){
										System.out.println("Your request for booking a car is accepted and one of our driver will contact you soon....\nHave a nice ride");
									}
									else{
										System.out.println("Oops....\n your payment has been failed....");
									}
								default:System.out.println("OOps! You had choosen a wrong option");
							}
						}
						break;
					case 3:Vehicle train=(Train) context.getBean("train");
						System.out.println("This is the average time to reach your destination without any traffic");
						System.out.println(train.getTime());
						System.out.println("Please press k to book this train");
						String f=sc.next();
						if(f.equals("k")) {
							System.out.println("Select the type of card for payment");
							System.out.println("1.Credit Card\n2.Debit Card");
							int g = sc.nextInt();
							switch (g) {
								case 1:
									Payment payment = (CreditCardPayment) context.getBean("creditCardPayment");
									payment.paymentDetails();
									if(payment.paymentStatus()){
										System.out.println("Your request for booking a seat on Train is accepted and one of our Agent will contact you soon....\nHave a nice ride");
									}
									else{
										System.out.println("Oops....\n your payment has been failed....");
									}
									break;
								case 2:
									Payment payment1 = (DebitCardPayment) context.getBean("debitCardPayment");
									payment1.paymentDetails();
									if(payment1.paymentStatus()){
										System.out.println("Your request for booking a car is accepted and one of our driver will contact you....\nHave a nice ride");
									}
									else{
										System.out.println("Oops....\n your payment has been failed....");
									}
								default:System.out.println("OOps! You had choosen a wrong option");
							}
						}
						break;
					default:System.out.println("There is only car bus and train. We will update the new vehicles in future");
				}
				//}
			break;
			case 2: Login log=(Login) context.getBean("login");
			  //if(log.loginn()) {
				//System.out.println("Login Success");
				User user1 = (User) context.getBean("user");
				user1.selectSourceAndDestination();
				//user1.selectVehicle();
				int ch1=sc.nextInt();
				switch (ch1){
					case 1:
						Vehicle car=(Car) context.getBean("car");
						System.out.println("This is the average time to reach your destination without any traffic");
						System.out.println(car.getTime());
						System.out.println("Please press k to book this car");
						String d=sc.next();
						if(d.equals("k")){
							System.out.println("Select the type of card for payment");
							System.out.println("1.Credit Card\n2.Debit Card");
							int a=sc.nextInt();
							switch (a){
								case 1:Payment payment=(CreditCardPayment) context.getBean("creditCardPayment");
								payment.paymentDetails();
								if(payment.paymentStatus()){
									System.out.println("Your request for booking a car is accepted and one of our driver will contact you soon....\nHave a nice ride");
								}
								else{
									System.out.println("Oops....\n your payment has been failed....");
								}
								break;
								case 2:Payment payment1=(DebitCardPayment) context.getBean("debitCardPayment");
									payment1.paymentDetails();
									if(payment1.paymentStatus()){
										System.out.println("Your request for booking a car is accepted and one of our driver will contact you....\nHave a nice ride");
									}
									else{
										System.out.println("Oops....\n your payment has been failed....");
									}
									break;
								default:System.out.println("OOps! You had choosen a wrong option");
							}
						}
						break;
					case 2:Vehicle bus=(Bus) context.getBean("bus");
						System.out.println("This is the average time to reach your destination without any traffic");
						System.out.println(bus.getTime());
						System.out.println("Please press k to book this bus");
						String e=sc.next();
						if(e.equals("k")) {
							System.out.println("Select the type of card for payment");
							System.out.println("1.Credit Card\n2.Debit Card");
							int a = sc.nextInt();
							switch (a) {
								case 1:
									Payment payment = (CreditCardPayment) context.getBean("creditCardPayment");
									payment.paymentDetails();
									if(payment.paymentStatus()){
										System.out.println("Your request for booking a seat on bus is accepted and our Agent will contact you....\nHave a nice ride");
									}
									else{
										System.out.println("Oops....\n your payment has been failed....");
									}
									break;
								case 2:
									Payment payment1 = (DebitCardPayment) context.getBean("debitCardPayment");
									payment1.paymentDetails();
									if(payment1.paymentStatus()){
										System.out.println("Your request for booking a car is accepted and one of our driver will contact you soon....\nHave a nice ride");
									}
									else{
										System.out.println("Oops....\n your payment has been failed....");
									}
								default:System.out.println("OOps! You had choosen a wrong option");
							}
						}
						break;
					case 3:Vehicle train=(Train) context.getBean("train");
						System.out.println("This is the average time to reach your destination without any traffic");
						System.out.println(train.getTime());
						System.out.println("Please press k to book this train");
						String f=sc.next();
						if(f.equals("k")) {
							System.out.println("Select the type of card for payment");
							System.out.println("1.Credit Card\n2.Debit Card");
							int g = sc.nextInt();
							switch (g) {
								case 1:
									Payment payment = (CreditCardPayment) context.getBean("creditCardPayment");
									payment.paymentDetails();
									if(payment.paymentStatus()){
										System.out.println("Your request for booking a seat on Train is accepted and one of our Agent will contact you soon....\nHave a nice ride");
									}
									else{
										System.out.println("Oops....\n your payment has been failed....");
									}
									break;
								case 2:
									Payment payment1 = (DebitCardPayment) context.getBean("debitCardPayment");
									payment1.paymentDetails();
									if(payment1.paymentStatus()){
										System.out.println("Your request for booking a car is accepted and one of our driver will contact you....\nHave a nice ride");
									}
									else{
										System.out.println("Oops....\n your payment has been failed....");
									}
								default:System.out.println("OOps! You had choosen a wrong option");
							}
						}
						break;
					default:System.out.println("There is only car bus and train. We will update the new vehicles in future");
				}
			//}
			//else
				//System.out.println("Login Failed");
			break;
			case 3:System.out.println("You are successfully exited our application");
			break;
			default: System.out.println("Oops! You had choosen a wrong option");

		}



		/*Payment cr=(CreditCardPayment) context.getBean("creditCardPayment");
		System.out.println(cr.paymentStatus());
		cr.balanceCheck();
		//context.registerShutdownHook();
		Payment cr1=(CreditCardPayment) context.getBean("creditCardPayment");
		cr1.balanceCheck();
		//context.registerShutdownHook();

		Traveller tr=(Traveller) context.getBean("traveller");
		System.out.println(tr.getEmail());


		Car car=(Car) context.getBean("car");
		/*List<String> li=car.getCartype();
		for(String i:li){
			System.out.println(i);
		}
		car.display();

		Train train=(Train) context.getBean("train");
		Set<String> s1=train.getTrainType();
		for(String i:s1){
			System.out.println(i);
		}

		Bus bus=(Bus) context.getBean("bus");
		Map<String,Integer> bus1=bus.getBusDetails();
		for(Map.Entry<String,Integer> i : bus1.entrySet()){
			System.out.println(i.getKey()+" "+i.getValue());
		}*/




		//Scanner sc=new Scanner(System.in);

		/*User reg=(User)cont.getBean("register");

		/*reg.setUsername(sc.next());
		reg.setId(sc.nextInt());
		reg.setCreditCard(sc.next());
		reg.setPassword(sc.next());

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

		System.out.println(travel.getAvailability());*/


	}

}
