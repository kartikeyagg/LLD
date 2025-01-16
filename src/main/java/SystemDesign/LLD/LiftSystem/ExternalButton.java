package SystemDesign.LLD.LiftSystem;

public class ExternalButton {
	
	private ElevatorController controller; 
	private int currFloor ;
	
	public ExternalButton(ElevatorController controller, int currFloor) {
		this.controller = controller;
		this.currFloor = currFloor; 
	} 
	
	public void submitRequest() {
		
		controller.acceptRequest(currFloor);
		
	}
	

}
