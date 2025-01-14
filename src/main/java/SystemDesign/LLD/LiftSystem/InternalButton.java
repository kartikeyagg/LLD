package SystemDesign.LLD.LiftSystem;

public class InternalButton {
	
	private ElevatorController controller;
		
	public InternalButton(ElevatorController controller) {
		this.controller = controller ;
	}

	public void submitRequest(int floor) {
		controller.acceptRequest(floor) ;
	}

}
