package SystemDesign.LLD.AbstractFactory;

public class VehicleAbstractFactoryMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		VehicleFactory2 factory2 =  new VehicleFactory2() ;
		
		VehicleFactory luxury  =  factory2.getVehicleFactory("luxury") ;
		VehicleFactory ordinary  =  factory2.getVehicleFactory("ordinary") ;
		
		Vehicle rr =  luxury.getVehicle("RR") ;
		Vehicle accord = ordinary.getVehicle("Accord") ;
		
		rr.drive();
		accord.drive(); 

	}

}
