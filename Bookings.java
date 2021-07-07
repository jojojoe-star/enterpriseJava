package ie.nuig.cs.ct545rest;

import java.util.ArrayList;
import java.util.List;

public class Bookings {

	//constructor
	public Bookings() {
		// TODO Auto-generated constructor stub
	}

	List<Booking> bookingList = new ArrayList<Booking>();
	
	//getters and setters
	public List<Booking> getBookingList() {
	        return bookingList;
	    }
	 
	    public void setBookingList(List<Booking> bookingList) {
	        this.bookingList = bookingList;
	    }
}


