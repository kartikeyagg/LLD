package SystemDesign.LLD.Observable.Observers;

import SystemDesign.LLD.Observable.ObservableInterface;

public class PhoneObserver implements ObserverInterface {
	
	private String mid; 
	private ObservableInterface obs ;
	
	

	public PhoneObserver(String mid, ObservableInterface obs) {
		super();
		this.mid = mid;
		this.obs = obs;
	}



	@Override
	public void update() {
		// TODO Auto-generated method stub
		
		System.out.println("notified for weather on phone " + this.mid);
		System.out.println(obs.getData());
		
	}

}
