package SystemDesign.LLD.CarRentelSystem;

import java.sql.Date;

public class Reservation {
	
	private int reservationID; 
	private User user;
	private Vehicle vehicle; 
	private ReservationStatus reservationStatus;
	private Date from ;
	private Date till ;
	
	
	
	public Reservation(int reservationID, User user, Vehicle vehicle, ReservationStatus reservationStatus, Date from,
			Date till) {
		super();
		this.reservationID = reservationID;
		this.user = user;
		this.vehicle = vehicle;
		this.reservationStatus = reservationStatus;
		this.from = from;
		this.till = till;
	}
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
