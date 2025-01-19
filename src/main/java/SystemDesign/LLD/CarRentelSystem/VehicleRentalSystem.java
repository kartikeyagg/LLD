package SystemDesign.LLD.CarRentelSystem;

import java.util.HashMap;

public class VehicleRentalSystem {
	
	
	private HashMap<Integer, User> usersmap;
	private HashMap<Integer, Store> storesMap ;
	
	public VehicleRentalSystem() {
		this.usersmap =  new HashMap<Integer, User>() ; 
		this.storesMap = new HashMap<Integer, Store>();	
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
	

}
