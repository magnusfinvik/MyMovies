package client;

import java.util.ArrayList;
import business.MyMovie;
import repository.WebRepository;

public class Console {

	public static void main(String[] args) {
		WebRepository repo = new WebRepository();
		ArrayList<MyMovie> movies = repo.getBoxOfficeMovies(3);
		ArrayList<MyMovie> result = repo.searchMovie("Paddington");
		for (MyMovie movie : movies) {
			System.out.println(movie.getId() + ": " + movie.getTitle());
		}
		
		System.out.println(result.size());
	}
}
