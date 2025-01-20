package SystemDesign.LLD.CarRentelSystem;

import java.util.HashSet;

public class VehicalRentalLauncher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		VehicleRentalSystem vs = new VehicleRentalSystem() ;
		System.out.println("book Vehicle ? select city");
		HashSet<String> cities =  vs.getCities() ;
		for(String s: cities) {
			System.out.println(s);
		}
		
		

	}

}
