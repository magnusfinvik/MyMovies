package Interfaces;

import java.util.List;

import business.MyMovie;

public interface FileMediatorInterface {
	void storeMoviesAsFavorite(MyMovie movie);
	List<String> getFavoriteIds();
}
