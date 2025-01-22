package SystemDesign.LLD.CarRentelSystem;

import java.sql.Date;
import java.util.HashSet;

public class VehicalRentalLauncher {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		VehicleRentalSystem vs = new VehicleRentalSystem() ;
		Date d1 = new Date(2025, 5,4) ;
		Date d2 = new Date(2025, 5,4) ;
		Date d3 = new Date(2025, 5,4) ;
		
		Vehicle v1 =  new Vehicle(0, "DL54E6353", 5600, Status.Active ,10,d1) ;
		Vehicle v2 = new Vehicle(1, "HR4Y0943", 300, Status.Active, 25,d2) ;
		Vehicle v3 = new Vehicle(2, "RJ3C4063", 1900, Status.Active, 20,d3) ;
		
		User user1 = new User(0, "Den", "DL554095820") ;
		
		VehicleInventoryManagment vehicleInventoryManagment  = new VehicleInventoryManagment() ;
		
		vehicleInventoryManagment.addVehicle(v1);
		vehicleInventoryManagment.addVehicle(v2);
		vehicleInventoryManagment.addVehicle(v3);
		
		Location loc = new Location("DELHI", 10045, "B-74,Okhla") ;
		 
		Store store1 = new Store( 0, vehicleInventoryManagment, loc) ;
		
		VehicleRentalSystem rentalSystem = new VehicleRentalSystem() ;
		
		rentalSystem.addStore(store1);
		rentalSystem.adduser(user1);
		
		
		Reservation r1 = rentalSystem.bookVehicle(2, store1, user1, new Date(2025, 9, 3), 2) ;
		
		Thread.sleep(1000);
		
		double cost  = rentalSystem.returnVehicle( r1) ;
		
		
		System.out.println("the cost is " + cost);
		
		

	}

}
