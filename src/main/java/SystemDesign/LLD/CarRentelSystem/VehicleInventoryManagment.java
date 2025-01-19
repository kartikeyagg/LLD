package SystemDesign.LLD.CarRentelSystem;

import java.util.HashMap;

public class VehicleInventoryManagment {

	HashMap<Integer, Vehicle> vehicleMap;

	public VehicleInventoryManagment() {
		this.vehicleMap = new HashMap<Integer, Vehicle>();
	}
	public void addVehicle(Vehicle v) {
		vehicleMap.put(v.getId(), v);
	}

	public void getVehicle(int id) {
		vehicleMap.get(id);
	}
	
	public void removeVehicle(int id) {
		vehicleMap.remove(id) ;
	}

}
