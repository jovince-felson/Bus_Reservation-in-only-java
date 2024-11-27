package reservation;

import java.util.ArrayList;
import java.util.Scanner;

public class busdemo {
	public static void main(String[] args) {
		
		int userOpt =1;
		Scanner scanner =new Scanner(System.in); 
		
		ArrayList<Bus> Buses= new ArrayList<Bus>();
		ArrayList<Booking> bookings =new ArrayList<Booking>();
		Buses.add(new Bus(1,true,2));
		Buses.add(new Bus(2,false,5));
		Buses.add(new Bus(3, true, 2));
		for(Bus b:Buses) {
			b.displayinfo();
		}
	
		while(userOpt==1) {
			
		System.out.println("Enter 1 to book and 2 to exit");
	    userOpt=scanner.nextInt();
	    if(userOpt ==1) {
	    	Booking booking =new Booking();
	    	if(booking.isAvailable(bookings,Buses)) {
	    		bookings.add(booking);
	    		System.out.println("Your booking is Confirmed");
	    	}else {
	    		System.out.println("Sorry .Bus is full");
	    	}
	    	
	    }
		}
	}

}
