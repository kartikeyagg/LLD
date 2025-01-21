package SystemDesign.LLD.CarRentelSystem;

import java.util.HashSet;

public class VehicalRentalLauncher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		VehicleRentalSystem vs = new VehicleRentalSystem() ;
		
		Vehicle v1 =  new Vehicle(0, "DL54E6353", 5600, Status.Active ,10) ;
		Vehicle v2 = new Vehicle(1, "HR4Y0943", 300, Status.Active, 25) ;
		Vehicle v3 = new Vehicle(2, "RJ3C4063", 1900, Status.Active, 20) ;
		
		
		
		
//		Store s1 = new Store(0, null, null) 
		
		System.out.println("book Vehicle ? select city"); 
		HashSet<String> cities =  vs.getCities() ;
		for(String s: cities) {
			System.out.println(s);
		}
		
		

	}

}
