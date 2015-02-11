package Interfaces;

import it.jtomato.gson.Review;

import java.util.ArrayList;
import java.util.List;

import business.Movie;

public interface WebMediatorInterface {
	
	public abstract ArrayList<business.Movie> getBoxOfficeMovies(int limit);
	
	public abstract ArrayList<business.Movie> searchMovie(String searchString);
	
	public abstract Movie getAdditionalInfo(Movie movie);
	
	public abstract List<Review> getReviews(Movie movie);
}
