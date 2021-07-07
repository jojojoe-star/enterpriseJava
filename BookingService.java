package ie.nuig.cs.ct545rest;

import java.util.ArrayList;

import jakarta.inject.Singleton;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.DELETE;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.PUT;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import jakarta.ws.rs.core.Response.Status;


@jakarta.ws.rs.Path("/bookingservice")
@Singleton
public class BookingService {
/*this assignment is extremely hard for me because at first I keep getting 404 error from tomcat
 * here is some note for myself
 * 1. localhost port is occupied: reinstall tomcat and make sure all past set removed
 * 2. because when I re-do all the setting, the newest Archetype Version is 3.0.2 instead of 3.0.1
 * 	have to add jersey-media-json-jackson dependency to avoid 405 and 500 error
 */
	
Bookings list;
//data entry
	public BookingService() {
		Vehicle v1 = new Vehicle("TEAPIE","JEEP","black");
		Customer c1 = new Customer("Alex","Lee","725 Jersey st Harrison NJ");
		Vehicle v2 = new Vehicle("LEGAL","TOYOTA","white");
		Customer c2 = new Customer("Alice","Kelly","233 1st ave Harrison NY");
		list = new Bookings();
		list.setBookingList(new ArrayList<Booking>());
		list.getBookingList().add(new Booking(1, v1, c1 ,"2020-09-10", "2020-09-11"));
		list.getBookingList().add(new Booking(2, v2, c2 ,"2020-09-13", "2020-09-14"));
		
	}
	
//read all bookings request	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Bookings getAllBookings() 
	{
		return list;
	}

//create new booking request 
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Booking addBooking(Booking b) 
	{
		list.getBookingList().add(b);
		return b;
	}
	
//read a booking by id request		
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/{id}")
	public Response getBooking(@PathParam("id") int id) 
	{
		for(Booking b: list.getBookingList()) {
			if(b.getId() == id) {
				return Response.ok(b).build();
			}
		}		
		return Response.status(Status.NOT_FOUND).build();
	}
	
//update a booking by id request	
	@PUT
	@Path("/{id}")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response updateBookingbyID( @PathParam("id") int id, Booking b) 
	{
		
		Booking updatedBooking = new Booking();
	    
	    updatedBooking.setId(id);
	    updatedBooking.setVehicle(b.getVehicle());
	    updatedBooking.setCustomer(b.getCustomer());
	    updatedBooking.setStartDate(b.getStartDate());
	    updatedBooking.setEndDate(b.getEndDate());
	    
	   return Response.status(200).entity(updatedBooking).build();
	}
	
	
	
//delete a booking by id request		
	@DELETE
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/{id}")
	public Response deleteBooking(@PathParam("id") int id) 
	{
		for(Booking b: list.getBookingList()) {
			if(b.getId() == id) {
				list.getBookingList().remove(b);
				return Response.status(200).build();
			}
		}
		return Response.status(Status.NOT_FOUND).build();
    }
	
}

