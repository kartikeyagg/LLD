package SystemDesign.LLD.Observable;

public interface ObservableInterface {
	
	public void add( ObserverInterface obs ) ;
	public void remove(ObserverInterface obs); 
	public void notifyObserver() ;
	public int getData();
	

}
