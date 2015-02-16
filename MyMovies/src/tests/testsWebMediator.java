package tests;

import static org.junit.Assert.*;
import it.jtomato.JTomato;
import it.jtomato.gson.Movie;
import it.jtomato.gson.Review;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import mediators.WebMediator;

import org.junit.Test;

import business.MyMovie;

public class testsWebMediator {

	@Test
	public void ArrayList_testGetBoxOfficeMovies_numberOfMoives() {
		WebMediator test = new WebMediator();
		assertEquals(4, test.getBoxOfficeMovies(4).size());
	}
	@Test
	public void ArrayList_testSearchMovie_numberOfMovies() {
		WebMediator test = new WebMediator();
		assertEquals(1, test.searchMovie("kingsman").size());
	}
	@Test
	public void ArrayList_testSearchMovie_correctMovieGot() {
		WebMediator test = new WebMediator();
		ArrayList<business.MyMovie> temp = test.searchMovie("kingsman");
		MyMovie check  = temp.get(0);
		assertEquals("Kingsman: The Secret Service", check.getTitle());
	}
	@Test
	public void List_testGetReviews(){
		//må forbedres
		List<Review> temp = null;
		JTomato client = new JTomato("ut2px3dxzsbqa53dyzgghrb3");	
		WebMediator test = new WebMediator();
		Collection<Movie> movie = client.getBoxOfficeMovies("no", 1);
		for (Movie m1 : movie){
			temp = test.getReviews(m1);
		}
		assertEquals(20,temp.size());
	}
}
