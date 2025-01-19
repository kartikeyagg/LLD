package SystemDesign.LLD.CarRentelSystem;

public class Location {
	
	private String city;
	private int pinCode;
	private String StoreAddress;
	
	public Location(String city, int pinCode, String storeAddress) {
		this.city = city;
		this.pinCode = pinCode;
		StoreAddress = storeAddress;
	}
	
	public String getCity() {
		return city;
	}

	public int getPinCode() {
		return pinCode;
	}

	public String getStoreAddress() {
		return StoreAddress;
	}

}
