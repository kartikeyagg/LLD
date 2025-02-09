package SystemDesign.LLD.Iterator;

import java.util.ArrayList;

public class ListIterator<T> implements IteratorAPI<T> {
	
	private ArrayList<T> arr;
	private int i ;
	
	public ListIterator ( ArrayList<T> arr1   ){
		
		this.arr = arr1;
		this.i = 0  ;
		
	}

	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		
		return i< arr.size() ;
		
	}

	@Override
	public T next() {
		// TODO Auto-generated method stub
		if(this.hasNext()) {
			
			return arr.get(i++) ;
		}
		return null ;
	}

}
