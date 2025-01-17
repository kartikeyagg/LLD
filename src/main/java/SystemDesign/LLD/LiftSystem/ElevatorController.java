package SystemDesign.LLD.LiftSystem;

import java.util.Collections;
import java.util.PriorityQueue;

public class ElevatorController {
	
	private ElevatorCart elevator ;
	
	private PriorityQueue<Integer> maxHeap; 
	private PriorityQueue<Integer> minHeap ;
	
	// there should be a list of floor which will be updated at every time the direction changes;
	
	public ElevatorController(ElevatorCart elevator) {
		this.elevator = elevator;
		this.maxHeap =  new PriorityQueue<>(Collections.reverseOrder());
		this.minHeap = new PriorityQueue<>();
	}

	public void acceptRequest(int floor) { // from internal button 
		// TODO Auto-generated method stub
		
		if( elevator.getDir().equals(Direction.DOWN)) {
			
			
		}
		
		
		
	}
	
	public void acceptRequest(int floor, Direction dir) { // from external button
		
		
	}

}





































