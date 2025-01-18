package SystemDesign.LLD.LiftSystem;

import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;

public class ElevatorController {
	
	private ElevatorCart elevator ;
	
	private PriorityQueue<Integer> maxHeap; 
	private PriorityQueue<Integer> minHeap ;
	
	private ArrayList<Integer > reqList;
	
	// there should be a list of floor which will be updated at every time the direction changes;
	
	public ElevatorController(ElevatorCart elevator) {
		this.elevator = elevator;
		this.maxHeap =  new PriorityQueue<>(Collections.reverseOrder());
		this.minHeap = new PriorityQueue<>();
		reqList = new ArrayList<>() ;
	}

	public void acceptRequest(int floor) { // from internal button 
		// TODO Auto-generated method stub
		
		if( elevator.getDir().equals(Direction.DOWN)) {
			
			if(floor < elevator.getFloor()) {
				
				maxHeap.add(floor) ;
				
			}
			else {
				reqList.add(floor) ;
			}
			
		}
		else {
			
			if(floor> elevator.getFloor()) {
				
				minHeap.add(floor) ;
				
			}
			else {
				reqList.add(floor) ;
			}
			
		}
		
		
		
	}
	
	public void acceptRequest(int floor, Direction dir) { // from external button
		
		
	}

}





































