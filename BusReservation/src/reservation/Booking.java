package reservation;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Booking {

	String passengerName;
	int busNo;
	Date date;
	Booking(){
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter name of passenger :...");
		passengerName =s.next();
		System.out.println("Enter bus no:...");
		busNo=s.nextInt();
		System.out.println("Enter date dd-mm-yyyy");
		String dateInput=s.next();
		SimpleDateFormat dateFormate=new SimpleDateFormat("dd-mm-yyyy");
		
		try {
			date =dateFormate.parse(dateInput);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public boolean isAvailable(ArrayList<Booking> bookings,ArrayList<Bus> Buses) {
		int capacity=0;
		int booked=0;
		for(Bus bus:Buses) {
			if(bus.getBusno()== busNo) {
				capacity= bus.getCapacity();
			}
			for(Booking b:bookings) {
				if(b.busNo==busNo && b.date.equals(date)) {
					booked++;
				}
			}
		
		}
		return booked<capacity?true:false; 
		
	}
	
}
 