package SystemDesign.LLD.Observable;

import java.util.ArrayList;

import SystemDesign.LLD.Observable.Observers.ObserverInterface;

public class WeatherObservable implements ObservableInterface {
	
	private ArrayList<ObserverInterface > observerList;
	private int temprature; 
	
	public WeatherObservable() {
		this.observerList = new ArrayList<ObserverInterface>() ;
	}
	@Override
	public void add( ObserverInterface obs ) {
		// TODO Auto-generated method stub
		this.observerList.add(obs) ; 
		
	}


	@Override
	public void remove(ObserverInterface obs) {
		// TODO Auto-generated method stub
		this.observerList.remove(obs);
		
	}

	@Override
	public void notifyObserver() {
		// TODO Auto-generated method stub
		for( ObserverInterface obs : this.observerList) {
			obs.update();
		}
		
	}
	@Override
	public int getData() {
		// TODO Auto-generated method stub
		return this.temprature;
	}
	
	public void setTemp(int temp ) {
		this.temprature = temp ;
		this.notifyObserver();
	}

}
