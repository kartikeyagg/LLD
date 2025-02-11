package SystemDesign.LLD.Memento.Configuration;

import java.util.ArrayList;
import java.util.List;

public class ConfigurationCareTaker {
	
	List<ConfigurationMemento>  history =  new ArrayList<>() ;
	public void addMemento(ConfigurationMemento memento) {
		history.add(memento) ;
	}
	
	public ConfigurationMemento undo() {
		if(!history.isEmpty()) {
			
			int ind = history.size() - 1;
			
			ConfigurationMemento lastMemento = history.get(ind) ;
			
			history.remove(ind) ;
			
			return lastMemento; 
			
		}
		
		return null;	
		
	}

}
