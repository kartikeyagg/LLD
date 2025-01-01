package SystemDesign.LLD.Observable;

public class ObserverMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WeatherObservable weatherObserver  =new WeatherObservable() ;
		
		LaptopObserver lapObserver = new LaptopObserver("msi", weatherObserver) ;
		PhoneObserver phnObserver = new PhoneObserver("apple", weatherObserver) ;
		
		weatherObserver.add(phnObserver);
		weatherObserver.add(lapObserver);
		
		weatherObserver.setTemp(40);
				

	}

}
