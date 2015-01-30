package tests;

import static org.junit.Assert.*;
import it.jtomato.gson.Rating;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import business.Movie;

public class TestsMovie {

	@Test
	public void getTitle_GetsCorrectTitle() {
		it.jtomato.gson.Movie m = new it.jtomato.gson.Movie();
		m.title = "Pelle";
		Movie movie = new Movie(m);
		assertEquals("Pelle", movie.getTitle());		
	}
	
	@Test
	public void getId_getsCorrectId() {
		it.jtomato.gson.Movie m = new it.jtomato.gson.Movie();
		m.id = "123";
		Movie movie = new Movie(m);
		assertEquals("123", movie.getId());		
	}
	@Test
	public void getYear_getsCorrectYear() {
		it.jtomato.gson.Movie m = new it.jtomato.gson.Movie();
		m.year = "2013";
		Movie movie = new Movie(m);
		assertEquals("2013", movie.getYear());
	}
	@Test
	public void getSynopsis_getCorrectSynopsis() {
		it.jtomato.gson.Movie m = new it.jtomato.gson.Movie();
		m.synopsis = "In a land far far away, there was a man like no other!";
		Movie movie = new Movie(m);
		assertEquals("In a land far far away, there was a man like no other!", movie.getSynopsis());
	}
	@Test
	public void getRunTime_getCorrectRunTime() {
		it.jtomato.gson.Movie m = new it.jtomato.gson.Movie();
		m.runtime = "144";
		Movie movie = new Movie(m);
		assertEquals("144", movie.getRuntime());
	}
	@Test
	public void getGenres_getCorrectGenres() {
		it.jtomato.gson.Movie m = new it.jtomato.gson.Movie();
		m.genres = new ArrayList<String>();
		m.genres.add("action");
		m.genres.add("comedy");
		List<String> temp = new ArrayList<>(Arrays.asList("action", "comedy"));
		Movie movie = new Movie(m);
		assertEquals(temp, movie.getGenres());
	}
	@Test
	public void getRating_getCorrectRating() {
		it.jtomato.gson.Movie m = new it.jtomato.gson.Movie();
		m.rating = new Rating();
		m.rating.audienceRating = "Upright";
		m.rating.audienceScore = 89;
		m.rating.criticsRating = "Certified fresh";
		m.rating.criticsScore = 90;
		Movie movie = new Movie(m);
		assertEquals("Upright", movie.getAudienceRating());
		assertEquals(89, movie.getAudienceScore());
		assertEquals("Certified fresh", movie.getCriticsRating());
		assertEquals(90, movie.getCriticsScore());
		
		
	}

}
