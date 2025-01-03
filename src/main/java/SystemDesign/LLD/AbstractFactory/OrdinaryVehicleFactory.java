package SystemDesign.LLD.AbstractFactory;

public class OrdinaryVehicleFactory implements VehicleFactory{

	@Override
	public Vehicle getVehicle(String vehicle) {
		
		switch (vehicle) {
		case "Accord": {
			
			return new Accord();
		}
		default:
			return null;
		}
		
	}
	
	

}
