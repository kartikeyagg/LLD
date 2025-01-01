package SystemDesign.LLD.Observable;

public class LaptopObserver implements ObserverInterface {
	
	private String laptopID; 
	private ObservableInterface obs; 
	
	

	public LaptopObserver(String laptopID, ObservableInterface obs) {
		this.laptopID = laptopID;
		this.obs = obs;
	}



	@Override
	public void update() {
		// TODO Auto-generated method stub
		
		System.out.println("notified for weather on laptop " + this.laptopID);
		System.out.println(obs.getData( ) );
		
		
	}

}
