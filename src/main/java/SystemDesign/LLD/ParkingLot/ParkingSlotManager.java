package SystemDesign.LLD.ParkingLot;

import java.util.ArrayList;
import java.util.HashMap;

public abstract class ParkingSlotManager {
	
	private HashMap<Integer, ParkingSpot> idToParkingSpot;

	public ParkingSlotManager( ArrayList<ParkingSpot> spotList ) {
		this.idToParkingSpot = new HashMap<Integer, ParkingSpot>();
		for(ParkingSpot ps : spotList) {
			
			idToParkingSpot.put(ps.getId(), ps); 
			
		}
		
	}
	
	public ParkingSpot findParkingSpace(  ) {
		
		return null ;
		
	}
	
	public void parkVehicle( Vehicle vehicle, ParkingSpot ps  ) {
		
		
	}
	
	public void unparkVehicle(ParkingSpot ps  ) {
		
		
	}
	
	
	

}
