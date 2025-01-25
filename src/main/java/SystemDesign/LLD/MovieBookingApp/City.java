package SystemDesign.LLD.MovieBookingApp;

import java.util.HashMap;

public class City {
	
	private HashMap<Integer, Movie> movieMap ;
	
	String name;

	public City(String name) {
		this.name = name;
		this.movieMap = new HashMap<Integer, Movie>() ;
	}

	public String getName() {
		return name;
	}
	
	
	public Movie getMovie(int id) {
		
		return this.movieMap.get(id) ;
	}
	
	
	
	
	
	
	

}
