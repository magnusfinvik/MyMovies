package tests;

import static org.junit.Assert.*;
import it.jtomato.JTomato;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

import business.MyMovie;
import repository.WebRepository;

public class TestsRepository {
	private WebRepository repo;
	private NetHttpClientMockUp httpClient = new NetHttpClientMockUp();
	
	@Before
	public void setUp() throws Exception {		
		repo = new WebRepository(new JTomato("", httpClient));
	}
	
	@Test
	public void getBoxOfficeMovies_ReturnsOneMovie() {
		httpClient.setResponse(JsonResult.jsonBoxOfficeMovies);
		ArrayList<MyMovie> movies = repo.getBoxOfficeMovies(10);
		assertEquals(movies.size(), 1);
		assertEquals("Harry Potter and the Deathly Hallows - Part 2", movies.get(0).getTitle());
	}
	
	@Test
	public void searchMovies_ReturnsOneMovie() {
		httpClient.setResponse(JsonResult.jsonMovieSearch);
		ArrayList<MyMovie> movies = repo.searchMovie("something");
		assertEquals(1, movies.size());		
	}
	
}
