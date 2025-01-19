package SystemDesign.LLD.CarRentelSystem;

import java.sql.Date;

public class Reservation {
	
	private int reservationID; 
	private User user;
	private Vehicle vehicle; 
	private ReservationStatus reservationStatus;
	private Date from ;
	private Date till ;
	public int getReservationID() {
		return reservationID;
	}
	public User getUser() {
		return user;
	}
	public Vehicle getVehicle() {
		return vehicle;
	}
	public ReservationStatus getReservationStatus() {
		return reservationStatus;
	}
	public Date getFrom() {
		return from;
	}
	public Date getTill() {
		return till;
	}
	
	
	

}
