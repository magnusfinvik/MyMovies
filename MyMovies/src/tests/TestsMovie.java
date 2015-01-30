package tests;

import static org.junit.Assert.*;

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
		m.runtime = "15:40";
		Movie movie = new Movie(m);
		assertEquals("15:40", movie.getRuntime());
	}

}
