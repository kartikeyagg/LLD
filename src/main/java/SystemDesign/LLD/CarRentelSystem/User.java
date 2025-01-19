package SystemDesign.LLD.CarRentelSystem;

public class User {
	
	private int userID;
	private String userName;
	private String DLNumber;
	public User(int userID, String userName, String dLNumber) {
		
		this.userID = userID;
		this.userName = userName;
		DLNumber = dLNumber;
	}
	public int getUserID() {
		return userID;
	}
	public String getUserName() {
		return userName;
	}
	public String getDLNumber() {
		return DLNumber;
	}
	
	
	
	

}
