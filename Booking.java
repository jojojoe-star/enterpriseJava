package ie.nuig.cs.ct545rest;


public class Booking {

	
	public int id;
	Vehicle vehicle;
	Customer customer;
	public String startDate;
	public String endDate;

	//getters and setters
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Vehicle getVehicle() {
		return vehicle;
	}

	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public String getEndDate() {
		return endDate;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

//constructors
	public Booking(int id, Vehicle vehicle, Customer customer, String startDate, String endDate) {
		this.id=id;
		this.vehicle=vehicle;
		this.customer=customer;
		this.startDate=startDate;
		this.endDate=endDate;
		
	}
	public Booking() {
		// TODO Auto-generated constructor stub
	}

	
	
	
}

