package SystemDesign.LLD.Strategy;

public class StrategyVehicleMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SportsUtilityvehicle sporty =  new SportsUtilityvehicle() ;
		PassengerVehicle passengerV = new PassengerVehicle()  ;
		OffRoadVehicle thar = new OffRoadVehicle() ;
		
		sporty.drive(); 
		passengerV.drive(); 
		thar.drive() ;

	}

}
