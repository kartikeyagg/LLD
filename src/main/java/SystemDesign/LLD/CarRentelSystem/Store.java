package SystemDesign.LLD.CarRentelSystem;

import java.util.ArrayList;

public class Store {
	
	private int storeId; 
	private VehicleInventoryManagment vehicleInventoryManagment;
	private Location location;
	private ArrayList<Reservation> reservationArr;

	public Store(int storeId, VehicleInventoryManagment vehicleInventoryManagment, Location location) {
		this.storeId = storeId;
		this.vehicleInventoryManagment = vehicleInventoryManagment;
		this.location = location;
		this.reservationArr = new ArrayList<>();
	}

	public int getStoreId() {
		return storeId;
	}

	public VehicleInventoryManagment getVehicleInventoryManagment() {
		return vehicleInventoryManagment;
	}

	public Location getLocation() {
		return location;
	}

	public ArrayList<Reservation> getArr() {
		return reservationArr; 
	}

	public void book(Reservation b) {
		// TODO Auto-generated method stub
		
		this.reservationArr.add(b) ;
	}

}















