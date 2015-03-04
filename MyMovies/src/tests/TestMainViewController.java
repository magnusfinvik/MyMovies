package tests;

import static org.junit.Assert.*;
import it.jtomato.gson.Movie;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

import mediators.FileMediator;
import mediators.WebMediator;

import org.junit.Test;

import repository.WebRepository;
import controller.MainViewController;
import business.MyMovie;
//se om jeg kan forkorte testene og gjøre de mer lesbare, og sjekke om testene går rundt i ring
public class TestMainViewController {
	
	public boolean storeCalled;
	File favorites = new File("favorite.txt");
	@Test
	public void txtFile_testToSeIfAnTxtFileAllredyExist() {
		FileReader readFavorite;
		try {
			readFavorite = new FileReader(favorites);
			assertNotNull(readFavorite);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
	}
	
	@Test
	public void txtFile_AddMoiveToFavoriteTextFile() throws FileNotFoundException{
		FileMediator fileMediator = new FileMediator();
		MainViewController controller = new MainViewController(fileMediator);
		it.jtomato.gson.Movie m = new it.jtomato.gson.Movie();
		m.id = "123";
		MyMovie movie = new MyMovie(m);
		controller.addToFavorite(movie);
		assertEquals(controller.getFavorites().get(0), movie.getId());
		
	}
}
