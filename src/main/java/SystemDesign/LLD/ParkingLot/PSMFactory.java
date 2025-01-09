package SystemDesign.LLD.ParkingLot;

import java.util.ArrayList;

public class PSMFactory {

	private ParkingSlotManager FourVehicle;
	private ParkingSlotManager TwoVehicleManager;

	private static PSMFactory psmFacotry;

	public static PSMFactory getInstance() {

		if (psmFacotry == null) {
			psmFacotry = new PSMFactory();
		}

		return psmFacotry;
	}

	private PSMFactory() {

		// we can read from a file here ;
		ArrayList<ParkingSpot> fourWheelerPS =  new ArrayList<ParkingSpot>();
		ArrayList<ParkingSpot> TwowheellerPS =  new ArrayList<ParkingSpot>(); 
		
		int count =0 ;
		
		for(int i =0 ; i< 20 ; i++) {
			fourWheelerPS.add(new ParkingSpot(count++)) ; 
			TwowheellerPS.add(new ParkingSpot(count++)) ; 
		}
		
		FourVehicle = new FourWheelerPSM(fourWheelerPS);
		TwoVehicleManager = new TwoWheelerPSM(TwowheellerPS);

	}

	public ParkingSlotManager getPSM(VehicleType vt) {

		switch (vt) {
		case TwoWheeler: {
			return this.TwoVehicleManager;
		}
		case FourWheeler : {
			return this.FourVehicle ;
		}
		default:
			return null ;
		}
		
	}
	

}



















