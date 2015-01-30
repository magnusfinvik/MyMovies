package business;

public class Movie {
	
	private it.jtomato.gson.Movie movie;
	
	public Movie(it.jtomato.gson.Movie movie) {
		this.movie = movie;		
	}
	
	public String getTitle(){
		return this.movie.title;
	}
	
	public String getId(){
		return this.movie.id;
	}

	public String getYear() {		
		return this.movie.year;
	}

	public String getSynopsis() {
		return this.movie.synopsis;
	}

	public String getRuntime() {	
		return this.movie.runtime;
	}	
}
