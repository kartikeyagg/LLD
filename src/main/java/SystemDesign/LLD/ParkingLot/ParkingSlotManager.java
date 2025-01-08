package SystemDesign.LLD.ParkingLot;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public abstract class ParkingSlotManager {
	
	private HashMap<Integer, ParkingSpot> idToParkingSpot;

	public ParkingSlotManager( ArrayList<ParkingSpot> spotList ) {
		this.idToParkingSpot = new HashMap<Integer, ParkingSpot>();
		for(ParkingSpot ps : spotList) {
			
			idToParkingSpot.put(ps.getId(), ps); 
			
		}
		
	}
	
	public ParkingSpot findParkingSpace() {
		
		Iterator<Map.Entry<Integer, ParkingSpot>> itr;
		
		  for (Map.Entry<Integer, ParkingSpot> entry : idToParkingSpot.entrySet()) {
	            if(entry.getValue().isEmpty() ) {
	            	return entry.getValue() ; 
	            }
	        }
		
		return null ;
		
	}
	
	public void parkVehicle( Vehicle vehicle, ParkingSpot ps  ) {
		
		ps.parkVehicle(vehicle);
		
	}
	
	public void unparkVehicle(ParkingSpot ps  ) {
		
		ps.unparkVehicle(); 
		
	}
	
	
	

}
