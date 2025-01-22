package SystemDesign.LLD.CarRentelSystem;

import java.sql.Date;
import java.util.HashMap;

public class Vehicle {
	
	private int id;
	private String VehicleNumber;
	private int kmDriven;
	private Status status;
	private int costPerDay; 
	private HashMap<Date , Integer > reserverMap ;
	
	public Vehicle(int id, String vehicleNumber, int kmDriver, Status status , int costPerD, Date startDate) {
		this.id = id;
		VehicleNumber = vehicleNumber;
		this.kmDriven = kmDriver;
		this.status = status;
		this.costPerDay =  costPerD;
		this.reserverMap = new HashMap<Date, Integer>() ;
	}

	public int getId() { 
		return id;
	}

	public String getVehicleNumber() {
		return VehicleNumber;
	}

	public int getKmDriven() {
		return kmDriven;
	}

	public Status getStatus() {
		return status;
	}

	public int getCostPerDay() {
		return costPerDay;
	}
	// get reservation id and user here 
	public Reservation book(Date d1, int days , int reservationID, User user1) {
		// TODO Auto-generated method stub
		
		Date d2= d1; // increaese the days here 
		
		return new Reservation(reservationID, user1, this, ReservationStatus.Completed, d1, d2); 
	}
	
	
	
}


















