package SystemDesign.LLD.ParkingLot;

public class Vehicle {
	
	private int id  ;
	private VehicleType type;
	private PriceStrategy ps ;
	
	public Vehicle(int id, VehicleType type, PriceStrategy ps) {
		super();
		this.id = id;
		this.type = type;
		this.ps = ps;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	public void setType(VehicleType type) {
		this.type = type;
	}
	public void setPs(PriceStrategy ps) {
		this.ps = ps;
	}
	public int getId() {
		return id;
	}
	public VehicleType getType() {
		return type;
	}
	public PriceStrategy getPs() {
		return ps;
	} 
	
	
	
	

}
