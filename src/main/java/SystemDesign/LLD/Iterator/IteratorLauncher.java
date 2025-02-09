package SystemDesign.LLD.Iterator;

import java.util.ArrayList;

public class IteratorLauncher {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> arr = new ArrayList<Integer>(); 
		arr.add(43) ;
		arr.add(63) ;
		arr.add(03) ;
		
		ListClass<Integer> arrL = new ListClass<Integer>(arr) ;
		
		IteratorAPI<Integer> itr =  arrL.createIterator() ;
		
		while(itr.hasNext()) {
			System.out.println(itr.next()) ;
		}
		
	}
	



} //
