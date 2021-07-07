
package ie.nuig.cs.ct545rest;


public class Vehicle {

	public String registration;
	public String manufacturer;
	public String color;
	
	//getters and setters
	public String getRegistration() {
		return registration;
	}

	public void setRegistration(String registration) {
		this.registration = registration;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	//constructors
	public Vehicle() {
		
	}
	
	public Vehicle(String registration, String manufacturer, String color) {
	this.registration = registration;
	this.manufacturer = manufacturer;
	this.color = color;
	
	}


}


