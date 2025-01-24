package SystemDesign.LLD.MovieBookingApp;

public class Movie {
	
	
	private int id; 
	private String name;
	private int duration ;// in minutes
	
	public Movie(int id, String name, int duration) {
		super();
		this.id = id;
		this.name = name;
		this.duration = duration;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getDuration() {
		return duration;
	}
	
	
	
	

}
