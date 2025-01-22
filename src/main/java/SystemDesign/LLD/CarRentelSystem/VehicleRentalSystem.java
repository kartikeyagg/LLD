package SystemDesign.LLD.CarRentelSystem;

import java.sql.Date;
import java.util.HashMap;
import java.util.HashSet;

public class VehicleRentalSystem {
	
	
	private HashMap<Integer, User> usersmap;
	private HashMap<Integer, Store> storesMap ; 
	private HashSet<String> cities ; 
	
	private int reservationID =0 ;
	
	public VehicleRentalSystem() {
		this.usersmap =  new HashMap<Integer, User>() ; 
		this.storesMap = new HashMap<Integer, Store>();	
		this.cities = new HashSet<String>() ;
	}
	
	public void adduser ( User user) {
		this.usersmap.put(user.getUserID(), user);	
	}
	
	public void addStore(Store store) {
		this.storesMap.put(store.getStoreId(), store) ;
	}
	
	public User getUser(int id) {
		return this.usersmap.get(id) ;
	}
	
	public Store getStore(int id) {
		return this.storesMap.get(id) ;
	}
	
	public HashSet<String> getCities() {
		return cities;
	}
	public Reservation bookVehicle(int id, Store store1, User user1, Date d1, int days) {
		// TODO Auto-generated method stub
		Vehicle v = store1.getVehicleInventoryManagment().getVehicle(id);
		Reservation b = v.book(d1, days, this.reservationID++, user1);

		if (b != null) {

			user1.book(b);

			store1.book(b);

		}

		return b;
	}

	public double returnVehicle(Reservation r1) {
		// TODO Auto-generated method stub
		Vehicle v1 =  r1.getVehicle(); 
		double cost  = v1.getCostPerDay() * (r1.getTill().getDate() - r1.getFrom().getDate()) ;
				
		return cost ; 
	}
	
	
	

}

























