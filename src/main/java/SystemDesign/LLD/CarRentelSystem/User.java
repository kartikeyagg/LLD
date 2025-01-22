package SystemDesign.LLD.CarRentelSystem;

import java.util.HashMap;

public class User {
	
	private int userID;
	private String userName;
	private String DLNumber;
	private HashMap<Integer, Reservation> reservationMap ;
	public User(int userID, String userName, String dLNumber) {
		this.userID = userID;
		this.userName = userName;
		DLNumber = dLNumber;
		reservationMap = new HashMap<Integer, Reservation>(); 
	}
	public int getUserID() {
		return userID;
	}
	public String getUserName() {
		return userName;
	}
	public String getDLNumber() {
		return DLNumber;
	}
	public void book(Reservation b) {
		// TODO Auto-generated method stub
		this.reservationMap.put(b.getReservationID(), b) ;
	}
	
	
	
	

}
