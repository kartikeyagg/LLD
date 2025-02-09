package SystemDesign.LLD.Iterator;

import java.util.ArrayList;

public class ListClass<T> implements Aggregator<T> {
	
	private ArrayList<T> arr;
	
	public ListClass(ArrayList<T> arr) {
		super();
		this.arr = arr;
	}

	@Override
	public IteratorAPI<T> createIterator() {
		// TODO Auto-generated method stub
		return new ListIterator<T>(arr)  ;
	}

}
