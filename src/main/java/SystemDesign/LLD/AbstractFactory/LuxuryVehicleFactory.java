package SystemDesign.LLD.AbstractFactory;

public class LuxuryVehicleFactory implements VehicleFactory{

	@Override
	public Vehicle getVehicle(String vehicle) {
		
		switch (vehicle) {
		case "RR": {
			
			return new RR();
		}
		default:
			return null;
		}
		
	}
	
	

}
