package business;

import it.jtomato.gson.Review;

import java.util.List;
import it.jtomato.gson.Movie;
import Interfaces.WebMediatorInterface;
import mediators.WebMediator;

public class MyMovie {
	
	private List<Review> listOfReviewes;
	private WebMediatorInterface webMediator = new WebMediator();
	
	private Movie movie;
	
	public MyMovie(Movie movie) {
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

	public List<String> getGenres() {
		return this.movie.genres;
	}

	public String getAudienceRating() {
		return this.movie.rating.audienceRating;
	}

	public int getAudienceScore() {
		return this.movie.rating.audienceScore;
	}

	public String getCriticsRating() {
		return this.movie.rating.criticsRating;
	}

	public int getCriticsScore() {
		return this.movie.rating.criticsScore;
	}	
}
