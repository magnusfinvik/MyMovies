package Interfaces;

import java.util.List;

import business.Movie;

public interface FileMediatorInterface {
	void storeMoviesAsFavorite(Movie movie);
	List<String> getFavoriteIds();
}
